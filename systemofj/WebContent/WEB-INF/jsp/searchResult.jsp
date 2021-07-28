<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

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
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<h1>検索結果</h1>
<!-- <div class="radiobox">
	<input type="radio" id="regist" name="line" onclick="sort(0)">
	<label for="regist">登録順で並び替え</label>

	<input type="radio" id="name" name="line" onclick="sort(1)">
	<label for="name">名前で並び替え</label>

	<input type="radio" id="day" name="line" onclick="sort(2)">
	<label for="day">日付で並び替え</label>
</div> -->
<div class="list_box">
							<input type="hidden" name="z" value="${fn : length(list) }" id="fnsize">

<!-- インターン検索 -->
<c:if test="${mode.equals('intern')}">
				<table border="1" id="myTable">
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
						<c:forEach var="e" items="${list}" varStatus="status">
							<form method="POST" action="/systemofj/Servlet">
						<tr>
							<input type="hidden" name="page_id" value="searchResult" id="alledit">
							<input type="hidden" name="g" value="aj"id="flagedit${status.index}">
							<input type="hidden" name="h" value="cb" id="flagup${status.index}">
							<input type="hidden" name="sId" value="${e.sId }" id="idname${status.index}">
							<input type="hidden" name="sName" value="${e.sName}">
  							<input type="hidden" name="sUnivercity" value="${e.sUnivercity}">

							<td><input type="checkbox" name="check1" class="checkbox_list" id="chId${status.index}" onchange="changeflag('${status.index}')"></td>
							<td>${e.sName }</td>
							<td>${e.sUnivercity }</td>
							<td>${e.sFaculty}</td>
							<td>${e.iCategory}</td>
							<td>${e.iDate}</td>
							<td><input type="submit" name="submit" value="メール送信" ></td>
							<td><input type="submit" name="submit" value="詳細"></td>
						</tr>
						</form>
						</c:forEach>
					</tr>
				</table>
</c:if>
<!-- イベント検索 -->
<c:if test="${mode.equals('event')}">

				<table border="1" id="myTable">
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
					<c:forEach var="e" items="${list}" varStatus="status">
					<form method="POST" action="/systemofj/Servlet">
						<tr>
							<input type="hidden" name="page_id" value="searchResult"id="alledit">
							<input type="hidden" name="e" value="aj"id="flagedit${status.index}">
							<input type="hidden" name="f" value="cb" id="flagup${status.index}">
							<input type="hidden" name="sId" value="${e.sId }" id="idname${status.index}">
							<input type="hidden" name="sName" value="${e.sName}">
  							<input type="hidden" name="sUnivercity" value="${e.sUnivercity}">

							<td><input type="checkbox" name="check1" class="checkbox_list" id="chId${status.index}"onchange="changeflag('${status.index}')"></td>

							<td>${e.sName}</td>
							<td>${e.sUnivercity}</td>
							<td>${e.sFaculty}</td>
							<td>${e.eCategory}</td>
							<td>${e.eDate}</td>
							<td><input type="submit" name="submit" value="メール送信" ></td>
							<td><input type="submit" name="submit" value="詳細"></td>
						</tr>
					</form>
					</c:forEach>
				</table>
</c:if>
<!-- 選考検索 -->

<c:if test="${mode.equals('selection')}">

				<table border="1" id="myTable">
						<tr>
							<th></th>
							<th>名前</th>
							<th>大学名</th>
							<th>学部</th>
							<th>選考状況</th>
							<th>メール</th>
							<th></th>
						</tr>
					<c:forEach var="e" items="${list}" varStatus="status">
					<form method="POST" action="/systemofj/Servlet">
						<tr>
							<input type="hidden" name="page_id" value="searchResult"id="alledit">
							<input type="hidden" name="a" value="aj"id="flagedit${status.index}">
							<input type="hidden" name="b" value="cb" id="flagup${status.index}">
							<input type="hidden" name="sId" value="${e.sId }" id="idname${status.index}">
							<input type="hidden" name="sName" value="${e.sName}">
  							<input type="hidden" name="sUnivercity" value="${e.sUnivercity}">

							<td><input type="checkbox" name="check1" class="checkbox_list" id="chId${status.index}"onchange="changeflag('${status.index}')"></td>
							<td>${e.sName}</td>
							<td>${e.sUnivercity}</td>
							<td>${e.sFaculty}</td>
							<td>${e.seSituation}</td>
							<td><input type="submit" name="submit" value="メール送信" ></td>
							<td><input type="submit" name="submit" value="詳細"></td>
						</tr>
					</form>
					</c:forEach>
				</table>
