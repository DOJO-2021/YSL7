<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>アップロード</title>
<style>
.c1{
	display: block;
}
.c2{
	display: block;
}
</style>
</head>
<body>
	<h1>アップロード</h1>
	<!-- ヘッダー後で追加 -->
	<form action="/systemofj/Servlet.java">
	<div class="c1">
		<input type="radio" name="site" value="s_mynavi" onclick="Hide0()">マイナビ
		<input type="radio" name="site" value="s_rikunavi" onclick="Hide0()">リクナビ
		<input type="radio" name="site" value="s_careertasu" onclick="Hide1()">キャリタス
		<input type="radio" name="site" value="履歴書" onclick="Hide2()">履歴書
	</div>
	<div class="c2" id="d2">

		<div id="event1_1"><input type="radio" name="event" value="entry" id="event1" onclick="Hide3()">エントリー</div>
		<div id="event2_1"><input type="radio" name="event" value="intern" id="event2" onclick="Hide4()">インターン</div>
		<div id="event3_1"><input type="radio" name="event" value="infosession" id="event3" onclick="Hide5()">会社説明会</div>
		<div id="event4_1"><input type="radio" name="event" value="infosession2" id="event4" onclick="Hide5()">合同説明会</div>
	</div>
	<div class="c3" id="d3">
		<select name="i_category">
			<option value="i_category1">1Day</option>
			<option value="i_category2">3Days</option>
			<option value="i_category3">初級</option>
			<option value="i_category4">中級</option>
			<option value="i_category5">選考準備</option>
			<option value="i_category6">座談会</option>
		</select>
	</div>
	<input type="date" name="e_date" id="date1">
	<input type="date" name="i_date" id="date2">

	<input type="file" name="file" accept=".csv" id="file1">
	<input type="file" name="file" accept=".pdf" id="file2">
	<input type="submit" name="upload" value="アップロード">
	</form>

	<script>
	'use strict';

	document.getElementById("d2").style.display = "none";
	document.getElementById("d3").style.display = "none";
	document.getElementById("date1").style.display="none";
	document.getElementById("date2").style.display="none";
	document.getElementById("file2").style.display="none";

	function Hide1() {
		document.getElementById("d2").style.display="";
		document.getElementById("event1_1").style.display="";
		document.getElementById("event2_1").style.display="";
		document.getElementById("event3_1").style.display="";
		document.getElementById("event4_1").style.display="";
		document.getElementById("file1").style.display="";
		document.getElementById("file2").style.display="none";
		console.log("test");
	};
	function Hide2() {
		document.getElementById("d2").style.display="none";
		document.getElementById("d3").style.display="none";
		document.getElementById("date1").style.display="none";
		document.getElementById("date2").style.display="none";
		document.getElementById("file1").style.display="none";
		document.getElementById("file2").style.display="";
		console.log("test");
	};
	function Hide0() {
		document.getElementById("d2").style.display="";
		document.getElementById("event1_1").style.display="";
		document.getElementById("event2_1").style.display="";
		document.getElementById("event3_1").style.display="";
		document.getElementById("event4_1").style.display="none";
		document.getElementById("file1").style.display="";
		document.getElementById("file2").style.display="none";
		console.log("test");
	};

	function Hide3() {
		document.getElementById("d3").style.display="none";
		document.getElementById("date1").style.display="none";
		document.getElementById("date2").style.display="none";
	};
	function Hide4() {
		document.getElementById("d3").style.display="";
		document.getElementById("date1").style.display="none";
		document.getElementById("date2").style.display="";
	};

	function Hide5(){
		document.getElementById("d3").style.display="none";
		document.getElementById("date1").style.display="";
		document.getElementById("date2").style.display="none";
	};


	</script>
</body>
</html>