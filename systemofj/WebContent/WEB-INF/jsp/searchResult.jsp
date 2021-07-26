<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>searchResult</title>
<!-- ファイル読み込み
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery.tablesorter/2.31.0/css/theme.default.min.css">
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery.tablesorter/2.31.0/js/jquery.tablesorter.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery.tablesorter/2.31.0/js/jquery.tablesorter.widgets.min.js"></script>
--------------------------- -->
</head>
<body>
<h1>検索結果</h1>
<div class="radiobox">
	<input type="radio" id="regist" name="line" onclick="sort(0)">
	<label for="regist">登録順で並び替え</label>

	<input type="radio" id="name" name="line" onclick="sort(1)">
	<label for="name">名前で並び替え</label>

	<input type="radio" id="day" name="line" onclick="sort(2)">
	<label for="day">日付で並び替え</label>
</div>
<div class="list_box">
<!-- インターン検索 -->
<c:if test="${mode.equals('intern')}">
			<form method="POST" action="/systemofj/Servlet">
			<input type="hidden" name="page_id" value="searchResult" id="alledit">
				<table id="myTable">
						<tr>
							<th></th>
							<th>名前</th>
							<th>大学名</th>
							<th>学部</th>
							<th>参加インターンの種類</th>
							<th>日付</th>
							<th>メール</th>
							<th></th>
						</tr>
						<tr>
						<c:forEach var="e" items="${searchInternList}" varStatus="status">
							<td><input type="checkbox" name="check1" class="checkbox_list" id="chId${status.index}" onchange="changeflag('${status.index}')"></td>
							<td><input type="hidden" name="pageload" value="aj"></td>
							<td><input type="hidden" name="checkbox" value="cb"></td>

							<input type ="hidden" name ="s_id" value ="${e.s_id }">
							<td>${e.sName }</td>
							<td>${e.sUnivercity }</td>
							<td>${e.sFaculty}</td>
							<td>${e.iCategory}</td>
							<td>${e.iDate}</td>
							<td><input type="submit" name="submit" value="メール送信" ></td>
							<td><input type="submit" name="submit" value="詳細"></td>
						</c:forEach>
					</tr>
				</table>
			</form>
</c:if>
<!-- イベント検索 -->
<c:if test="${mode.equals('event')}">
<form method="POST" action="/systemofj/Servlet">
			<input type="hidden" name="page_id" value="searchResult"id="alledit">

				<table id="myTable">
						<tr>
							<th></th>
							<th>名前</th>
							<th>大学名</th>
							<th>学部</th>
							<th>参加イベントの種類</th>
							<th>日付</th>
							<th>メール</th>
							<th></th>
						</tr>
					<c:forEach var="e" items="${searchEventList}" varStatus="status">
						<tr>
							<td><input type="checkbox" name="check1" class="checkbox_list" id="chId${status.index}"onchange="changeflag('${status.index}')"></td>
							<td><input type="hidden" name="pageload" value="aj"></td>
							<td><input type="hidden" name="checkbox" value="cb"></td>

							<td>${e.sName}</td>
							<td>${e.sUnivercity}u</td>
							<td>${e.sFaculty}</td>
							<td>${e.iCategory}</td>
							<td>${e.iDate}</td>
							<td><input type="submit" name="submit" value="メール送信" ></td>
							<td><input type="submit" name="submit" value="詳細"></td>
						</tr>
					</c:forEach>
				</table>
				</form>
</c:if>
<!-- 選考検索 -->

<c:if test="${mode.equals('selection')}">
<form method="POST" action="/systemofj/Servlet">
			<input type="hidden" name="page_id" value="searchResult"id="alledit">

				<table id="myTable">
						<tr>
							<th></th>
							<th>名前</th>
							<th>大学名</th>
							<th>学部</th>
							<th>選考状況</th>
							<th>メール</th>
							<th></th>
						</tr>
					<c:forEach var="e" items="${searchEntryList}" varStatus="status">
						<tr>
							<td><input type="checkbox" name="check1" class="checkbox_list" id="chId${status.index}"onchange="changeflag('${status.index}')"></td>
							<td><input type="hidden" name="pageload" value="aj"></td>
							<td><input type="hidden" name="checkbox" value="cb"></td>

							<td>${e.sName}</td>
							<td>${e.sUnivercity}</td>
							<td>${e.sFaculty}</td>
							<td>${e.seSituation}</td>
							<td><input type="submit" name="submit" value="メール送信" ></td>
							<td><input type="submit" name="submit" value="詳細"></td>
						</tr>

					</c:forEach>
				</table>
				</form>
