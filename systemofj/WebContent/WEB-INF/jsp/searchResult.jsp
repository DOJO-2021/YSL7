<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>searchResult</title>
</head>
<body>
<h1>検索結果</h1>
<label for="lab1">
	<input type="radio" id="name" name="line" onclick="sort(0)">名前で並び替え
</label>
<label for="lab2">
	<input type="radio" id="day" name="line" onclick="sort(1)">日付で並び替え
</label>

<div class="list_box">
	<form method="POST" action="/YSL7/Servlet">
				<table>
						<tr>
							<th></th>
							<th>名前</th>
							<th>大学名</th>
							<th>学部</th>
							<th>参加インターンの種類</th>
							<th>日付</th>
							<th>メール</th>
							<th></th>
						</tr>
						<tr>
							<td><input type="checkbox" name="check1" class="checkbox_list"></td>
							<td>name</td>
							<td>daigaku</td>
							<td>gakubu</td>
							<td>sannka</td>
							<td>hiduke</td>
							<td><input type="submit" name="mail" value="メール送信" ></td>
							<td><input type="submit" name="detail" value="詳細ページ"></td>
						</tr>
				</table>
	</form>
</div>
	<label for="selection">
		<input type="checkbox" id="checkbox_all"  >全選択/解除
	</label>
	<input type="submit" name="edit" value="一括編集ページ">

</body>

<script>
//全選択・解除のチェックボックス
let checkbox_all = document.querySelector("#checkbox_all");
//チェックボックスのリスト
let checkbox_list = document.querySelectorAll(".checkbox_list");

//全選択のチェックボックスイベント
checkbox_all.addEventListener('change', change_all);


function change_all() {

	//チェックされているか
	if (checkbox_all.checked) {
		//全て選択
		for (let i in checkbox_list) {
			if (checkbox_list.hasOwnProperty(i)) {
				checkbox_list[i].checked = true;
			}
		}

	} else {
		//全て解除
		for (let i in checkbox_list) {
			if (checkbox_list.hasOwnProperty(i)) {
				checkbox_list[i].checked = false;
			}
		}

	}

};

//function allcheck() {
//let checkbox_all= document.getElementById("allselect");
//let checkbox_list= document.querySelectorAll("checkbox");

//checkbox_all.addEventListener('change', allselect);

//}




</script>
</html>