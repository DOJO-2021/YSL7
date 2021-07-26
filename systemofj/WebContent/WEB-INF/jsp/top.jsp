<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>top</title>

<style>


	.container {
	  font-family: "Yu Gothic", YuGothic, Verdana, 'Hiragino Kaku Gothic ProN','Hiragino Kaku Gothic Pro', 'ヒラギノ角ゴ Pro W3', 'メイリオ', Meiryo, sans-serif;
	  text-align: center;
	}

	.top_tbl{
	text-align: center;
	margin: auto;
	margin-top: 70px;
	}


	.btn {
	  display: inline-block;
	  height: 100px;
	  width: 200px;
	  text-align: center;
	  border: 2px solid #59b9c6;
	  font-size: 16px;
	  color: #59b9c6;
	  text-decoration: none;
	  font-weight: bold;
	  padding: 8px 16px;
	  border-radius: 4px;
	  transition: .4s;
	}

	.btn:hover {
	  background-color: #59b9c6;
	  border-color: #59b9c6;
	  color: #FFF;
	}

	.btn-td{
	  padding: 10px;
	  line-height: 100px;
	}

	header{
		background-color: #0096AE85;
		color: #696969;
		height: 180px;
		text-align: center;
	}

	.logo{


	}
	.account{
		width:50px;
		height:60px;
		margin-top: 0;
	}




</style>



</head>
<body>

<header>
	<img src="images/logo3.png"  alt="ysl_logo" class="logo float_l">
	<img src="images/account.png"  alt="account" class ="account" >
		<!--${u_name}
		${u_first}-->
	<p>ログアウト</p>


</header>

<!-- ボタンの場合
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
 -->


<!-- リンクの場合 -->
<div class="container">
<table class="top_tbl">
	<tr align="center">
		<td class="btn-td"><a href="/systemofj/Servlet?FLG=upload" id="t_upload" class="btn">アップロード</a></td>
		<td class="btn-td"><a href="/systemofj/Servlet?FLG=search" id="t_search" class="btn">検索</a></td>
	</tr>

	<tr align="center">
		<td class="btn-td"><a href="/systemofj/Servlet?FLG=templateRegist" id="t_template" class="btn">テンプレート登録</a></td>
		<td class="btn-td"><a href="/systemofj/Servlet?FLG=studentsRegist" id="t_regist" class="btn">学生の新規登録</a></td>

	</tr>
</table>


<br><hr><br>
<p align="center">その他、臨時で入ってるリンクたち。不要になったら消します。</p>
<a href="/systemofj/TestServlet?FLG=テンプレ編集" id="t_t_edit" class="btn">テンプレ編集</a>
<a href="/systemofj/TestServlet?FLG=学生データ詳細" id="t_detail" class="btn">学生データ詳細</a>
<a href="/systemofj/Servlet?FLG=フィードバック登録・更新" id="t_feedback" class="btn">フィードバック登録・更新</a>
<a href="/systemofj/TestServlet?FLG=検索結果" id="t_s_result" class="btn">検索結果</a>
<a href="/systemofj/TestServlet?FLG=一括編集" id="t_all_edit" class="btn">一括編集</a>
<a href="/systemofj/TestServlet?FLG=処理結果" id="t_result" class="btn">リザルト</a>




</div>
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