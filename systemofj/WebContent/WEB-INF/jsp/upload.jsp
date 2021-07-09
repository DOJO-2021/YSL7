<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>アップロード</title>
</head>
<body>
	<h1>アップロード</h1>
	<!-- ヘッダー後で追加 -->
	<form action="/systemofj/Servlet.java">
		<input type="radio" name="site" value="s_mynavi" onclick="Hide1()">マイナビ
		<input type="radio" name="site" value="s_rikunavi">リクナビ
		<input type="radio" name="site" value="s_careertasu">キャリタス
		<input type="radio" name="site" value="履歴書">履歴書
		<br>
		<input type="radio" name="event" value="entry" id="event1">エントリー
		<input type="radio" name="event" value="intern" id="event2">インターン
		<input type="radio" name="event" value="infosession" id="event3">会社説明会
		<input type="radio" name="event" value="infosession2" id="event4">合同説明会
		<br>
		<select name="i_category">
			<option value="i_category1">1Day</option>
			<option value="i_category2">3Days</option>
			<option value="i_category3">初級</option>
			<option value="i_category4">中級</option>
			<option value="i_category5">選考準備</option>
			<option value="i_category6">座談会</option>
		</select>
		<input type="date" name="e_date">
		<input type="date" name="i_date">
		<br>
		<input type="file" name="file" accept=".csv">
		<input type="file" name="file" accept=".pdf">
		<input type="submit" name="upload" value="アップロード">
	</form>

	<script>
	'use strict';

	document.getElementById("event1").style.display = "none";

	</script>
</body>
</html>