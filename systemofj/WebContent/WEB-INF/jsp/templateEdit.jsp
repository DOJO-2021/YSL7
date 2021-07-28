<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

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
		margin-left:200px;

		}
		.title{
		margin-left:205px;
	}

	.sub_button {
  line-height:20px;
  position:relative;
  height:27px;
  width:100px;
  font-size:13px;
  text-decoration:none;
  display:block;
  text-align:center;
  padding:0 auto 0 auto;
  color:#0096AE85;
  background-color: #ffffff;
  border-color:#0096AE85
}
.sub_button:hover{
     background-color: #e0ffff;/*ボタン色*/
     border-bottom: solid 2px #00ced1; /*下線色*/
}
.sub_button:active {
     margin-top: 1px;
     -webkit-transform: translateY(0.5px); /*下移動*/
     transform: translateY(0.5px);
}

	.right_button1 {
  line-height:20px;
  position:relative;
  height:30px;
  width:180px;
  font-size:13px;
  text-decoration:none;
  display:block;
  text-align:center;
  padding:0 auto 0 auto;
  color:#0096AE85;
  background-color: #ffffff;
  border-color:#0096AE85
}
.right_button1:hover{
     background-color: #e0ffff;/*ボタン色*/
     border-bottom: solid 2px #00ced1; /*下線色*/
}
.right_button1:active {
     margin-top: 1px;
     -webkit-transform: translateY(0.5px); /*下移動*/
     transform: translateY(0.5px);
}
.right_button2 {
  line-height:20px;
  position:relative;
  height:30px;
  width:180px;
  font-size:13px;
  text-decoration:none;
  display:block;
  text-align:center;
  padding:0 auto 0 auto;
  color:#0096AE85;
  background-color: #ffffff;
  border-color:#0096AE85
}
.right_button2:hover{
     background-color: #e0ffff;/*ボタン色*/
     border-bottom: solid 2px #00ced1; /*下線色*/
}
.right_button2:active {
     margin-top: 1px;
     -webkit-transform: translateY(0.5px); /*下移動*/
     transform: translateY(0.5px);
}
	.right_button3 {
  line-height:20px;
  position:relative;
  height:30px;
  width:180px;
  font-size:13px;
  text-decoration:none;
  display:block;
  text-align:center;
  padding:0 auto 0 auto;
  color:#0096AE85;
  background-color: #ffffff;
  border-color:#0096AE85
}
.right_button3:hover{
     background-color: #e0ffff;/*ボタン色*/
     border-bottom: solid 2px #00ced1; /*下線色*/
}
.right_button3:active {
     margin-top: 1px;
     -webkit-transform: translateY(0.5px); /*下移動*/
     transform: translateY(0.5px);
}

</style>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
	<div class="templatehead">
		<h2 class="inline">テンプレ編集ページ</h2>
		<a href = "/systemofj/Servlet?FLG=templateEdit" class="inline">テンプレ登録ページへ</a>
	</div>
	<br>
	<p class="title">${template.tTitle}</p>
	<form action ="/systemofj/Servlet" method="POST" name ="templateArea" id ="form" onSubmit="return check()">

		<input type="hidden" name="tId" value="${template.tId}">
		<input type="hidden" name="tTitle" value="${template.tTitle}">


		<input type="submit" class="sub_button" name="submit" id="btn" value="テンプレ更新"><br>
		<input type="hidden" name="page_id" value="templateEdit">
			<p id="output" class = "error"></p>

		<textarea name="tContent" id="textarea" maxlength="1000">${requestScope.template.tContent}</textarea>
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


//	function check(){

		function check() {
		    if(document.templateArea.tContent.value == "") {
		        alert("内容を入力してください");
		        return false;
		    }
		}
//		text = document.templateArea.tContent.value;
//		n = text.length;
//		if (n > 1000){
//		document.getElementById('output').textContent ='※1000文字以内で入力してください';
//		}else if (n <= 0){
//		document.getElementById('output').textContent = '※文字を入力してください';


//		}
//	};


//	document.getElementById('form').onsubmit = function(event){
//		text = document.templateArea.textarea.value;
//		n = text.length;
//		if(n > 1000 || n <= 0)
//			event.preventDefault();

//	};


</script>
</html>