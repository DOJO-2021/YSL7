<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

 	body{
		text-align: center;
		width: 94em;
		height:1000px;
		}

	textarea{
		margin:20px 0 0 400px;
		width:700px;
		height:600px;
		float:left;
	}

	.inline{
		display:inline-block;
	}

	.sub_button{
		margin-left:43em;
	}
	ul{
		margin-top:50px;
		list-style:none;

	}
	li{
		margin-bottom:5px;
	}
	h2{
		margin-right:300px;
	}

	.right_button1, .right_button2, .right_button3{
		margin-right:180px;
	}

	.right_button3{
		width:137px;
		}

	.sub_button {
	  position: relative;
	  display: inline-block;
	  font-weight: bold;
	  padding: 0.25em 0.5em;
	  text-decoration: none;
	  color: white;
	  background: #00bcd4;
	  transition: .4s;
	  width:140px;
	  height:40px;
	}

	.sub_button:hover {
	  background: #ECECEC;
	  color: #00BCD4;
	}

</style>
</head>

<body>
<header>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
</header>

	<div class="templatehead">
		<h2 class="inline">テンプレート登録ページ</h2>
		<a href = "/systemofj/Servlet?FLG=templateEdit" class="inline">テンプレ選択ページへ</a>
	</div>
	<form action ="/systemofj/Servlet" method="POST" name="form1" onSubmit="return check()">
	<select name="tr_category">
		<option value="">テンプレートのカテゴリを選択</option>
		<option value="説明会">説明会</option>
		<option value="インターン">インターン</option>
		<option value="面接">面接</option>
		<option value="その他">その他</option>
	</select>
	<br><input type="text" name="tr_title" placeholder="タイトル" style="width:202px;"><br>

	<!-- <p>${requestScope.template.t_title}</p>-->
		<input type="submit" class="sub_button" name="submit" value="テンプレ登録"><br>
		<input type="hidden" name="page_id" value="templateRegist">
		<!-- <textarea>${requestScope.template.t_content}</textarea>-->
		<textarea name="tr_content"></textarea>
		<ul>
			<li><button type=button class="right_button1" onclick="return addSname()">学生名前登録ボタン</button></li>
			<li><button type=button class="right_button2" onclick="return addRname()">人事名前登録ボタン</button></li>
			<li><button type=button class="right_button3" onclick="return addUname()">大学名登録ボタン</button></li>
		</ul>
	</form>
</body>
<script>
function addSname(){
	var textarea = document.querySelector('textarea');

	var sentence = textarea.value;
	var len      = sentence.length;
	var pos      = textarea.selectionStart;

	var before   = sentence.substr(0, pos);
	var word     = '\"学生の名前が入ります\"';
	var after    = sentence.substr(pos, len);

	sentence = before + word + after;

	textarea.value = sentence;
	return false;
}
function addRname(){
	var textarea = document.querySelector('textarea');

	var sentence = textarea.value;
	var len      = sentence.length;
	var pos      = textarea.selectionStart;

	var before   = sentence.substr(0, pos);
	var word     = '\"あなたの名前が入ります\"';
	var after    = sentence.substr(pos, len);

	sentence = before + word + after;

	textarea.value = sentence;
	return false;
}
function addUname(){
	var textarea = document.querySelector('textarea');

	var sentence = textarea.value;
	var len      = sentence.length;
	var pos      = textarea.selectionStart;

	var before   = sentence.substr(0, pos);
	var word     = '\"学生の大学名が入ります\"';
	var after    = sentence.substr(pos, len);

	sentence = before + word + after;

	textarea.value = sentence;
	return false;
}


//空欄のまま登録押すとアラート
function check() {
    if(document.form1.tr_title.value == "") {
        alert("タイトルを入力してください");
        return false;
    }
    if(document.form1.tr_content.value == "") {
        alert("内容を入力してください");
        return false;
    }
    if(document.form1.tr_category.value == "") {
        alert("カテゴリーを選択してください");
        return false;
    }
}

</script>
</html>