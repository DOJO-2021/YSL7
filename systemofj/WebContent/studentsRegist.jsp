<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table, td, th{
border: 2px #000000 solid;
margin: 3px auto;
}
hr {
margin-block-start: 0em;
margin-block-end: 0em;
}
th {
background-color: #e0e0e0;
}
h3 {
text-align: center;
margin: 15px auto;
width: 1000px;
background-color: #e0e0e0;
}
textarea{
width: 800px;
}
</style>

</head>
<body>

<!-- アップロード画面へ遷移 -->
  <form action="/systemofj/Servlet.java" method="POST" style="display:inline-flex">
    <input type="SUBMIT" value="履歴書PDFを登録">
  </form>
<br>
<!-- 基本情報テーブル -->

<h3>基本情報<input type="checkbox" id="s_info"  onclick="divOpen(this,'student')"></h3>

<form action="/systemofj/Servlet.java" method="POST">
  <div id="student" style="display:none;">
	<table style="border: 0px; width: 800px;">
	<input type="hidden" name="s_id">
	  <tr>
	    <td>氏名<hr><input type="text" name="s_name" value="　"></td>
	    <td>フリガナ<hr><input type="text" name="s_kana" value="　"></td>
	    <td colspan="2">住所<hr><input type="text" name="s_address" value="　"></td>
	  </tr>
	  <tr>
	    <td>学校名<hr><input type="text" name="s_university" value="　"></td>
	    <td>学部<hr><input type="text" name="s_faculty" value="　"></td>
	    <td>学科<hr><input type="text" name="s_department" value="　"></td>
	    <td>文理<hr><select name="s_contexts"><option value="　"></option><option value="文">文</option><option value="理">理</option></select></td>
	  </tr>
	  <tr>
	    <td colspan="2">PCメール<hr><input type="text" name="s_pcmail" value="　"></td>
	    <td colspan="2">携帯メール<hr><input type="text" name="s_mobilemail" value="　"></td>
	  </tr>
	  <tr>
	    <td colspan="4">
	      <table style="width: 800px;">
	        <tr>
	          <th colspan="4">申込分類</th>
	        </tr>
	        <tr>
	    	  <td>キャリタス<hr><select name="s_careertasu"><option value="　"></option><option value="〇">〇</option></select></td>
	    	  <td>リクナビ<hr><select name="s_rikunavi"><option value="　"></option><option value="〇">〇</option></select></td>
	    	  <td>マイナビ<hr><select name="s_mynavi"><option value="　"></option><option value="〇">〇</option></select></td>
	    	  <td>その他<hr><select name="s_other"><option value="　"></option><option value="〇">〇</option></select></td>
	        </tr>
	      </table>
	    </td>
	  </tr>
	</table>
  </div>
<!-- イベントテーブル -->

<h3>イベント<input type="checkbox" id="e_info" onclick="divOpen(this,'event')"></h3>
<div id="event" style="display:none;">
<table style="border: 0px; width: 700px;">
  <tr>
    <td style="border: 0px">
      <table>
        <tr>
          <th>合同説明会</th>
        </tr>
        <tr>
          <td>参加日</td>
        </tr>
        <tr>
          <td><input type="date" name="e_date1" value="　"></td>
        </tr>
      </table>
    </td>
    <td style="border: 0px">
      <table>
        <tr>
          <th colspan="3">模擬面接</th>
        </tr>
        <tr>
          <td>申込日</td>
		  <td>予約日</td>
		  <td>参加日</td>
        </tr>
        <tr>
          <td><input type="date" name="e_date2" value="　"></td>
		  <td><input type="date" name="e_date3" value="　"></td>
		  <td><input type="date" name="e_date4" value="　"></td>

        </tr>
      </table>
    </td>
    <td style="border: 0px">
      <table>
        <tr>
          <th colspan="2">座談会</th>
        </tr>
        <tr>
          <td>参加日</td>
		  <td>参加日</td>
        </tr>
        <tr>
          <td><input type="date" name="e_date5" value="　"></td>
          <td><input type="date" name="e_date6" value="　"></td>
        </tr>
      </table>
    </td>
  </tr>
