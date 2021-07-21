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
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import model.SEvent;
import model.SIntern;
import model.SSelectionFace;
import model.SSelectionText;
import service.UploadService;
@MultipartConfig(location = "C:\\pleiades\\workspace\\YSL7\\systemofj\\WebContent\\uploaded")
public class UploadAction {



		public String upload(HttpServletRequest request, ServletContext context) {

			try {
					
				//ファイルの取得
				request.setCharacterEncoding("UTF-8");
				Part csv = request.getPart("csv");
				//ArrayList<Part> pdf = request.get
	
					//ファイル名を取得
					String fileName = csv.getSubmittedFileName();
					//ファイルの絶対パスを取得
					Path path = Path.of(context.getRealPath(fileName));
	
					csv.write(context.getRealPath(fileName));
	
					Charset charset = StandardCharsets.UTF_8;
	
					//CSV１行分が入る変数
					String line = null;
					//配列を入れるリスト
					ArrayList<ArrayList<String>> listInList = new ArrayList<>();
	
					//insertに必要な情報が入っているリスト
					ArrayList<SEvent> eventList = new ArrayList<>();
					ArrayList<SIntern> internList = new ArrayList<>();
					ArrayList<SSelectionText> textList = new ArrayList<>();
					ArrayList<SSelectionFace> faceList = new ArrayList<>();
					String category = null;
					String event = null;
					String date = null;
	
					//結果を収納するもの
					//String result = "アップロードできませんでした。もう一度アップロードしてください。";
	
					//申込分類を入手する。
					String apply = request.getParameter("site");
	
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
	
	
	
	
						} else if (apply.equals("s_mynavi")) {//マイナビの場合
	
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
								array.add("〇");
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
								array.add(contents[4]);
								array.add(contents[5]);
								array.add(contents[6]);
								array.add(contents[7]);
								array.add(contents[8]);
								array.add(contents[9]);
								array.add(contents[10]);
								array.add("　");
								array.add("　");
								array.add("〇");
								array.add("　");
	
								listInList.add(array);
							}
	
						}
	
