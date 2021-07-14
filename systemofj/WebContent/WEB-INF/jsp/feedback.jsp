<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>フィードバック</title>
</head>
<body>
<p>フィードバックページ</p>
※フィードバック入力後は必ず登録ボタンを押してください


<div class="feedback_regist">

	<table >
		<tr>
			<td>fr_name</td>
			<td><button id=fr_regist_button value="登録"></button></td>
		</tr>
		<tr>
			<td><textarea name=fr_content rows="20" cols="50">
			</textarea></td>
		</tr>

	</table>
	{$fr_errormessage1}
	{$fr_errormessage2}
</div>
<div class="feedback_update">
	<c:foreach>
		<table >
			<tr>
				<td>f_name</td>
				<td><button id=fu_update_button value="更新"></button></td>
			</tr>
			<tr>
				<td><textarea name=fu_content rows="20" cols="50">
				</textarea></td>
			</tr>
		</table>
	</c:foreach>
</div>
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
		<table>
			<tr>
				<td><textarea name=content rows="20" cols="50">
				</textarea></td>
			</tr>
			<tr>
			{$fr_errormessage3}
			</tr>
			<tr>
				<td id="f_regist_button"><input type="submit" value="フィードバックまとめを更新"></td>
				<td id="f_update_button"><input type="submit"  value="フィードバックまとめを登録"></td>
			</tr>
		</table>
	</form>
</div>

</body>
<script>
	document.getElementById("f_regist_button").style.display="none";
	document.getElementById("f_update_button").style.display="none";


	</script>
</html>