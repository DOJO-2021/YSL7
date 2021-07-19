<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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


</style>



</head>
<body>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<p>フィードバックページ</p>
※フィードバック入力後は必ず登録ボタンを押してください



<table align="center" class="fb-tbl">
	<tr>
		<td>

		<!-- tableの中のtable①ここから -->
			<table border="1" class="fb-tbl">
			<tr>
				<td colspan="3">${fr_errormessage1} ${fr_errormessage2}</td>
			</tr>
			<tr>
				<td colspan="2">fr_name</td>
				<td><button id=fr_regist_button value="登録">登録</button></td>
			</tr>
			<tr>
				<td colspan="3"><textarea name=fr_content rows="20" cols="50"></textarea></td>
			</tr>
			</table>
		<!-- ここまで -->

		</td>
		<td rowspan="2">

		<!-- tableの中のtable②ここから -->
			<table border="1" class="fb-matome">
			<tr>
				<td>
				<form>
				<select>
					<option value="1day">インターン1DAY</option>
					<option value="3day">インターン3DAY</option>
					<option value="">初級</option>
					<option value="">中級</option>
					<option value="">模擬面接</option>
					<option value="">会社説明会</option>
					<option value="">一次面接</option>
					<option value="">二次面接</option>
					<option value="">予備</option>
				</select>
				<input type="button" id="fr_search_button" value="検索">
				</form>
				</td>
			</tr>
			<tr>
				<td colspan="3"><textarea name=fr_content rows="20" cols="50"></textarea></td>
			</tr>
			<tr>
				<td id="f_regist_button"><input type="submit" value="フィードバックまとめを更新"></td>
				<td id="f_update_button"><input type="submit"  value="フィードバックまとめを登録"></td>
			</tr>
			</table>
		<!-- ここまで -->

		</td>
	</tr>
	<tr>
		<td>

		<!-- tableの中のtable③ここから -->
			<table border="1" class="fb-tbl">
			<tr>
				<td colspan="3">${fr_errormessage1} ${fr_errormessage2}</td>
			</tr>
			<tr>
				<td colspan="2">fr_name</td>
				<td><button id=fu_update_button value="更新">更新</button></td>
			</tr>
			<tr>
				<td colspan="3"><textarea name=fr_content rows="20" cols="50"></textarea></td>
			</tr>
			</table>
		<!-- ここまで -->

		</td>
	</tr>
</table>



<!--
<table border="1">
	<tr>
		<td colspan="3">${fr_errormessage1} ${fr_errormessage2}</td>
	</tr>
	<tr>
		<td colspan="2">fr_name</td>
		<td><button id=fr_regist_button value="登録">登録</button></td>
	</tr>
	<tr>
		<td colspan="3"><textarea name=fr_content rows="20" cols="50"></textarea></td>
	</tr>
</table>



<table border="1">
	<tr>
		<td colspan="3">${fr_errormessage1} ${fr_errormessage2}</td>
	</tr>
	<tr>
		<td colspan="2">fr_name</td>
		<td><button id=fu_update_button value="更新">更新</button></td>
	</tr>
	<tr>
		<td colspan="3"><textarea name=fr_content rows="20" cols="50"></textarea></td>
	</tr>
</table>



<table border="1">
	<tr>
		<td>
			<form>
			<select>
				<option value="1day">インターン1DAY</option>
				<option value="3day">インターン3DAY</option>
				<option value="">初級</option>
				<option value="">中級</option>
				<option value="">模擬面接</option>
				<option value="">会社説明会</option>
				<option value="">一次面接</option>
				<option value="">二次面接</option>
				<option value="">予備</option>
			</select>
			<input type="button" id="fr_search_button" value="検索">
			</form>
		</td>
	</tr>
	<tr>
		<td colspan="3"><textarea name=fr_content rows="20" cols="50"></textarea></td>
	</tr>
	<tr>
		<td id="f_regist_button"><input type="submit" value="フィードバックまとめを更新"></td>
		<td id="f_update_button"><input type="submit"  value="フィードバックまとめを登録"></td>
	</tr>
</table>





<table border="1" align="center">
	<tr>
		<td>
		<div class="feedback_regist">
		<table align="center" border="1">
			<tr>
				<td>fr_name</td>
				<td><button id=fr_regist_button value="登録">登録</button></td>
			</tr>
			<tr>
				<td><textarea name=fr_content rows="20" cols="50"></textarea></td>
			</tr>
		</table>
		<p>${fr_errormessage1}</p>
		<p>${fr_errormessage2}</p>
		</div>
		</td>
		<td rowspan="2" width="800px" align="center">
		<form>
		<select>
			<option value="1day">インターン1DAY</option>
			<option value="3day">インターン3DAY</option>
			<option value="">初級</option>
			<option value="">中級</option>
			<option value="">模擬面接</option>
			<option value="">会社説明会</option>
			<option value="">一次面接</option>
			<option value="">二次面接</option>
			<option value="">予備</option>
		</select>
		<input type="button" id="fr_search_button" value="検索">
		</form>

<a href="">登録してメール作成へ</a>

<div class="feedback_sum">
	<form>
		<table border="1">
			<tr>
				<td><textarea name=content rows="20" cols="50"></textarea></td>
			</tr>
			<tr>
				<td>${fr_errormessage3}</td>
			</tr>
			<tr>
				<td id="f_regist_button"><input type="submit" value="フィードバックまとめを更新"></td>
				<td id="f_update_button"><input type="submit"  value="フィードバックまとめを登録"></td>
			</tr>
		</table>
	</form>
</div>
</td>


</tr>




<tr>
<td>
<div class="feedback_update">
	<c:forEach>
		<table border="1">
			<tr>
				<td>f_name</td>
				<td><button id=fu_update_button value="更新">更新</button></td>
			</tr>
			<tr>
				<td><textarea name=fu_content rows="20" cols="50"></textarea></td>
			</tr>
		</table>
	</c:forEach>
</div>
</td>
</tr>

 -->


</body>
<script>

	document.getElementById("f_regist_button").style.display="none";
	document.getElementById("f_update_button").style.display="none";

</script>
</html>