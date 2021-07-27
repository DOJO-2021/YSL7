<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>System of J</title>
</head>


		<main>
			<header >
				<!-- YSLのロゴ -->
				<img src="images/logo3.png"  alt="ysl_logo" class="logo float_l">

				<table  class ="table1">
					<tr><td class="td1">　　</td><td class="td1">　　</td><td class="td1">　</td></tr>
					<tr>
						<td class="td1"><a href="/systemofj/Servlet?FLG=top" class="btn-flat-border">　トップページ　></a></td>
						<td class="td1"><a href="/systemofj/Servlet?FLG=upload" class="btn-flat-border">　アップロード　></a></td>
						<td class="td1"><a href="/systemofj/Servlet?FLG=search" class="btn-flat-border">　検索　></a></td>
					</tr>
					<tr>
						<td class="td1"><a href="/systemofj/Servlet?FLG=studentsRegist" class="btn-flat-border">　学生の新規登録　></a></td>
						<td class="td1"><a href="/systemofj/Servlet?FLG=templateRegist" class="btn-flat-border">　テンプレート登録　></a></td>
						<td class="td1"><a href="/systemofj/Servlet?FLG=logout" class="btn-flat-border">　ログアウト　></a></td>
					</tr>
				</table>

				<div>
					<!-- 人型のロゴ -->
					<img src="images/account.png"  alt="account" class ="account" ><br><br>
					<!-- ログインユーザーの名前表示 -->
					${user.uName}　${user.uFirst}
					<br><br><br>
					<!-- <a href="/systemofj/Servlet?FLG=logout" class="logout">ログアウト</a> -->
				</div>

			</header>
		</main>

<body>
</body>

<style>

	header{
		background-color: #0096AE85;
		color: #696969;
		height: 180px;
		width: 95em;
	}


	.logo{
		width:200px;
		height:139px;
			float: left;
		margin:15px 120px 0 30px;
	}

	.table1{
		text-align: center;
		float: left;
		border: 0px none;
	}

	.td1{
		padding: 0.5em 2em;
		border: 0px none;
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

	.account{
		margin-left:70px;
		margin-top:10px;
		width:80px;
		height:80px;
		float: left;
	}


</style>
</html>