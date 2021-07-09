<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mailTemplate</title>
</head>
<body>
<h1>メール作成（テンプレ選択）</h1>
<form method="POST" action="/YSL7/Servlet">
	<input type="radio" id="explanation" name="template" onclick="show()" >説明会
	<input type="radio" id="intern" name="template" onclick="show()" >インターン
	<input type="radio" id="face" name="template" onclick="show()" >面接<br>
		<div id="explanationtemplate" style="display: none">
					カテゴリを選択してください：
			<select name="kind1">
						<option value="0">合同説明会のご案内</option>
						<option value="1">合同説明会参加のお礼</option>
						<option value="2">合同説明会当日案内</option>
						<option value="3">会社説明会のご案内</option>
						<option value="4">会社説明会参加のお礼</option>
			 </select><br>
			 <input type="submit" name="search" value="テンプレ使用" onclick="yesno()">
			 <input type="submit" name="templateedit" value="テンプレ編集" >

		 </div>
		<div id="interntemplate" style="display: none">
					カテゴリを選択してください：
			<select name="kind2">
						<option value="0">1dayインターンのご案内</option>
						<option value="1">1dayインターン参加のお礼</option>
						<option value="2">1dayインターン当日案内</option>
						<option value="3">3dayインターンのご案内</option>
						<option value="4">3dayインターン参加のお礼</option>
						<option value="5">3dayインターン当日案内</option>

			 </select><br>
			 <input type="submit" name="search" value="テンプレ使用"onclick="yesno()" >
			 <input type="submit" name="templateedit" value="テンプレ編集" >

		 </div>
		<div id="facetemplate" style="display: none">
					カテゴリを選択してください：
			<select name="kind3">
						<option value="0">面接のご案内</option>
						<option value="1">面接参加のお礼</option>
						<option value="2">面接当日案内</option>
			 </select><br>
			 <input type="submit" name="search" value="テンプレ使用" onclick="yesno()">
			 <input type="submit" name="templateedit" value="テンプレ編集" >

		</div>
</form>
</body>
<script>
'use strict';
function show(){
	var explanation = document.getElementById("explanation");
	var intern = document.getElementById("intern");
	var face = document.getElementById("face");

	explanationtemplate.style.display =explanation.checked ? "block" : "none";
	interntemplate.style.display =intern.checked ? "block" : "none";
	facetemplate.style.display =face.checked ? "block" : "none";
}
function yesno(){
	if(window.confirm(このテンプレを使用しますか)){
		console.log('yes')
	} else {
		console.log('no')
	}

}

</script>
</html>