<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<main>
<header>

	<h1>システム名</h1>
	<p>
		<!--${u_name}
		${u_first}-->
	</p>

	<ul>
		<li><a href="/systemofj/Servlet">アップロード</a></li>
		<li><a href="/systemofj/Servlet">メール作成</a></li>
		<li><a href="/systemofj/Servlet">検索</a></li>
		<li><a href="/systemofj/Servlet">分析</a></li>
		<li><a href="/systemofj/Servlet">学生の新規登録</a></li>
		<li><a href="/systemofj/Servlet">テンプレート登録</a></li>
	</ul>

	<hr>

</header>
</main>
<body>

</body>

<style>
	ul{
		list-style: none;
		text-align: right;
		padding-right: 50px;
	}

	li{
		display: inline;
		padding-left:12px;
		}

	table{
		margin-left: 1220px;

		}

	td{

		padding: 1em 2em;
		}
</style>
</html>