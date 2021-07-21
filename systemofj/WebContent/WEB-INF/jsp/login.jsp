<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>System of J</title>
</head>
<body>
	<header>

	</header>
		<main>
		<h1 style="text-align:center">ログイン</h1>
			<form method="POST" action="/systemofj/Servlet" id="form">
			<input type = "hidden" name = "page_id" value = "login">
				<table align="center">
					<tr>
						<td align="right">ID：</td>
						<td><input type="text" name="u_id" placeholder="IDを入力してください">
						</td>
					</tr>
					<tr>
						<td align="right">PASSWORD：</td>
						<td><input type="text" name="u_pw" placeholder="PWを入力してください"></td>
					</tr>
					<tr>
						<th colspan="2">
						error1
						</th>
					</tr>
					<tr>
						<th colspan="2">
						<p id=error2></p>
						</th>
					</tr>
					<tr>
						<th colspan="2">
							<input type="submit" name="submit" value="LOGIN" onclick="return checkData()">
						</th>

					</tr>

				</table>

			</form>
		</main>
<script>
'use strict';
function checkData(){
	const u_id = document.getElementById('form').u_id.value;
	const u_pw = document.getElementById('form').u_pw.value;
	if(u_id === "" || u_pw === "") {
		event.preventDefault();
			document.getElementById('error2').textContent='※全て入力してください';
			return false;
	} else {
		return true;
	}
};

</script>
</body>
</html>