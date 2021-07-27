<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>アップロード</title>
<style>
.c1 {
	display: block;
}

.c2 {
	display: block;
}
</style>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
	<h1>アップロード</h1>
	${msg}
	<form method="POST" action="/systemofj/Servlet" enctype="multipart/form-data" id="upload">
	<input type="hidden" name="page_id" value="upload">
		<table>
			<tr>
				<td>

						<input type="radio" name="site" value="s_mynavi" onclick="openEvent()">マイナビ
						<input type="radio" name="site" value="s_rikunavi" onclick="openEvent()">リクナビ
						<input type="radio" name="site" value="s_careertasu" onclick="CopenEvent()">キャリタス
						<input type="radio" name="site" value="履歴書" onclick="openPdf()">履歴書

				</td>
			</tr>
			<tr>
				<td>
					<span id="events">
						<input type="radio" name="event" value="entry" onclick="entry()">エントリー
						<input type="radio" name="event" value="intern" checked onclick="intern()">インターン
						<input type="radio" name="event" value="infosession" onclick="info()">会社説明会
					</span>
					<span id="eventsForC">
						<input type="radio" name="event" value="entry" onclick="entry()">エントリー
						<input type="radio" name="event" value="intern" onclick="intern()">インターン
						<input type="radio" name="event" value="infosession" onclick="info()">会社説明会
						<input type="radio" name="event" value="infosession2" onclick="info()">合同説明会
					</span>
				</td>
			</tr>
			<tr>
				<td>
					<div id="interns">
						<select name="i_category">
							<option value="1day">1day</option>
							<option value="3days">3days</option>
							<option value="初級">初級</option>
							<option value="中級">中級</option>
							<option value="準備">選考準備</option>
						</select>
					</div>
				</td>
			</tr>
			<tr>

				<td>
					<div id="date">
					<input type="date" name="date" id="date1">
					</div>
				</td>

			</tr>
			<tr>
				<td>
					<div id="upcsv">
						<input type="file" name="csv" id="file1" accept=".csv">
					</div>
					<div id="uppdf">
						<input type="file" name="pdf" id="file2" accept=".pdf">
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" name="submit" id="button" value="アップロード" onclick="return uploadcheck()" disabled>
				</td>
			</tr>

		</table>
	</form>

	<script>
		'use strict';

		document.getElementById("events").style.display = "none";
		document.getElementById("eventsForC").style.display = "none";
		document.getElementById("interns").style.display = "none";
		document.getElementById("date").style.display = "none";
		document.getElementById("upcsv").style.display = "none";
		document.getElementById("uppdf").style.display = "none";



		var elements = document.getElementById('upload');
		var sites = elements.site;
		var events = elements.event;
		var i_category = elements.i_category;
		var date = elements.date;
		var file1 = elements.csv;
		var file2 = elements.pdf;


		//履歴書の場合

		function openPdf() {

			document.getElementById("events").style.display = "none";
			document.getElementById("eventsForC").style.display = "none";
			document.getElementById("interns").style.display = "none";
			document.getElementById("date").style.display = "none";
			document.getElementById("upcsv").style.display = "none";
			document.getElementById("uppdf").style.display = "";

			for (var event of document.getElementsByName('event')) {
				event.checked = false;
			}

		};

		//キャリタスの場合
		function CopenEvent() {
			document.getElementById("events").style.display = "none";
			document.getElementById("eventsForC").style.display = "";
			document.getElementById("interns").style.display = "none";
			document.getElementById("date").style.display = "none";
			document.getElementById("upcsv").style.display = "none";
			document.getElementById("uppdf").style.display = "none";

			for (var event of document.getElementsByName('event')) {
				event.checked = false;
			}

		};

		//それ以外
		function openEvent() {
			document.getElementById("events").style.display = "";
			document.getElementById("eventsForC").style.display = "none";
			document.getElementById("interns").style.display = "none";
			document.getElementById("date").style.display = "none";
			document.getElementById("upcsv").style.display = "none";
			document.getElementById("uppdf").style.display = "none";

			for (var event of document.getElementsByName('event')) {
				event.checked = false;
			}

		};

		//共通

		//説明会が選択された場合、日付のみを表示する
		function info() {

			document.getElementById("interns").style.display = "none";
			document.getElementById("date").style.display = "";
			document.getElementById("upcsv").style.display = "";
			document.getElementById("uppdf").style.display = "none";

		};

		//エントリーが選択された場合、ファイル選択のみを表示する
		function entry() {

			document.getElementById("interns").style.display = "none";
			document.getElementById("date").style.display = "none";
			document.getElementById("upcsv").style.display = "";
			document.getElementById("uppdf").style.display = "none";

		};

		//インターンが選択された場合、日付とインターンのリストを表示する
		function intern() {

			document.getElementById("interns").style.display = "";
			document.getElementById("date").style.display = "";
			document.getElementById("upcsv").style.display = "";
			document.getElementById("uppdf").style.display = "none";

		};

		//アップロード時に内容確認のダイアログを表示
		function uploadcheck() {
			//サイトごとに分岐
			//マイナビ
			if(sites.value === "s_mynavi") {
				//イベントごとに分岐
				//エントリー
				if(events.value === "entry") {
					if(window.confirm("サイト：マイナビ\nカテゴリー：エントリー\n以上の内容で登録します。よろしいですか？")) {
						//「OK」の時は送信して画面遷移
						return true;
					} else {
						//「キャンセル」の時は画面遷移なし
						return false;
					}
				}
				//インターン
				else if(events.value === "intern") {
					if(window.confirm("サイト：マイナビ\nカテゴリー：インターン\nインターンの種類：" + i_category.value +"\n日付：" + date.value + "\n以上の内容で登録します。よろしいですか？")) {
						//「OK」の時は送信して画面遷移
						return true;
					} else {
						//「キャンセル」の時は画面遷移なし
						return false;
					}
				}
				//会社説明会
				else if(events.value === "infosession") {
					if(window.confirm("サイト：マイナビ\nカテゴリー：会社説明会\n日付：" + date.value + "\n以上の内容で登録します。よろしいですか？")) {
						//「OK」の時は送信して画面遷移
						return true;
					} else {
						//「キャンセル」の時は画面遷移なし
						return false;
					}
				}
			}
			//リクナビ
			else if(sites.value === "s_rikunavi") {
				//イベントごとに分岐
				//エントリー
				if(events.value === "entry") {
					if(window.confirm("サイト：リクナビ\nカテゴリー：エントリー\n以上の内容で登録します。よろしいですか？")) {
						//「OK」の時は送信して画面遷移
						return true;
					} else {
						//「キャンセル」の時は画面遷移なし
						return false;
					}
				}
				//インターン
				else if(events.value === "intern") {
					if(window.confirm("サイト：リクナビ\nカテゴリー：インターン\nインターンの種類：" + i_category.value + "\n日付：" + date.value + "\n以上の内容で登録します。よろしいですか？")) {
						//「OK」の時は送信して画面遷移
						return true;
					} else {
						//「キャンセル」の時は画面遷移なし
						return false;
					}
				}
				//会社説明会
				else {
					if(window.confirm("サイト：リクナビ\nカテゴリー：会社説明会\n日付：" + date.value + "\n以上の内容で登録します。よろしいですか？")) {
						//「OK」の時は送信して画面遷移
						return true;
					} else {
						//「キャンセル」の時は画面遷移なし
						return false;
					}
				}
			}
			//キャリタス
			else if(sites.value === "s_careertasu") {
				//イベントごとに分岐
				//エントリー
				if(events.value === "entry") {
					if(window.confirm("サイト：キャリタス\nカテゴリー：エントリー\n以上の内容で登録します。よろしいですか？")) {
						//「OK」の時は送信して画面遷移
						return true;
					} else {
						//「キャンセル」の時は画面遷移なし
						return false;
					}
				}
				//インターン
				else if(events.value === "intern") {
					if(window.confirm("サイト：キャリタス\nカテゴリー：インターン\nインターンの種類：" + i_category.value + "\n日付：" + date.value + "\n以上の内容で登録します。よろしいですか？")) {
						//「OK」の時は送信して画面遷移
						return true;
					} else {
						//「キャンセル」の時は画面遷移なし
						return false;
					}
				}
				//会社説明会
				else if(events.value === "infosession"){
					if(window.confirm("サイト：キャリタス\nカテゴリー：会社説明会\n日付：" + date.value + "\n以上の内容で登録します。よろしいですか？")) {
						//「OK」の時は送信して画面遷移
						return true;
					} else {
						//「キャンセル」の時は画面遷移なし
						return false;
					}
				}
				//合同説明会
				else {
					if(window.confirm("サイト：キャリタス\nカテゴリー：合同説明会\n日付：" + date.value + "\n以上の内容で登録します。よろしいですか？")) {
						//「OK」の時は送信して画面遷移
						return true;
					} else {
						//「キャンセル」の時は画面遷移なし
						return false;
					}
				}
			}
			//履歴書
			else {
				if(window.confirm("登録します。よろしいですか？")) {
					//「OK」の時は送信して画面遷移
					return true;
				} else {
					//「キャンセル」の時は画面遷移なし
					return false;
				}
			}

		}

		//CSVファイルが選択された時にアップロードボタンを活性化
		file1.addEventListener("change",function() {
			if(file1.files.length > 0) {
				document.getElementById("button").disabled = false;
			}
		},false);

		//PDFファイルが選択された時にアップロードボタンを活性化
		file2.addEventListener("change",function() {
			if(file2.files.length > 0) {
				document.getElementById("button").disabled = false;
			}
		},false);


	</script>
</body>
</html>