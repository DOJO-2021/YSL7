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
<header> </header>

<p>アップロードが完了しました。</p>

<h1 class="result">
	<c:out value="${result.title}"/>
</h1>

<p class="result">
	<c:out value="${result.message}"/>
</p>


<a href="/systemofj/Servlet">トップページに戻る</a>




</body>
</html>