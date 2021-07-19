package action;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import service.UploadService;

public class UploadAction {



		public String upload(HttpServletRequest request, ServletContext context) {

			try {
				//ファイルの取得
				request.setCharacterEncoding("UTF-8");
				Part csv = request.getPart("csv");

				//ファイル名を取得
				String fileName = csv.getSubmittedFileName();
				//ファイルの絶対パスを取得
				Path path = Path.of(context.getRealPath(fileName));
				Charset charset = StandardCharsets.UTF_8;

				//CSV１行分が入る変数
				String line = null;
				//配列を入れるリスト
				ArrayList<ArrayList<String>> listInList = new ArrayList<>();
				//結果を収納するもの
				String result = "アップロードできませんでした。もう一度アップロードしてください。";

				//申込分類を入手する。
				String apply = request.getParameter("apply");

				//ファイルを1行ずつ読み込む
				try(BufferedReader br = Files.newBufferedReader(path, charset)){


					if (apply.equals("s_careertasu")) {//キャリタスの場合
						//すべての行を回す
						while((line = br.readLine()) != null) {
							//1行を「,」分割したものを入れる配列
							String[] contents = line.split(",");

							//arraylistに入れ替える
							//入れ替えるための配列
							ArrayList<String> array = new ArrayList<>();

							array.add(contents[0]);
							array.add(contents[1]);
							array.add(contents[2]);
							array.add(contents[3]);
							array.add(contents[4]);
							array.add(contents[5]);
							array.add(contents[6] + contents[7]);
							array.add(contents[8]);
							array.add(contents[9]);
							array.add("〇");
							array.add("　");
							array.add("　");
							array.add("　");

							listInList.add(array);
						}




					} else if (apply.equals("s_rikunavi")) {//リクナビの場合

						while((line = br.readLine()) != null) {
							//1行を「,」分割したものを入れる配列
							String[] contents = line.split(",");

							//arraylistに入れ替える
							//入れ替えるための配列
							ArrayList<String> array = new ArrayList<>();

							array.add(contents[0] + contents[1]);
							array.add(contents[2] + contents[3]);
							array.add(contents[11]);
							array.add(contents[8]);
							array.add(contents[9]);
							array.add(contents[10]);
							array.add(contents[6] + contents[7]);
							array.add(contents[4]);
							array.add(contents[5]);
							array.add("　");
							array.add("　");
							array.add("〇");
							array.add("　");

							listInList.add(array);
						}

					} else if (apply.equals("s_mynavi")) {//マイナビの場合

						while((line = br.readLine()) != null) {
							//1行を「,」分割したものを入れる配列
							String[] contents = line.split(",");

							//arraylistに入れ替える
							//入れ替えるための配列
							ArrayList<String> array = new ArrayList<>();

							array.add(contents[0] + contents[1]);
							array.add(contents[2] + contents[3]);
							array.add(contents[4]);
							array.add(contents[5]);
							array.add(contents[6]);
							array.add(contents[7]);
							array.add(contents[8]);
							array.add(contents[9]);
							array.add(contents[10]);
							array.add("　");
							array.add("〇");
							array.add("　");
							array.add("　");

							listInList.add(array);
						}

					}

				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

				UploadService service = new UploadService();
				if (service.insert(listInList)) {//登録できた場合

					request.setAttribute("msg", "登録が成功しました");
					return "/WEB-INF/jsp/upload.jsp";

				} else {//登録できなかった場合

					request.setAttribute("msg", "登録が失敗しました。もう一度CSVファイルをアップロードしてください。");
					return "/WEB-INF/jsp/upload.jsp";
				}

			} catch (IOException e) {
				e.printStackTrace();
			} catch (ServletException e) {
				e.printStackTrace();
			}




	}
}
