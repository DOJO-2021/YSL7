<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>System of J</title>
</head>
<main>
<header>



	<h1 class="logo"><img src="images/logo3.png" width="200" height="139" alt="ysl_logo"></a></h1>

	<table>
		<tr><td>　　</td></tr>
		<tr>
			<td><a href="/systemofj/Servlet" class="btn-flat-border">　アップロード　></a></td>
			<td><a href="/systemofj/Servlet" class="btn-flat-border">　分析　></a></td>
			<td><a href="/systemofj/Servlet" class="btn-flat-border">　検索　></a></td>
		</tr>
		<tr>
			<td><a href="/systemofj/Servlet" class="btn-flat-border">　学生の新規登録　></a></td>
			<td><a href="/systemofj/Servlet" class="btn-flat-border">　テンプレート登録　></a></td>
			<td><a href="/systemofj/Servlet" class="btn-flat-border">　ログアウト　></a></td>
		</tr>
	</table>

	<p>
		<img src="images/account.png" width="50" height="60" alt="account">
		<!--${u_name}
		${u_first}-->
	</p>

</header>
</main>
<body>

</body>

<style>


	.logo{
		float: left;
		/*margin-right: 120px;  */

	}

	header{
		background-color: #0096AE85;
		color: #696969;
	}

	table{
		text-align: center;
		margin-right: 3px;
		margin-left: 350px;


	}

	td{
		padding: 1em 2em;
		}

	.btn-flat-border {
		width: 180px;
		height: 25px;
	  	display: inline-block;
		padding: 0.3em 1em;
		text-decoration: none;
		color: #ffffff;
	 	border: solid 2px #ffffff;
		transition: .4s;
	}
	.btn-flat-border:hover {
		background: #ffffff;
		color: #696969;
	}

</style>
</html>