</table>
</div>
<!-- インターンテーブル -->

<h3>インターン<input type="checkbox" id="i_info" onclick="divOpen(this,'intern')"></h3>
<div id="intern" style="display:none;">
<table style="border: 0px #000000 solid; width: 900px;">
  <tr>
    <td style="border: 0px">
      <table style="border: 0px">
        <tr>
          <td style="border: 0px">
            <table>
              <tr>
                <td style="border: 0px"></td>
                <th>1day</th>
                <th>3days</th>
                <th>初級</th>
                <th>中級</th>
                <th>準備</th>
              </tr>
              <tr>
                <td style="border: 0px"></td>
                <td><input type="date" name="i_date1" value="　"></td>
                <td><input type="date" name="i_date2" value="　"></td>
                <td><input type="date" name="i_date3" value="　"></td>
                <td><input type="date" name="i_date4" value="　"></td>
                <td><input type="date" name="i_date5" value="　"></td>
              </tr>
              <tr>
                <th>懇親会出欠</th>
                <td><select name="i_meeting1"><option value="　"></option><option value="〇">〇</option></select></td>
                <td><select name="i_meeting2"><option value="　"></option><option value="〇">〇</option></select></td>
                <td><select name="i_meeting3"><option value="　"></option><option value="〇">〇</option></select></td>
                <td><select name="i_meeting4"><option value="　"></option><option value="〇">〇</option></select></td>
                <td><select name="i_meeting5"><option value="　"></option><option value="〇">〇</option></select></td>
              </tr>
              <tr>
                <th>アンケート合否</th>
                <td><select name="i_acceptance1"><option value="　"></option><option value="〇">〇</option></select></td>
                <td><select name="i_acceptance2"><option value="　"></option><option value="〇">〇</option></select></td>
                <td><select name="i_acceptance3"><option value="　"></option><option value="〇">〇</option></select></td>
                <td><select name="i_acceptance4"><option value="　"></option><option value="〇">〇</option></select></td>
                <td><select name="i_acceptance5"><option value="　"></option><option value="〇">〇</option></select></td>
              </tr>
              <tr>
                <th>アンケート提出有無</th>
                <td><select name="i_submit1"><option value="　"></option><option value="〇">〇</option></select></td>
                <td><select name="i_submit2"><option value="　"></option><option value="〇">〇</option></select></td>
                <td><select name="i_submit3"><option value="　"></option><option value="〇">〇</option></select></td>
                <td><select name="i_submit4"><option value="　"></option><option value="〇">〇</option></select></td>
                <td><select name="i_submit5"><option value="　"></option><option value="〇">〇</option></select></td>
              </tr>
              <tr>
                <th>資料送付</th>
                <td><select name="i_document1"><option value="　"></option><option value="〇">〇</option></select></td>
                <td><select name="i_document2"><option value="　"></option><option value="〇">〇</option></select></td>
                <td><select name="i_document3"><option value="　"></option><option value="〇">〇</option></select></td>
                <td><select name="i_document4"><option value="　"></option><option value="〇">〇</option></select></td>
                <td><select name="i_document5"><option value="　"></option><option value="〇">〇</option></select></td>
              </tr>
            </table>
          </td>
        </tr>
      </table>
    </td>

  </tr>
</table>
</div>
<!-- 選考テーブル -->

