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
				<img src="images/logo3.png"  alt="ysl_logo" class="logo float_l">

				<table  class ="table1">
					<tr><td class="td1">　　</td><td class="td1">　　</td></tr>
					<tr>
						<td class="td1"><a href="/systemofj/Servlet?FLG=upload" class="btn-flat-border">　アップロード　></a></td>
						<td class="td1"><a href="/systemofj/Servlet?FLG=search" class="btn-flat-border">　検索　></a></td>
					</tr>
					<tr>
						<td class="td1"><a href="/systemofj/Servlet?FLG=studentsRegist" class="btn-flat-border">　学生の新規登録　></a></td>
						<td class="td1"><a href="/systemofj/Servlet?FLG=templateRegist" class="btn-flat-border">　テンプレート登録　></a></td>
					</tr>
				</table>

				<div>
					<img src="images/account.png"  alt="account" class ="account" ><br><br>
					${user.uName}　${user.uFirst}
					<br><br><br>
					<a href="/systemofj/Servlet?FLG=logout" class="logout">ログアウト</a>
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
		weight: 95px;
	}


	.logo{
		width:200px;
		height:139px;
			float: left;
		margin:15px 130px 0 30px;
	}

	.table1{
		text-align: center;
		margin-right: 200px;
		margin-left: 120px;
		float: left;
	}

	.td1{
		padding: 0.5em 2em;
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
		margin-top:10px;
		width:80px;
		height:80px;
		float: left;
	}

	.logout{
		margin-left:80px;
	}


</style>
</html>