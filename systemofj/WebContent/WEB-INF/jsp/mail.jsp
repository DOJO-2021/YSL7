<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mail</title>
<style>

div{
  margin-left: 100px;
	}

.button {
  	  position: relative;
	  display: inline-block;
	  font-weight: bold;
	  padding: 0.25em 0.5em;
	  text-decoration: none;
	  color: white;
	  background: #00bcd4;
	  transition: .4s;
	  width:140px;
	  height:40px;
}
textarea {
  resize: none;
  width:1000px;
  height:600px;
  font-size: 15px;
}
</style>
</head>

<jsp:include page="/WEB-INF/jsp/header.jsp"/>

<body>
<div class="div">
<h1>メール作成</h1>
	<input type ="hidden" name ="" value ="${searchEventList.get(0).get(sName) }">
	<input type ="hidden" name ="" value ="${searchEventList.get(0).get(sUnivercity) }">

	<textarea rows="10" cols="20" id="text">${template.tContent }</textarea>
	<input type ="button" class="button" value="一括コピー" onclick="return textCopy()">
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