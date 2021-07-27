<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>search</title>

<style>

/*プルダウン（インターン、イベント）の幅を広げる*/
.width td {
  width:210px;
}

/*プルダウン（選考）の幅を広げる*/
.selection_width td{
	width:400px;
	}

 /*タブ切り替え全体のスタイル*/
.tabs {
	margin-top: 50px;
	padding-bottom: 40px;
	background-color: #fff;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
	width: 700px;
	margin: 0 auto;
}

/*タブのスタイル*/
.tab_item {
	width: calc(100%/ 3);
	height: 50px;
	border-bottom: 3px solid #5ab4bd;
	background-color: #d9d9d9;
	line-height: 50px;
	font-size: 16px;
	text-align: center;
	color: #565656;
	display: block;
	float: left;
	text-align: center;
	font-weight: bold;
	transition: all 0.2s ease;
}

.tab_item:hover {
	opacity: 0.75;
}

/*ラジオボタンを全て消す*/
input[name="tab_item"] {
	display: none;
}

/*タブ切り替えの中身のスタイル*/
.tab_content {
	display: none;
	padding: 40px 40px 0;
	clear: both;
	overflow: hidden;
}

/*選択されているタブのコンテンツのみを表示*/
#intern:checked ~ #intern, #briefing:checked ~ #briefing,
	#selection:checked ~ #selection {
	display: block;
}

/*選択されているタブのスタイルを変える*/
.tabs input:checked+.tab_item {
	background-color: #5ab4bd;
	color: #fff;
}

</style>

</head>
<body>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<header>
 <%-- <jsp:include page="../../header.jsp"> --%>
</header>

<h1>検索</h1>


<!-- 個人名で検索できる場所 -->
<form method="POST" action="/systemofj/Servlet" >
	<input type="hidden" name="page_id" value="search">

	<input type="hidden" value="name" name="mode">




	<input type="text" name="search_item" placeholder="個人名検索">
	<input type="submit" name="submit" value="検索">
</form>

<!-- 検索大項目 -->
<div class="tabs">
    <input type="radio" name="tab_item" id="intern" checked>
    <label class="tab_item" for="intern">インターン参加者で検索</label>
    <input type="radio" name="tab_item" id="briefing">
    <label class="tab_item" for="briefing">合説/模擬面接参加者で検索</label>
    <input type="radio" name="tab_item" id="selection" >
    <label class="tab_item" for="selection">選考進捗状況で検索</label>

<!-- 検索小項目(インターン) -->
<div class="tab_content" id="intern">
<form method="POST" action="/systemofj/Servlet">
	<input type="hidden" name="page_id" value="search">

	<input type="hidden" value="intern" name="mode">

    <table  class="width">
        <tr>
        	<td><input type="radio" name=search_item value="1day" checked>1DAY</td>
        	<td><input type="radio" name=search_item value="3days">3DAY</td>
			<td>年度選択　<select name="year" id="internYear">
			<option hidden></option>
			<option value="1998">1998</option>
			<option value="1999">1999</option>
			<option value="2000">2000</option>
			<option value="2001">2001</option>
			<option value="2002">2002</option>
			<option value="2003">2003</option>
			<option value="2004">2004</option>
			<option value="2005">2005</option>
			<option value="2006">2006</option>
			<option value="2007">2007</option>
			<option value="2008">2008</option>
			<option value="2009">2009</option>
			<option value="2010">2010</option>
			<option value="2011">2011</option>
			<option value="2012">2012</option>
			<option value="2013">2013</option>
			<option value="2014">2014</option>
			<option value="2015">2015</option>
			<option value="2016">2016</option>
			<option value="2017">2017</option>
			<option value="2018">2018</option>
			<option value="2019">2019</option>
			<option value="2020">2020</option>
			<option value="2021">2021</option>
			<option value="2022">2022</option>
			<option value="2023">2023</option>
			<option value="2024">2024</option>
			<option value="2025">2025</option>
			<option value="2026">2026</option>
			<option value="2027">2027</option>
			<option value="2028">2028</option>
			<option value="2029">2029</option>
			<option value="2030">2030</option>
			</select></td>
        </tr>
        <tr>
        	<td><input type="radio" name=search_item value="初級">初級</td>
        	<td><input type="radio" name=search_item value="中級">中級</td>
        	<td><input type="date" name="date" id="internDay"></td>
        </tr>
        <tr>
        	<td><input type="radio" name=search_item value="準備">選考準備</td>
        	<td><input type="radio" name=search_item value="internAll">インターン参加者</td>
        </tr>
        <tr>
        	<td colspan="3" align="right"><input type="submit" name="submit" value="検索" onclick="return dateCheck('internDay', 'internYear')"></td>
        </tr>
    </table>
</form>
</div>