						//学生を登録すると同時にすべてインサートする
	
	
						event = request.getParameter("event");
						if (event.equals("entry")) {
	
	
	
							String[] events = {"合説","模擬面接申し込み" ,"模擬面接予約" ,"模擬面接参加" ,"座談会1", "座談会2" };
							for (String i : events) {
								SEvent inEvent = new SEvent();
								inEvent.seteCategory(i);
								inEvent.seteDate("　");
								inEvent.seteId(0);
								eventList.add(inEvent);
							}
	
	
							String[] interns = {"1day","3days" ,"初級" ,"中級" ,"準備" ,"説明会"};
							for (String i : interns) {
								SIntern inIntern = new SIntern();
								inIntern.setiCategory(i);
								inIntern.setiDate("　");
								inIntern.setiMeeting("　");
								inIntern.setiSubmit("　");
								inIntern.setiAcceptance("　");
								inIntern.setiDocument("　");
								inIntern.setiAttend("　");
								inIntern.setApplyflag("　");
								inIntern.setAlleditflag(0);
								internList.add(inIntern);
	
							}
	
	
	
							String[] texts = {"自己PR文","履歴書" ,"書類選考"};
							String[] textNames = {"松野","藤原" ,"板谷" ,"菅澤"};
							for (String i : texts) {
								for (String j : textNames) {
									SSelectionText inText = new SSelectionText();
									inText.setStCategory(i);
									inText.setStName(j);
									inText.setStScore(0);
									inText.setStId(0);
									textList.add(inText);
								}
							}
	
	
	
							String[] faces = {"一次", "二次"};
							String[] names1 = {"松野", "板谷", "菅澤"};
							String[] names2 = {"湯澤", "藤原"};
							for (String i : faces) {
									if (i.equals("一次")) {
										for (String j : names1) {
											SSelectionFace inFace = new SSelectionFace();
											inFace.setSfCategory(i);
											inFace.setSfName(j);
											inFace.setSfScore(0);
											inFace.setSfId(0);
											faceList.add(inFace);
										}
									} else if (i.equals("二次")) {
										for (String j : names2) {
											SSelectionFace inFace = new SSelectionFace();
											inFace.setSfCategory(i);
											inFace.setSfName(j);
											inFace.setSfScore(0);
											inFace.setSfId(0);
											faceList.add(inFace);
										}
									}
							}
	
	
						} else if (event.equals("intern") || event.equals("infosession")) {
							date = request.getParameter("date");
	
	
							String[] events = {"合説","模擬面接申し込み" ,"模擬面接予約" ,"模擬面接参加" ,"座談会1", "座談会2" };
							for (String i : events) {
								SEvent inEvent = new SEvent();
								inEvent.seteCategory(i);
								inEvent.seteDate("　");
								inEvent.seteId(0);
								eventList.add(inEvent);
							}
	
	
							String[] interns = {"1day","3days" ,"初級" ,"中級" ,"準備" ,"説明会"};
							for (String i : interns) {
								SIntern inIntern = new SIntern();
	
								inIntern.setiCategory(i);
	
								if (event.equals("intern")) {
									category = request.getParameter("i_category");
	
	
									if (category.equals(i)) {
										inIntern.setiDate(date);
									} else {
										inIntern.setiDate("　");
									}
								} else if (event.equals("infosession")) {
									if (i.equals("説明会")) {
										inIntern.setiDate(date);
									} else {
										inIntern.setiDate("　");
									}
								}
	
								inIntern.setiMeeting("　");
								inIntern.setiSubmit("　");
								inIntern.setiAcceptance("　");
								inIntern.setiDocument("　");
								inIntern.setiAttend("　");
								inIntern.setApplyflag("　");
								inIntern.setAlleditflag(0);
								internList.add(inIntern);
	
							}
	
	
	
							String[] texts = {"自己PR文","履歴書" ,"書類選考"};
							String[] textNames = {"松野","藤原" ,"板谷" ,"菅澤"};
							for (String i : texts) {
								for (String j : textNames) {
									SSelectionText inText = new SSelectionText();
									inText.setStCategory(i);
									inText.setStName(j);
									inText.setStScore(0);
									inText.setStId(0);
									textList.add(inText);
								}
							}
	
	
	
							String[] faces = {"一次", "二次"};
							String[] names1 = {"松野", "板谷", "菅澤"};
							String[] names2 = {"湯澤", "藤原"};
							for (String i : faces) {
									if (i.equals("一次")) {
										for (String j : names1) {
											SSelectionFace inFace = new SSelectionFace();
											inFace.setSfCategory(i);
											inFace.setSfName(j);
											inFace.setSfScore(0);
											inFace.setSfId(0);
											faceList.add(inFace);
										}
									} else if (i.equals("二次")) {
										for (String j : names2) {
											SSelectionFace inFace = new SSelectionFace();
											inFace.setSfCategory(i);
											inFace.setSfName(j);
											inFace.setSfScore(0);
											inFace.setSfId(0);
											faceList.add(inFace);
										}
									}
							}
	
						} else if (event.equals("infosession2")) {
							date = request.getParameter("date");
	
	
							String[] events = {"合説","模擬面接申し込み" ,"模擬面接予約" ,"模擬面接参加" ,"座談会1", "座談会2" };
							for (String i : events) {
								SEvent inEvent = new SEvent();
								inEvent.seteCategory(i);
								if (i.equals("合説")) {
									inEvent.seteDate(date);
								} else {
									inEvent.seteDate("　");
								}
								inEvent.seteId(0);
								eventList.add(inEvent);
							}
	
	
							String[] interns = {"1day","3days" ,"初級" ,"中級" ,"準備" ,"説明会"};
							for (String i : interns) {
								SIntern inIntern = new SIntern();
								inIntern.setiCategory(i);
								inIntern.setiDate("　");
								inIntern.setiMeeting("　");
								inIntern.setiSubmit("　");
								inIntern.setiAcceptance("　");
								inIntern.setiDocument("　");
								inIntern.setiAttend("　");
								inIntern.setApplyflag("　");
								inIntern.setAlleditflag(0);
								internList.add(inIntern);
	
							}
	
	
	
							String[] texts = {"自己PR文","履歴書" ,"書類選考"};
							String[] textNames = {"松野","藤原" ,"板谷" ,"菅澤"};
							for (String i : texts) {
								for (String j : textNames) {
									SSelectionText inText = new SSelectionText();
									inText.setStCategory(i);
									inText.setStName(j);
									inText.setStScore(0);
									inText.setStId(0);
									textList.add(inText);
								}
							}
	
	
	
							String[] faces = {"一次", "二次"};
							String[] names1 = {"松野", "板谷", "菅澤"};
							String[] names2 = {"湯澤", "藤原"};
							for (String i : faces) {
									if (i.equals("一次")) {
										for (String j : names1) {
											SSelectionFace inFace = new SSelectionFace();
											inFace.setSfCategory(i);
											inFace.setSfName(j);
											inFace.setSfScore(0);
											inFace.setSfId(0);
											faceList.add(inFace);
										}
									} else if (i.equals("二次")) {
										for (String j : names2) {
											SSelectionFace inFace = new SSelectionFace();
											inFace.setSfCategory(i);
											inFace.setSfName(j);
											inFace.setSfScore(0);
											inFace.setSfId(0);
											faceList.add(inFace);
										}
									}
							}
	
						}
	
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
	
	
					UploadService service = new UploadService();
					if (service.insert(listInList, eventList, internList, textList, faceList, event, category, date, apply)) {//登録できた場合
	
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

			request.setAttribute("msg", "どこかのifに入れていないよ！");
			return "/WEB-INF/jsp/upload.jsp";

	}
}
