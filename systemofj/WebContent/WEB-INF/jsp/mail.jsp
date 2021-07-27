<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mail</title>
<style>

textarea {
  resize: none;
  width:1000px;
  height:600px;
  font-size: 15px;
}
</style>
</head>

<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<h1>メール作成</h1>
<body>
<div class="div">
	<input type ="hidden" name ="" value ="${searchEventList.get(0).get(sName) }">
	<input type ="hidden" name ="" value ="${searchEventList.get(0).get(sUnivercity) }">

	<textarea rows="10" cols="20" id="text">${template.tContent }</textarea>
	<input type ="button" value="一括コピー" onclick="return textCopy()">
</div>
</body>

<script >
'use strict';

	function textCopy(){
		 var urltext = document.getElementById("text");
		 urltext.select();
		 document.execCommand("copy");
		 alert("コピーしました");
	}
</script>
</html>