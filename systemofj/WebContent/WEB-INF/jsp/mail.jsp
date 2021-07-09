<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mail</title>
</head>
<body>
<h1>メール作成</h1>
<div>
<textarea rows="10" cols="20" id="textarea">こんにちは！！わたしです！！</textarea>
<input type="button" name="submit" onclick="cope()" value="一括コピー">
</div>

</body>

<script>
'use script'
function cope(){
	var textarea = document.getElementsById("textarea");
	textarea.select();
	document.execCommand("copy");
	alert("コピーしました");

}
</script>
</html>