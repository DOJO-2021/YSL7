<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mailTemplate</title>
<style>
.mailtitle{
		text-align: center;
		width: 94em;
		height:150px;

}
</style>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<div class="mailtitle">
<h1>メール作成（テンプレ選択）</h1>
<form method="POST" action="/systemofj/Servlet">
	<input type="hidden" name="page_id" value="mailTemplate">
	<input type ="hidden" name ="sName" value ="${param.sName}">
	<input type ="hidden" name ="sUnivercity" value ="${param.sUnivercity}">


	<input type="radio" id="explanation" name="template" onclick="show()" ><label for=explanation>説明会</label>
	<input type="radio" id="intern" name="template" onclick="show()" ><label for=intern>インターン</label>
	<input type="radio" id="face" name="template" onclick="show()" ><label for=face>面接</label>
	<input type="radio" id="other" name="template" onclick="show()" ><label for=other>その他</label><br>
		<div id="explanationtemplate" style="display: none">
					カテゴリを選択してください：
			<select name="kind">
			<!-- 説明会プルダウンメニューの中身 -->
			<c:forEach var="e" items="${event}">
					<option value="${e.tId}"><c:out value="${e.tTitle}"/></option>
			</c:forEach>
						<!-- <option value="">合同説明会のご案内</option>
						<option value="1">合同説明会参加のお礼</option>
						<option value="2">合同説明会当日案内</option>
						<option value="3">会社説明会のご案内</option>
						<option value="4">会社説明会参加のお礼</option>
 						-->
			 </select><br>
			 <input type="submit" name="submit" value="テンプレ使用" onclick="return yesno()">
			 <input type="submit" name="submit" value="テンプレ編集" >
		 </div>
</form>

<form method="POST" action="/systemofj/Servlet">
	<input type="hidden" name="page_id" value="mailTemplate">
	<input type ="hidden" name ="sName" value ="${param.sName}">
	<input type ="hidden" name ="sUnivercity" value ="${param.sUnivercity}">

		<div id="interntemplate" style="display: none">
				カテゴリを選択してください：
			<select name="kind">
				<!-- インターンプルダウンメニューの中身 -->
				<c:forEach var="e" items="${intern}">
					<option value="${e.tId}"><c:out value="${e.tTitle}"/></option>

				</c:forEach>
				<!-- <option value="0">1dayインターンのご案内</option>
						<option value="1">1dayインターン参加のお礼</option>
						<option value="2">1dayインターン当日案内</option>
						<option value="3">3dayインターンのご案内</option>
						<option value="4">3dayインターン参加のお礼</option>
						<option value="5">3dayインターン当日案内</option>
				 -->
			 </select><br>
			 <input type="hidden" name="tId" value="${e.tId}">
			 <input type="submit" name="submit" value="テンプレ使用" onclick="return yesno()" >
			 <input type="submit" name="submit" value="テンプレ編集" >
		</div>
</form>


<form method="POST" action="/systemofj/Servlet">
	<input type="hidden" name="page_id" value="mailTemplate">
	<input type ="hidden" name ="sName" value ="${param.sName}">
	<input type ="hidden" name ="sUnivercity" value ="${param.sUnivercity}">

		<div id="facetemplate" style="display: none">
					カテゴリを選択してください：
			<select name="kind">
				<!-- 面接プルダウンメニューの中身 -->
				<c:forEach var="e" items="${selection}">
					<option value="${e.tId}"><c:out value="${e.tTitle}"/></option>
				</c:forEach>
					<!-- 	<option value="0">面接のご案内</option>
						<option value="1">面接参加のお礼</option>
						<option value="2">面接当日案内</option>
					 -->
			 </select><br>

			 <input type="submit" name="submit" value="テンプレ使用" onclick="return yesno()">
			 <input type="submit" name="submit" value="テンプレ編集" >
		</div>
</form>


<form method="POST" action="/systemofj/Servlet">
	<input type="hidden" name="page_id" value="mailTemplate">
	<input type ="hidden" name ="sName" value ="${param.sName}">
	<input type ="hidden" name ="sUnivercity" value ="${param.sUnivercity}">

		<div id="othertemplate" style="display: none">
				カテゴリを選択してください：
			<select name="kind">
				<!-- その他プルダウンメニューの名身 -->
				<c:forEach var="e" items="${other}">
					<option value="${e.tId}"><c:out value="${e.tTitle}"/></option>
				</c:forEach>
					<!-- 	<option value="0">面接のご案内</option>
						<option value="1">面接参加のお礼</option>
						<option value="2">面接当日案内</option>
					 -->
			 </select><br>
			 <input type="submit" name="submit" value="テンプレ使用" onclick="return yesno()">
			 <input type="submit" name="submit" value="テンプレ編集" >
		</div>
</form>
</div>
</body>

<script>
'use strict';
//radioボタンを選択されたプルダウンを表示させるメソッド
function show(){
	var explanation = document.getElementById("explanation");
	var intern = document.getElementById("intern");
	var face = document.getElementById("face");
	var other = document.getElementById("other");

	explanationtemplate.style.display =explanation.checked ? "block" : "none";
	interntemplate.style.display =intern.checked ? "block" : "none";
	facetemplate.style.display =face.checked ? "block" : "none";
	othertemplate.style.display =other.checked ? "block" : "none";
}
//テンプレを使用するを押されたときにアラートを表示させるメソッド
function yesno(){
	//確認ダイアログを表示
	if(window.confirm('このテンプレを使用してよろしいですか？')){
		//「OK」時は送信実行
		return true;
	}
	//「キャンセル」時
	else {
		window.alert('キャンセルされました。');
		//送信中止
		return false;
	}
}
</script>
</html>