</c:if>
<!-- 名前検索 -->
<c:if test="${mode.equals('name')}">
			<input type="hidden" name="page_id" value="searchResult"id="alledit">

				<table border="1" id="myTable">
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
				 		<form method="POST" action="/systemofj/Servlet">
							<tr>
							<input type="hidden" name="page_id" value="searchResult"id="alledit">
								<input type="hidden" name="c" value="aj"id="flagedit${status.index}">
								<input type="hidden" name="d" value="cb" id="flagup${status.index}">
								<input type="hidden" name="sId" value="${e.sId }" id="idname${status.index}">
								<input type="hidden" name="sName" value="${e.sName}">
	  							<input type="hidden" name="sUnivercity" value="${e.sUnivercity}">
					 			<td><input type="checkbox" name="check1" class="checkbox_list" id="chId${status.index}"onchange="changeflag('${status.index}','${e.sId }')" value="('${status.index}','${e.sId }')"></td>
								<td>${e.sName}</td>
								<td>${e.sUnivercity}</td>
								<td>${e.sFaculty}</td>
								<td>${e.sDepartment}</td>
								<td>${e.seSituation}</td>
								<td><input type="submit" name="submit" value="メール送信" ></td>
								<td><input type="submit" name="submit" value="詳細"></td>
							</tr>
						</form>

					</c:forEach>
				</table>
</c:if>
<!--<c:if test="${list == null}" >
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
</c:if> -->
</div>
<c:forEach var="list" items="${list}" varStatus="status">
	<input type="hidden" name="SN" value="${list.sId}" id="sn${status.index}">
</c:forEach>

		<input type="checkbox" id="checkbox_all" onclick="change_all()" >
		<label for="checkbox_all" >全選択/解除</label>

	<input type="submit" name="submit" value="一括編集">

</body>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<script>
'use strict';
//ページを読み込んだらflagが1のものを0に戻すメソッド
 window.onload = function(){
	var che = document.getElementById("alledit").value;
	//var edi = 'aj';

	$.ajax({
		type:'post',
		url: '/systemofj/SearchResultTestServlet',
		data:{page_id : che, pageload :'aj' ,submit:''}
	});
}
//checkされたflagを0から1に変更するメソッド
function changeflag(indexNo, sId){
	//チェックボックスの取得
	var che = document.getElementById("alledit").value;
	var ch = document.getElementById('chId'+indexNo);
//	var fe = 'cb';
	var sn = document.getElementById("idname"+indexNo).value;
//検索リストのチェックボックスがチェンジしたボックスだけをajaxで送る
			if(ch.checked){
			$.ajax({
				type:'post',
				url: '/systemofj/SearchResultTestServlet',
				data: {	page_id : che, sId : sn , checkbox: 'cb', submit:''}
			});
			} else{
				$.ajax({
					type:'post',
					url: '/systemofj/SearchResultTestServlet',
					data: {	page_id : che, sId : sn , checkbox: 'ef', submit:''}
				});
			}
}
/*function allchangflag(){
	var che = document.getElementById("alledit").value;
	var ch = document.getElementById('chId'+indexNo);
	var sn = document.getElementById("idname"+indexNo).value;

	for(int i=0; i < list.size(); i++){
		if(ch.checked){
			$.ajax({
				type:'post',
				url: '/systemofj/SearchResultTestServlet',
				data: {	page_id : che, sId : sn , checkbox: 'cb', submit:''}
			});
		} else{
				$.ajax({
					type:'post',
					url: '/systemofj/SearchResultTestServlet',
					data: {	page_id : che, sId : sn , checkbox: 'ef', submit:''}
				});
		}
	}
}*/
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

function change_all(indexNo) {

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
	let count = document.getElementById("fnsize").value;
//	alert(count);
	let SID = '';
//	var sn = document.getElementById("idname"+indexNo).value;

//	var ch = document.getElementById('chId'+indexNo);
//	var sn = document.getElementById("idname"+indexNo).value;

	//チェックが付いたとき
	if(document.getElementById('checkbox_all').checked){
		for(let i=0;i<count;i++){
			SID = document.getElementById('sn'+i).value;
			//alert(IID);
			$.ajax({
				type:'post',
				url: '/systemofj/SearchResultTestServlet',
				data: {	page_id : 'searchResult',  sId : SID , checkbox: 'cb', submit:''}
			});
		}
	//チェックが外されたとき
	}else{
		for(let i=0;i<count;i++){
			SID = document.getElementById('sn'+i).value;
			//alert(IID);
			$.ajax({
				type:'post',
				url: '/systemofj/SearchResultTestServlet',
				data: {	page_id : 'searchResult',  sId : SID , checkbox: 'ef', submit:''}
			});
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