</c:if>
<!-- 名前検索 -->
<c:if test="${mode.equals('name')}">
<form method="POST" action="/systemofj/Servlet">
			<input type="hidden" name="page_id" value="searchResult"id="alledit">

				<table id="myTable">
						<tr>
							<th></th>
							<th>名前</th>
							<th>大学名</th>
							<th>学部</th>
							<th>学科</th>
							<th>選考状況</th>
							<th>メール</th>
							<th></th>
						</tr>
					<c:forEach var="e" items="${list}" varStatus="status">
						<tr>
							<td><input type="checkbox" name="check1" class="checkbox_list" id="chId${status.index}"onchange="changeflag('${status.index}')"></td>
							<td><input type="hidden" name="pageload" value="aj"></td>
							<td><input type="hidden" name="checkbox" value="cb"></td>

							<td><input type="hidden"  value="${e.sId }"></td>
							<td>${e.sName}</td>
							<td>${e.sUnivercity}</td>
							<td>${e.sFaculty}</td>
							<td>${e.sDepartment}</td>
							<td>${e.seSituation}</td>
							<td><input type="submit" name="submit" value="メール送信" ></td>
							<td><input type="submit" name="submit" value="詳細"></td>
						</tr>
					</c:forEach>
				</table>
				</form>
</c:if>
<!--<c:if test="${searchInternList == null} && ${searchEventList == null} && ${searchEntryList == null} && ${searchName == null}">
			<input type="hidden" name="page_id" value="searchResult">

				<table id="myTable">
						<tr>
							<th></th>
							<th>名前</th>
							<th>大学名</th>
							<th>学部</th>
							<th>学科</th>
							<th>選考状況</th>
							<th>メール</th>
							<th></th>
						</tr>
						<tr>
							<td><a href="/systemofj/Servlet?FLG=search">検索</a></td>
						</tr>
				</table>
</c:if>-->
</div>

		<input type="checkbox" id="checkbox_all"  >
		<label for="selection">全選択/解除</label>

	<input type="submit" name="submit" value="編集">

</body>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<script>
'use strict';
//ページを読み込んだらflagが1のものを0に戻すメソッド
window.onload = function flagdelete(indexNo){
	var che = document.getElementById("alledit");
	$.ajax({
		type:'post',
		url: '/systemofj/Servlet',
		data:{str : pageload}
	});
}
//checkされたflagを0から1に変更するメソッド
function changeflag(indexNo){
	//チェックボックスの取得
	var ch = document.getElementById('checkId'+indexNo);
//検索リストのチェックボックスがチェンジしたボックスだけをajaxで送る
			$.ajax({
				type:'post',
				url: '/systemofj/Servlet',
				data: {	int : sId , str: checkbox}
			});
}
</script>

<!-- ソート
<script>
//ページを読み込み後に、ソートを開始
$(document).ready(function(){
	        $("#myTable").tablesorter();
}
</script> --------------------------- -->

<script>
'use strict';

//全選択・解除のチェックボックスのメソッド
let checkbox_all = document.querySelector('#checkbox_all');
//チェックボックスのリスト
let checkbox_list = document.querySelectorAll('.checkbox_list');
//全選択のチェックボックスイベント
checkbox_all.addEventListener('change', change_all);

function change_all() {

	//チェックされているか
	if (checkbox_all.checked) {
		//全て選択
		for (let i in checkbox_list) {
			if (checkbox_list.hasOwnProperty(i)) {
				checkbox_list[i].checked = true;
			}
		}
	} else {
		//全て解除
		for (let i in checkbox_list) {
			if (checkbox_list.hasOwnProperty(i)) {
				checkbox_list[i].checked = false;
			}
		}
	}
};
//function allcheck() {
//let checkbox_all= document.getElementById("allselect");
//let checkbox_list= document.querySelectorAll("checkbox");
//checkbox_all.addEventListener('change', allselect);
//}
</script>
</html>