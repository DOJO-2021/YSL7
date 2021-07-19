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

	<input type="radio" id="regist" name="line" onclick="sort(0)">
	<label for="lab1">登録順で並び替え</label>

	<input type="radio" id="name" name="line" onclick="sort(1)">
	<label for="lab2">名前で並び替え</label>


	<input type="radio" id="day" name="line" onclick="sort(2)">
	<label for="lab3">日付で並び替え</label>

<div class="list_box">
<!-- インターン検索 -->
<c:if test="${searchInternList.size() != 0} ">
			<form method="POST" action="/systemofj/Servlet">
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
						<c:forEach var="e" items="${searchInternList}">
							<td><input type="checkbox" name="check1" class="checkbox_list"></td>
							<input type ="hidden" name ="s_id" value ="${e.s_id }">
							<td>${e.s_Name }</td>
							<td>${e.s_Univercity }</td>
							<td>${e.s_Faculty}</td>
							<td>${e.i_Category}</td>
							<td>${e.i_Date}</td>
							<td><input type="submit" name="mail" value="メール送信" ></td>
							<td><input type="submit" name="detail" value="詳細ページ"></td>
						</c:forEach>
					</tr>
				</table>
			</form>
</c:if>
<!-- イベント検索 -->
<c:if test="${searchEventList.size() != 0}">
<form method="POST" action="/systemofj/Servlet">
				<table>
						<tr>
							<th></th>
							<th>名前</th>
							<th>大学名</th>
							<th>学部</th>
							<th>参加イベントの種類</th>
							<th>日付</th>
							<th>メール</th>
							<th></th>
						</tr>
					<c:forEach var="e" items="${searchEventList}">
						<tr>
							<td><input type="checkbox" name="check1" class="checkbox_list"></td>
							<td>${e.s_Name}</td>
							<td>${e.s_Univercity}u</td>
							<td>${e.s_Faculty}</td>
							<td>${e.i_Category}</td>
							<td>${e.i_Date}</td>
							<td><input type="submit" name="mail" value="メール送信" ></td>
							<td><input type="submit" name="detail" value="詳細ページ"></td>
						</tr>
					</c:forEach>
				</table>
				</form>
</c:if>
<!-- 選考検索 -->

<c:if test="${searchEntryList.size() != 0}">
<form method="POST" action="/systemofj/Servlet">
				<table>
						<tr>
							<th></th>
							<th>名前</th>
							<th>大学名</th>
							<th>学部</th>
							<th>選考状況</th>
							<th>メール</th>
							<th></th>
						</tr>
					<c:forEach var="e" items="${searchEntryList}">

						<tr>
							<td><input type="checkbox" name="check1" class="checkbox_list"></td>
							<td>${e.s_Name}</td>
							<td>${e.s_Univercity}</td>
							<td>${e.s_Faculty}</td>
							<td>${e.se_Situation}</td>
							<td><input type="submit" name="mail" value="メール送信" ></td>
							<td><input type="submit" name="detail" value="詳細ページ"></td>
						</tr>

					</c:forEach>
				</table>
				</form>
</c:if>
<!-- 名前検索 -->

<c:if test="${searchName.size() != 0}">
<form method="POST" action="/systemofj/Servlet">
				<table>
						<tr>
							<th></th>
							<th>名前</th>
							<th>大学名</th>
							<th>学部</th>
							<th>学科</th>
							<th>選考進捗状況</th>
							<th>メール</th>
							<th></th>
						</tr>
					<c:forEach var="e" items="${searchName}">
						<tr>
							<td><input type="checkbox" name="check1" class="checkbox_list"></td>
							<td>${e.s_Name}</td>
							<td>${e.s_Univercity}</td>
							<td>${e.s_Faculty}</td>
							<td>${e.s_Department}</td>
							<td>${e.se_Situation}</td>
							<td><input type="submit" name="mail" value="メール送信" ></td>
							<td><input type="submit" name="detail" value="詳細ページ"></td>
						</tr>

					</c:forEach>
				</table>
				</form>
</c:if>

</div>
	<label for="selection">
		<input type="checkbox" id="checkbox_all"  >全選択/解除
	</label>
	<input type="submit" name="edit" value="一括編集ページ">

</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script>


function valueChange(id){
	//チェックボックスの取得
	let changecheck= document.getElementByName("check1");
//検索リストのチェックボックスのチェック判定
	for(let i=0; i<elements.length; i++){
		if(changecheck.checked){
			$.ajax({
				type:'post',
				url: '/systemofj/Servlet',
				data: {	int : sId }
			});
			console.log(id);
		}
	}
}
</script>
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

function sort(num) {
	if (num == 0){
		document.getElementById("regist").style.display = "block";
		document.getElementById("name").style.display = "none";
		document.getElementById("day").style.display = "none";
	}
	else if (num ==1){
		document.getElementById("regist").style.display = "none";
		document.getElementById("name").style.display = "block";
		document.getElementById("day").style.display = "none";
	}
	else {
		document.getElementById("regist").style.display = "none";
		document.getElementById("name").style.display = "none";
		document.getElementById("day").style.display = "block";

	}

}
//function allcheck() {
//let checkbox_all= document.getElementById("allselect");
//let checkbox_list= document.querySelectorAll("checkbox");

//checkbox_all.addEventListener('change', allselect);

//}




</script>
</html>