<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>top</title>
</head>
<body>

<!-- ボタンの場合 -->
<table align="center">
	<tr align="center">
		<td><input type="button" value="アップロード"></td>
		<td><input type="button" value="検索"></td>
		<td><input type="button" value="テンプレート登録"></td>
	</tr>

	<tr align="center">
		<td><input type="button" value="分析"></td>
		<td><input type="button" value="学生の新規登録"></td>
		<td><input type="button" value="ログアウト" onclick="return onLogout()"></td>
	</tr>
</table>


<!-- リンクの場合 --><br>
<table align="center">
	<tr align="center">
		<td><a href="">アップロード</a></td>
		<td><a href="">検索</a></td>
		<td><a href="">テンプレート登録</a></td>
	</tr>

	<tr align="center">
		<td><a href="">分析</a></td>
		<td><a href="">学生の新規登録</a></td>
		<td><a href="" onclick="return onLogout()">ログアウト</a></td>
	</tr>
</table>

</body>
<script>


function onLogout() {

	if(window.confirm("ログアウトしますか？")){

		//OKのときの処理
		return true;

	}else{
		//キャンセルの時の処理
		return false;
	}

}

</script>
</html>