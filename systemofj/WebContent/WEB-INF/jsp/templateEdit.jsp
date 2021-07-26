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

	html{}

	div{

		margin-left: 100px;
	}


	textarea{
		width:1000px;
		height:600px;
		float:left;
		margin-bottom: 20px;
		margin-left:200px;
	}
	.inline{
		display:inline-block;
		margin-left: 105px;
	}
	ul{
		margin-top:50px;
		list-style:none;
		float:left;
	}
	li{
		margin-bottom:5px;
	}
	h2{
		margin-right:180px;
		margin-left:50px;
	}

	.sub_button{
	float:right;
	margin-right:300px;
	}

	.right_button1{
		width:170px;
		}

	.right_button2{
		width:170px;
		}
	.right_button3{
		width:170px;
		}

	.title{
		margin-left:50px;
		}
	.error{
		color:#ff0000;
		margin-left:100px;

		}
		.title{
		margin-left:205px;
	}

</style>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
	<div class="templatehead">
		<h2 class="inline">テンプレ編集ページ</h2>
		<!-- <a href = "/systemofj/Servlet?FLG=テンプレ登録ページ" class="inline">テンプレ登録ページへ</a>-->
	</div>
	<br>
	<p class="title">選考準備編セミナー参加のお礼</p>
	<!-- <p>${requestScope.template.t_title}</p>-->
	<form action ="/systemofj/Servlet?FLG=templateUpdate" method="POST" name ="templateArea" id ="form">
		<input type="submit" class="sub_button" name="tu_update_button" value="templateEdit"><br>
		<input type="hidden" name="page_id" value="templateEdit.jsp">
			<p id="output" class = "error"></p>

		<!-- <textarea>${requestScope.template.t_content}</textarea>-->
		<textarea name ="textarea" onChange="check()"></textarea>
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


	function check(){
		text = document.templateArea.textarea.value;
		n = text.length;
		if (n > 1000)
		document.getElementById('output').textContent ='※1000文字以内で入力してください';

	};
	document.getElementById('form').onsubmit = function(event){
		text = document.templateArea.textarea.value;
		n = text.length;
		if(n > 1000)
			event.preventDefault();

	}


</script>
</html>