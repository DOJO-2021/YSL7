<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>リザルトページ</title>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<br>
<br>

<p class="result">
	<div align="center"><h2><c:out value="${errMsg}"/></h2></div>

<br>

<div align="center"><a href="/systemofj/Servlet?FLG=top">トップページに戻る</a></div>



</html>