<h3>選考<input type="checkbox" id="sele_info"  onclick="divOpen(this,'selection')"></h3>
<div id="selection" style="display:none;">
<table style="border: 0px #000000 solid; width: 800px;">
  <tr>
    <td style="border: 0px">
      <table style="width: 265px">
        <tr>
          <th colspan="4">説明会</th>
        </tr>
        <tr>
          <td>申込日</td>
          <td>参加日</td>
          <td>出欠</td>
        </tr>
        <tr>
          <td><input type="date" name="applyflag" value="　"></td>
          <td><input type="date" name="i_date6" value="　"></td>
          <td><select name="i_attend"><option value="　"></option><option value="〇">〇</option></select></td>
        </tr>
      </table>
    </td>
    <td style="border: 0px">
      <table style="width: 350px">
        <tr>
         <th>選考受験日</th>
         <th>適正点数</th>
        </tr>
        <tr>
          <td><input type="date" name="se_selectiondate" value="　"></td>
          <td><input type="text" name="se_score" value="　"></td>
        </tr>
      </table>
    </td>
    <td style="border: 0px">
      <table style="width: 170px">
        <tr>
          <th>書類点数</th>
          <th>書類合否</th>
        </tr>
        <tr>
          <td><input type="text" name="se_textscore" value="　"></td>
          <td><select name="se_textresult"><option value="　"></option><option value="合">合</option><option value="否">否</option></select></td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td style="border: 0px">
      <table style="width: 500px">
        <tr>
          <th colspan="4">履歴書評価</th>
        </tr>
        <tr>
          <td>松野</td>
          <td>藤原</td>
          <td>板谷</td>
          <td>菅澤</td>
        </tr>
        <tr>
          <td><select name="st_score_resume1"><option value="　"></option><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option></select></td>
          <td><select name="st_score_resume2"><option value="　"></option><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option></select></td>
          <td><select name="st_score_resume3"><option value="　"></option><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option></select></td>
          <td><select name="st_score_resume4"><option value="　"></option><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option></select></td>
        </tr>
      </table>
    </td>
    <td style="border: 0px">
      <table style="width: 400px">
        <tr>
          <th colspan="4">自己PR文評価</th>
        </tr>
        <tr>
          <td>松野</td>
          <td>藤原</td>
          <td>板谷</td>
          <td>菅澤</td>
        </tr>
        <tr>
          <td><select name="st_score_pr1"><option value="　"></option><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option></select></td>
          <td><select name="st_score_pr2"><option value="　"></option><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option></select></td>
          <td><select name="st_score_pr3"><option value="　"></option><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option></select></td>
          <td><select name="st_score_pr4"><option value="　"></option><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option></select></td>
        </tr>
      </table>
    </td>
    <td style="border: 0px">
      <table style="width: 220px">
        <tr>
          <th colspan="4">書類選考評価</th>
        </tr>
        <tr>
          <td>松野</td>
          <td>藤原</td>
          <td>板谷</td>
          <td>菅澤</td>
        </tr>
        <tr>
          <td><select name="st_score_text1"><option value="　"></option><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option></select></td>
          <td><select name="st_score_text2"><option value="　"></option><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option></select></td>
          <td><select name="st_score_text3"><option value="　"></option><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option></select></td>
          <td><select name="st_score_text4"><option value="　"></option><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option></select></td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td style="border: 0px">
      <table style="width: 500px">
        <tr>
          <th colspan="6">1次面接</th>
        </tr>
        <tr>
          <td>前辞退</td>
          <td>実施</td>
          <td>藤原</td>
          <td>板谷</td>
          <td>菅澤</td>
          <th>合否</th>
        </tr>
        <tr>
          <td style="width: 143px"><input type="date" name="se_firstno" value="　"></td>
          <td style="width: 143px"><input type="date" name="se_firstdate" value="　"></td>
          <td><select name="sf_score_one1"><option value="　"></option><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option></select></td>
          <td><select name="sf_score_one2"><option value="　"></option><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option></select></td>
          <td><select name="sf_score_one3"><option value="　"></option><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option></select></td>
          <td><select name="se_firstresult"><option value="　"></option><option value="合">合</option><option value="否">否</option></select></td>
        </tr>
      </table>
    </td>
    <td style="border: 0px">
      <table style="width: 440px">
        <tr>
          <th colspan="5">2次面接</th>
        </tr>
        <tr>
          <td>前辞退</td>
          <td>実施</td>
          <td>藤原</td>
          <td>板谷</td>
          <th>合否</th>
        </tr>
        <tr>
          <td style="width: 143px"><input type="date" name="se_secondno" value="　"></td>
          <td style="width: 143px"><input type="date" name="se_seconddate" value="　"></td>
          <td><select name="sf_score_second1"><option value="　"></option><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option></select></td>
          <td><select name="sf_score_second2"><option value="　"></option><option value="1">1</option><option value="2">2</option><option value="3">3</option><option value="4">4</option></select></td>
          <td><select name="se_secondresult"><option value="　"></option><option value="合">合</option><option value="否">否</option></select></td>
        </tr>
      </table>
    </td>
    <td style="border: 0px">
      <table style="width: 220px">
        <tr>
          <th colspan="2">3次面接</th>
        </tr>
        <tr>
          <td>実施</td>
          <th>合否</th>
        </tr>
        <tr>
          <td><input type="date" name="se_thirddate" value="　"></td>
          <td><select name="se_thirdresult"><option value="　"></option><option value="合">合</option><option value="否">否</option></select></td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td colspan="3" style="border: 0px">
      <table style="width: 678px">
        <tr>
          <th>内々定送付</th>
          <th>内々定応諾</th>
          <th>内々定応諾後辞退</th>
          <th>内定応諾</th>
          <th>応諾後辞退</th>
          <th>書類受領日</th>
          <th>決定までの日数</th>
        </tr>
        <tr>
          <td><input type="date" name="se_sendok" value="　"></td>
          <td><input type="date" name="se_earlyok" value="　"></td>
          <td><input type="date" name="se_earlyno" value="　"></td>
          <td><input type="date" name="se_ok" value="　"></td>
          <td><input type="date" name="se_no" value="　"></td>
          <td><input type="date" name="se_gettextdate" value="　"></td>
          <td><input type="text" name="se_decide" value="　"></td>
        </tr>
        <tr>
          <th>辞退理由</th>
        </tr>
        <tr>
          <td colspan="7"><textarea style="width: 1069px" name="se_noreason"　>　</textarea></td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td style="border: 0px" colspan="2">
     <table style="width: 678px">
       <tr>
         <th>備考</th>
       </tr>
       <tr>
         <td><textarea name="se_remarks">　</textarea></td>
       </tr>
     </table>
    </td>
    <td style="border: 0px">
      <table>
        <tr>
          <th>選考進捗状況</th>
        </tr>
        <tr>
          <td><select name="se_situation">
          <option value="　"></option>
          <option value="適性検査受験前">適性検査受験前</option>
          <option value="適性検査受験済">適性検査受験済</option>
          <option value="書類選考中">書類選考中</option>
          <option value="書類選考合否">書類選考合否</option>
          <option value="一次選考日程調整">一次選考日程調整</option>
          <option value="一次選考実施中">一次選考実施中</option>
          <option value="二次選考日程調整">二次選考日程調整</option>
          <option value="二次選考実施中">二次選考実施中</option>
          <option value="三次選考日程調整">三次選考日程調整</option>
          <option value="三次選考実施中">三次選考実施中</option>
          <option value="内々定決定">内々定決定</option>
          <option value="内々定送付">内々定送付</option>
          <option value="内々定応諾">内々定応諾</option>
          <option value="辞退">辞退</option>
          <option value="不合格">不合格</option>
          </select>
          </td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>

  </tr>
</table>
</div>
<div align="center">
<input type="submit" value="登録" style="width: 200px">
<input type="hidden" name="page_id" value="studentRegist">
</div>
</form>
</body>
<script>
'use strict'
function divOpen(checkBox, id) {
if(checkBox.checked){
  document.getElementById(id).style.display = "block";
}else{
  document.getElementById(id).style.display = "none";
}

}

</script>
</html>