<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>フィードバック</title>

<style>

.fb-tbl{
	margin:auto;
}

.fb-matome{
	height: 600px;
	width: 800px;
	margin: auto;
}

.fb-select {
	height: 100px;
	width: 800px;
	margin: auto;
}

#tArea{
	height: 500px;
	width: 700px;
}

</style>



</head>
<body>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<p>フィードバックページ</p>
※フィードバック入力後は必ず登録ボタンを押してください


<table style="text-align:center" class="fb-tbl">
	<tr>
		<td>

			<!-- tableの中のtable①（個人FB登録）ここから -->
			<form method="POST" action="/systemofj/Servlet">
				<table border="1" class="fb-tbl">
					<tr>
						<td colspan="3">${fr_errormessage1} ${fr_errormessage2}</td><!-- これの存在している意味が分からないけど消すの怖いから放置しておくｂｙ椹 -->
					</tr>
					<tr>
						<td colspan="2"><input type="text" name="f_name" value="${user.uName}"></td>
						<td>
							<input type="hidden" name="page_id" value="feedback">
							<input type="hidden" name="f_category" value="${param.category}">
							<input type="hidden" name="sId" value="${param.sId}">
							<input type="hidden" name="s_id" value="${param.sId}">

							<input type="submit" name="submit" value="登録ボタン">

						</td>
					</tr>
					<tr>
						<td colspan="3"><textarea name=f_content rows="20" cols="50"></textarea></td>
					</tr>
				</table>
			</form>
			<!-- ここまで -->

		</td>
		<td rowspan="2" >

			<!-- tableの中のtable②（FBまとめ）ここから -->
			<form method="POST" action="/systemofj/Servlet">
				<input type="hidden" name="sId" value="${param.sId}">
				<table border="1" class="fb-select">
					<tr>
						<td>
						<select name="category">
							<option value="1day">インターン1DAY</option>
							<option value="3day">インターン3DAY</option>
							<option value="初級">初級</option>
							<option value="中級">中級</option>
							<option value="模擬面接">模擬面接</option>
							<option value="会社説明会">会社説明会</option>
							<option value="一次面接">一次面接</option>
							<option value="二次面接">二次面接</option>
							<option value="予備">予備</option>
						</select>
						<input type="submit" id="submit" value="検索">
						<input type="hidden" name="page_id" value="feedback">
						</td>
					</tr>
				</table>
			</form>

			<form method="POST" action="/systemofj/Servlet">
				<input type="hidden" name="page_id" value="feedback">
				<input type="hidden" name="f_category" value="${param.category}">
				<input type="hidden" name="sId" value="${param.sId}">
				<input type="hidden" name="s_id" value="${param.sId}">
				<input type="hidden" name="f_name" value="まとめ">

				<table border="1" class="fb-matome">
					<tr>
						<td colspan="3"><textarea name=f_content rows="20" cols="50" id="tArea">${all.fContent}</textarea></td>
					</tr>

					<tr>
						<td id="f_regist_button">
							<input type="button" value="フィードバックまとめを更新">
							<input type="hidden" name="page_id" value="result">
						</td>
						<td id="f_update_button">
							 <input type="submit"  value="フィードバックまとめを登録">
							<input type="hidden" name="page_id" value="result">
						</td>
					</tr>
				</table>
			</form>
			<!-- ここまで -->

		</td>
	</tr>


	<c:forEach items="${list}" var="list">
		<tr>
			<td>
				<!-- tableの中のtable③（FB更新）ここから -->
				<form method="POST" action="/systemofj/Servlet">
					<table border="1" class="fb-tbl">
						<tr>
							<td colspan="3">${fr_errormessage1} ${fr_errormessage2}</td>
						</tr>
						<tr>
							<td colspan="2"><input type="text" name="fName" value="${list.fName}"></td>
							<td>
								<input type="hidden" name="fId" value="${list.fId}">
								<input type="hidden" name="page_id" value="feedback">
								<input type="hidden" name="f_category" value="${list.fCategory}">
								<input type="hidden" name="sId" value="${param.sId}">
								<input type="hidden" name="s_id" value="${param.sId}">
								<input type="submit" name="submit" value="更新ボタン">
							</td>
						</tr>
						<tr>
							<td colspan="3"><textarea name=fContent rows="20" cols="50" >${list.fContent}</textarea></td>
						</tr>
					</table>
				</form>
				<!-- ここまで -->

			</td>
		</tr>
	</c:forEach>
</table>


</body>
<script>

	window.onload = function(){
		let e = document.getElementById("tArea").value;
		if(e != ''){
			document.getElementById("f_update_button").style.display="none";
		}
		if(e == ''){
			document.getElementById("f_regist_button").style.display="none";
		}
	}

</script>
</html>