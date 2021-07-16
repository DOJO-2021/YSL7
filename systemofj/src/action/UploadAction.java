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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

public class UploadAction {


		//ここから下すべて、合ってるのか全然分かりません助けて～
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

				//ファイルを1行ずつ読み込む
				try(BufferedReader br = Files.newBufferedReader(path, charset)){

					//CSV１行分が入る変数
					String line = null;
					//配列を入れるリスト
					ArrayList<String[]> listInList = new ArrayList<>();

					//すべての行を回す
					while((line = br.readLine()) != null) {
						//1行を「,」分割したものを入れる配列
						String[] contents = line.split(",");
					}


				}

				String line;

				while ((line = br.readLine()) != null) {
					String[] data = line.split(",");
				}

				br.close();

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			return page;
	}
}
