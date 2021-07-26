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

				<table  class ="float_l">
					<tr><td>　　</td><td>　　</td><td>　　</td></tr>
					<tr>
						<td><a href="/systemofj/Servlet?FLG=upload" class="btn-flat-border">　アップロード　></a></td>
						<td><a href="/systemofj/Servlet?FLG=analysis" class="btn-flat-border">　分析　></a></td>
						<td><a href="/systemofj/Servlet?FLG=search" class="btn-flat-border">　検索　></a></td>
					</tr>
					<tr>
						<td><a href="/systemofj/Servlet?FLG=studentsRegist" class="btn-flat-border">　学生の新規登録　></a></td>
						<td><a href="/systemofj/Servlet?FLG=templateRegist" class="btn-flat-border">　テンプレート登録　></a></td>
						<td><a href="/systemofj/Servlet?FLG=logout" class="btn-flat-border">　ログアウト　></a></td>
					</tr>
				</table>

				<img src="images/account.png"  alt="account" class ="account" >
				<!--${u_name}
				${u_first}-->

			</header>
		</main>

<body>
</body>

<style>

	.float_l{
		float: left;
	}
	.logo{
		width:200px;
		height:139px;
		/*margin-right: 220px;  */
	}

	header{
		background-color: #0096AE85;
		color: #696969;
		height: 180px;
	}

	table{
		text-align: center;
		margin-right: auto;
		margin-left: 130px;
	}

	td{
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
		width:50px;
		height:60px;
		clear: both;
	}

</style>
</html>