<!-- 検索小項目(イベント) -->
<div class="tab_content" id="briefing">
<form method="POST" action="/systemofj/Servlet">
	<input type="hidden" name="page_id" value="search">

	<input type="hidden" value="event" name="mode">

    <table  class="width">
    	<tr>
			<td><input type="radio" name=search_item value="合説" checked>合同説明会</td>
			<td><input type="radio" name=search_item value="模擬面接申込">模擬面接申し込み</td>
			<td>年度選択　
			<select name="year" id="eventYear">
			<option hidden></option>
			<option value="1998">1998</option>
			<option value="1999">1999</option>
			<option value="2000">2000</option>
			<option value="2001">2001</option>
			<option value="2002">2002</option>
			<option value="2003">2003</option>
			<option value="2004">2004</option>
			<option value="2005">2005</option>
			<option value="2006">2006</option>
			<option value="2007">2007</option>
			<option value="2008">2008</option>
			<option value="2009">2009</option>
			<option value="2010">2010</option>
			<option value="2011">2011</option>
			<option value="2012">2012</option>
			<option value="2013">2013</option>
			<option value="2014">2014</option>
			<option value="2015">2015</option>
			<option value="2016">2016</option>
			<option value="2017">2017</option>
			<option value="2018">2018</option>
			<option value="2019">2019</option>
			<option value="2020">2020</option>
			<option value="2021">2021</option>
			<option value="2022">2022</option>
			<option value="2023">2023</option>
			<option value="2024">2024</option>
			<option value="2025">2025</option>
			<option value="2026">2026</option>
			<option value="2027">2027</option>
			<option value="2028">2028</option>
			<option value="2029">2029</option>
			<option value="2030">2030</option>
			</select></td>

    	</tr>
    	<tr>
	    	<td><input type="radio" name=search_item value="模擬面接予約">模擬面接予約</td>
	    	<td><input type="radio" name=search_item value="模擬面接参加">模擬面接参加</td>
	    	<td><input type="date" name="date" id="eventDay"></td>
		</tr>
		<tr>
			<td><input type="radio" name=search_item value="座談会1">座談会1</td>
	    	<td><input type="radio" name=search_item value="座談会2">座談会2</td>
		</tr>
		<tr>
	    	<td colspan="3" align="right"><input type="submit" name="submit" value="検索" onclick="return dateCheck('eventDay', 'eventYear')"></td>
		</tr>
	</table>
</form>
</div>

<!-- 検索小項目(選考参加者) -->
<div class="tab_content" id="selection">
<form method="POST" action="/systemofj/Servlet">
	<input type="hidden" name="page_id" value="search">

	<input type="hidden" value="selection" name="mode">

    <table  class="selection_width">
	    <tr>
	       <td><input type="radio" name=search_item value="適性検査受験前" checked>適性検査受験前</td>
	       <td><input type="radio" name=search_item value="適性検査受験済">適性検査受験済み</td>
		</tr>
		<tr>
	       <td><input type="radio" name=search_item value="書類選考中">書類選考中</td>
	       <td><input type="radio" name=search_item value="書類選考合否">書類選考合否</td>
		</tr>
		<tr>
	       <td><input type="radio" name=search_item value="一次選考日程調整">1次選考日程調整</td>
	       <td><input type="radio" name=search_item value="一次選考実施中">１次選考実施中</td>
	    </tr>
		<tr>
	       <td><input type="radio" name=search_item value="二次選考日程調整">2次選考日程調整</td>
	       <td><input type="radio" name=search_item value="二次選考実施中">2次選考実施中</td>
	    </tr>
		<tr>
	       <td><input type="radio" name=search_item value="三次選考日程調整">3次選考日程調整中</td>
	       <td><input type="radio" name=search_item value="三次選考実施中">3次選考実施中</td>
	    </tr>
		<tr>
	       <td><input type="radio" name=search_item value="内々定決定">内々定決定</td>
	       <td><input type="radio" name=search_item value="内々定送付">内々定送付</td>
		</tr>
		<tr>
	       <td><input type="radio" name=search_item value="内々定応諾">内々定応諾</td>
	       <td><input type="radio" name=search_item value="辞退">辞退</td>
	    </tr>
		<tr>
	       <td><input type="radio" name=search_item value="不合格">不合格</td>
		</tr>
		<tr>
	       <td colspan="2" align="right"><input type="submit" name="submit" value="検索"></td>
		</tr>
	</table>
</form>
</div>
</div>

<script>

function dateCheck(dayId, yearId) {
	var date = document.getElementById(dayId).value;
	var year = document.getElementById(yearId).value;

	console.log(date);
	console.log(year + "yer");


	if (date == "" && year == "") {
		alert('日付または年を入力してください。');
		return false;
	}
}

</script>
</body>
</html>