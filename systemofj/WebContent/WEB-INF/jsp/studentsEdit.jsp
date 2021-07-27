<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<!-- 戻る -->
  <form action="/systemofj/Servlet" method="POST" style="display:inline-flex">
    <input type="hidden" name="sId" value="${student.sId}">
    <input type="hidden" name="page_id" value="studentsEdit">
    <input type="SUBMIT" name="submit" value="戻る">
  </form>

<!-- 履歴書ボタン -->
  <form action="/systemofj/Servlet" method="POST" style="display:inline-flex">
    <input type="SUBMIT" value="履歴書PDFを表示">
  	<input type="hidden" name="page_id" value="studentsEdit">
  </form>
<br>
<!-- 基本情報テーブル -->

<h3>基本情報<input type="checkbox" id="s_info"  onclick="divOpen(this,'student')"></h3>

<form action="/systemofj/Servlet" method="POST">
  <div id="student" style="display:none;">
  <input type="hidden" name="page_id" value="studentsEdit">
  <input type="hidden" name="sId" value="${student.sId}">
	<table style="border: 0px; width: 800px;" class = table>
	  <tr>
	    <td>氏名<hr><input type="text" name="s_name" value="${student.sName}" required></td>
	    <td>フリガナ<hr><input type="text" name="s_kana" value="${student.sKana}" required></td>
	    <td colspan="2">住所<hr><input type="text" name="s_address" value="${student.sAddress}" required></td>
	  </tr>
	  <tr>
	    <td>学校名<hr><input type="text" name="s_university" value="${student.sUnivercity}" required></td>
	    <td>学部<hr><input type="text" name="s_faculty" value="${student.sFaculty}" required></td>
	    <td>学科<hr><input type="text" name="s_department" value="${student.sDepartment}" required></td>
	    <td>文理<hr><select name="s_contexts"><option value="　"></option><option value="文"<c:if test="${student.sContexts == '文'}" >selected</c:if>>文</option><option value="理"<c:if test="${student.sContexts == '理'}" >selected</c:if>>理</option></select></td>
	  </tr>
	  <tr>
	    <td colspan="2">PCメール<hr><input type="text" name="s_pcmail" value="${student.sPcMail}"></td>
	    <td colspan="2">携帯メール<hr><input type="text" name="s_mobilemail" value="${student.sMobileMail}"></td>
	  </tr>
	  <tr>
	    <td colspan="4">
	      <table style="width: 800px;" class = table>
	        <tr>
	          <th colspan="4">申込分類</th>
	        </tr>
	        <tr>
	    	  <td>
	    	  	キャリタス<hr>
	    	  	<select name="s_careertasu">
	    	  		<option value="　"></option>
	    	  		<option value="〇" <c:if test="${student.sCareertasu == '〇'}" >selected</c:if>>〇</option>
	    	  	</select>
	    	  </td>
	    	  <td>リクナビ<hr><select name="s_rikunavi"><option value="　"></option><option value="〇"<c:if test="${student.sRikunavi == '〇'}" >selected</c:if>>〇</option></select></td>
	    	  <td>マイナビ<hr><select name="s_mynavi"><option value="　"></option><option value="〇"<c:if test="${student.sMynavi == '〇'}" >selected</c:if>>〇</option></select></td>
	    	  <td>その他<hr><select name="s_other"><option value="　"></option><option value="〇"<c:if test="${student.sOther == '〇'}" >selected</c:if>>〇</option></select></td>
	        </tr>
	      </table>
	    </td>
	  </tr>
	</table>
  </div>
<!-- イベントテーブル -->

<h3>イベント<input type="checkbox" id="e_info" onclick="divOpen(this,'event')"></h3>
<div id="event" style="display:none;">
<table style="border: 0px; width: 700px;" class = table>
  <tr>
    <td style="border: 0px">
      <table class=table>
        <tr>
          <th>合同説明会</th>
        </tr>
        <tr>
          <td>参加日</td>
        </tr>
        <tr>
          <td><input type="date" name="e_date1" value="${con}"></td>
        </tr>
      </table>
    </td>
    <td style="border: 0px">
      <table class = table>
        <tr>
          <th colspan="3">模擬面接</th>
        </tr>
        <tr>
          <td>申込日</td>
		  <td>予約日</td>
		  <td>参加日</td>
        </tr>
        <tr>
          <td><input type="date" name="e_date2" value="${mock[0].eDate}"></td>
		  <td><input type="date" name="e_date3" value="${mock[1].eDate}"></td>
		  <td><input type="date" name="e_date4" value="${mock[2].eDate}"></td>
        </tr>
      </table>
    </td>
    <td style="border: 0px">
      <table class = table>
        <tr>
          <th colspan="2">座談会</th>
        </tr>
        <tr>
          <td>参加日</td>
		  <td>参加日</td>
        </tr>
        <tr>
          <td><input type="date" name="e_date5" value="${talk[0].eDate}"></td>
          <td><input type="date" name="e_date6" value="${talk[1].eDate}"></td>
        </tr>
      </table>
    </td>
  </tr>
</table>
</div>
<!-- インターンテーブル -->

<h3>インターン<input type="checkbox" id="i_info" onclick="divOpen(this,'intern')"></h3>
<div id="intern" style="display:none;">
<table style="border: 0px #000000 solid; width: 900px;" class = table>
  <tr>
    <td style="border: 0px">
      <table style="border: 0px">
        <tr>
          <td style="border: 0px">
            <table class=table>
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
                <td><input type="date" name="i_date1" value="${intern[0].iDate}"></td>
                <td><input type="date" name="i_date2" value="${intern[1].iDate}"></td>
                <td><input type="date" name="i_date3" value="${intern[2].iDate}"></td>
                <td><input type="date" name="i_date4" value="${intern[3].iDate}"></td>
                <td><input type="date" name="i_date5" value="${intern[4].iDate}"></td>
              </tr>
              <tr>
                <th>懇親会出欠</th>
                <td><select name="i_meeting1"><option value="　"></option><option value="〇"<c:if test="${intern[0].iMeeting == '〇'}" >selected</c:if>>〇</option></select></td>
                <td><select name="i_meeting2"><option value="　"></option><option value="〇"<c:if test="${intern[1].iMeeting == '〇'}" >selected</c:if>>〇</option></select></td>
                <td><select name="i_meeting3"><option value="　"></option><option value="〇"<c:if test="${intern[2].iMeeting == '〇'}" >selected</c:if>>〇</option></select></td>
                <td><select name="i_meeting4"><option value="　"></option><option value="〇"<c:if test="${intern[3].iMeeting == '〇'}" >selected</c:if>>〇</option></select></td>
                <td><select name="i_meeting5"><option value="　"></option><option value="〇"<c:if test="${intern[4].iMeeting == '〇'}" >selected</c:if>>〇</option></select></td>
              </tr>
              <tr>
                <th>アンケート合否</th>
                <td><select name="i_acceptance1"><option value="　"></option><option value="〇"<c:if test="${intern[0].iAcceptance == '〇'}" >selected</c:if>>〇</option></select></td>
                <td><select name="i_acceptance2"><option value="　"></option><option value="〇"<c:if test="${intern[1].iAcceptance == '〇'}" >selected</c:if>>〇</option></select></td>
                <td><select name="i_acceptance3"><option value="　"></option><option value="〇"<c:if test="${intern[2].iAcceptance == '〇'}" >selected</c:if>>〇</option></select></td>
                <td><select name="i_acceptance4"><option value="　"></option><option value="〇"<c:if test="${intern[3].iAcceptance == '〇'}" >selected</c:if>>〇</option></select></td>
                <td><select name="i_acceptance5"><option value="　"></option><option value="〇"<c:if test="${intern[4].iAcceptance == '〇'}" >selected</c:if>>〇</option></select></td>
              </tr>
              <tr>
                <th>アンケート提出有無</th>
                <td><select name="i_submit1"><option value="　"></option><option value="〇"<c:if test="${intern[0].iSubmit == '〇'}" >selected</c:if>>〇</option></select></td>
                <td><select name="i_submit2"><option value="　"></option><option value="〇"<c:if test="${intern[1].iSubmit == '〇'}" >selected</c:if>>〇</option></select></td>
                <td><select name="i_submit3"><option value="　"></option><option value="〇"<c:if test="${intern[2].iSubmit == '〇'}" >selected</c:if>>〇</option></select></td>
                <td><select name="i_submit4"><option value="　"></option><option value="〇"<c:if test="${intern[3].iSubmit == '〇'}" >selected</c:if>>〇</option></select></td>
                <td><select name="i_submit5"><option value="　"></option><option value="〇"<c:if test="${intern[4].iSubmit == '〇'}" >selected</c:if>>〇</option></select></td>
              </tr>
              <tr>
                <th>資料送付</th>
                <td><select name="i_document1"><option value="　"></option><option value="〇"<c:if test="${intern[0].iDocument == '〇'}" >selected</c:if>>〇</option></select></td>
                <td><select name="i_document2"><option value="　"></option><option value="〇"<c:if test="${intern[1].iDocument == '〇'}" >selected</c:if>>〇</option></select></td>
                <td><select name="i_document3"><option value="　"></option><option value="〇"<c:if test="${intern[2].iDocument == '〇'}" >selected</c:if>>〇</option></select></td>
                <td><select name="i_document4"><option value="　"></option><option value="〇"<c:if test="${intern[3].iDocument == '〇'}" >selected</c:if>>〇</option></select></td>
                <td><select name="i_document5"><option value="　"></option><option value="〇"<c:if test="${intern[4].iDocument == '〇'}" >selected</c:if>>〇</option></select></td>

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
<table style="border: 0px #000000 solid; width: 800px;" class = table>
  <tr>
    <td style="border: 0px">
      <table style="width: 265px" class = table>
        <tr>
          <th colspan="4">説明会</th>
        </tr>
        <tr>
          <td>申込日</td>
          <td>参加日</td>
          <td>出欠</td>
        </tr>
        <tr>
          <td><input type="date" name="applyflag" value="${exp.applyflag}"></td>
          <td><input type="date" name="i_date6" value="${exp.iDate}"></td>
          <td><select name="i_attend"><option value="　"></option><option value="〇"<c:if test="${exp.iAttend == '〇'}" >selected</c:if>>〇</option></select></td>
        </tr>
      </table>
    </td>
    <td style="border: 0px">
      <table style="width: 350px" class = table>
        <tr>
         <th>選考受験日</th>
         <th>適正点数</th>
        </tr>
        <tr>
          <td><input type="date" name="se_selectiondate" value="${eazy.seSelectionDate}"></td>
          <td><input type="text" name="se_score" value="${eazy.seScore}"></td>
        </tr>
      </table>
    </td>
    <td style="border: 0px">
      <table style="width: 170px" class = table>
        <tr>
          <th>書類点数</th>
          <th>書類合否</th>
        </tr>
        <tr>
          <td><input type="text" name="se_textscore" value="${eazy.seTextScore}"></td>
          <td><select name="se_textresult"><option value="${eazy.seTextResult}"></option><option value="合">合</option><option value="否">否</option></select></td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td style="border: 0px">
      <table style="width: 500px" class = table>
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
          <td><select name="st_score_resume1"><option value="0"<c:if test="${resume[0].stScore == '0'}" >selected</c:if>></option><option value="1"<c:if test="${resume[0].stScore == '1'}" >selected</c:if>>1</option><option value="2"<c:if test="${resume[0].stScore == '2'}" >selected</c:if>>2</option><option value="3"<c:if test="${resume[0].stScore == '3'}" >selected</c:if>>3</option><option value="4"<c:if test="${resume[0].stScore == '4'}" >selected</c:if>>4</option></select></td>
          <td><select name="st_score_resume2"><option value="0"<c:if test="${resume[1].stScore == '0'}" >selected</c:if>></option><option value="1"<c:if test="${resume[1].stScore == '1'}" >selected</c:if>>1</option><option value="2"<c:if test="${resume[1].stScore == '2'}" >selected</c:if>>2</option><option value="3"<c:if test="${resume[1].stScore == '3'}" >selected</c:if>>3</option><option value="4"<c:if test="${resume[1].stScore == '4'}" >selected</c:if>>4</option></select></td>
          <td><select name="st_score_resume3"><option value="0"<c:if test="${resume[2].stScore == '0'}" >selected</c:if>></option><option value="1"<c:if test="${resume[2].stScore == '1'}" >selected</c:if>>1</option><option value="2"<c:if test="${resume[2].stScore == '2'}" >selected</c:if>>2</option><option value="3"<c:if test="${resume[2].stScore == '3'}" >selected</c:if>>3</option><option value="4"<c:if test="${resume[2].stScore == '4'}" >selected</c:if>>4</option></select></td>
          <td><select name="st_score_resume4"><option value="0"<c:if test="${resume[3].stScore == '0'}" >selected</c:if>></option><option value="1"<c:if test="${resume[3].stScore == '1'}" >selected</c:if>>1</option><option value="2"<c:if test="${resume[3].stScore == '2'}" >selected</c:if>>2</option><option value="3"<c:if test="${resume[3].stScore == '3'}" >selected</c:if>>3</option><option value="4"<c:if test="${resume[3].stScore == '4'}" >selected</c:if>>4</option></select></td>
        </tr>
      </table>
    </td>
    <td style="border: 0px">
      <table style="width: 400px" class >
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
          <td><select name="st_score_pr1"><option value="0"<c:if test="${pr[0].stScore == '0'}" >selected</c:if>></option><option value="1"<c:if test="${pr[0].stScore == '1'}" >selected</c:if>>1</option><option value="2"<c:if test="${pr[0].stScore == '2'}" >selected</c:if>>2</option><option value="3"<c:if test="${pr[0].stScore == '3'}" >selected</c:if>>3</option><option value="4"<c:if test="${pr[0].stScore == '4'}" >selected</c:if>>4</option></select></td>
          <td><select name="st_score_pr2"><option value="0"<c:if test="${pr[1].stScore == '0'}" >selected</c:if>></option><option value="1"<c:if test="${pr[1].stScore == '1'}" >selected</c:if>>1</option><option value="2"<c:if test="${pr[1].stScore == '2'}" >selected</c:if>>2</option><option value="3"<c:if test="${pr[1].stScore == '3'}" >selected</c:if>>3</option><option value="4"<c:if test="${pr[1].stScore == '4'}" >selected</c:if>>4</option></select></td>
          <td><select name="st_score_pr3"><option value="0"<c:if test="${pr[2].stScore == '0'}" >selected</c:if>></option><option value="1"<c:if test="${pr[2].stScore == '1'}" >selected</c:if>>1</option><option value="2"<c:if test="${pr[2].stScore == '2'}" >selected</c:if>>2</option><option value="3"<c:if test="${pr[2].stScore == '3'}" >selected</c:if>>3</option><option value="4"<c:if test="${pr[2].stScore == '4'}" >selected</c:if>>4</option></select></td>
          <td><select name="st_score_pr4"><option value="0"<c:if test="${pr[3].stScore == '0'}" >selected</c:if>></option><option value="1"<c:if test="${pr[3].stScore == '1'}" >selected</c:if>>1</option><option value="2"<c:if test="${pr[3].stScore == '2'}" >selected</c:if>>2</option><option value="3"<c:if test="${pr[3].stScore == '3'}" >selected</c:if>>3</option><option value="4"<c:if test="${pr[3].stScore == '4'}" >selected</c:if>>4</option></select></td>
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
          <td><select name="st_score_text1"><option value="0"<c:if test="${text[0].stScore == '0'}" >selected</c:if>></option><option value="1"<c:if test="${text[0].stScore == '1'}" >selected</c:if>>1</option><option value="2"<c:if test="${text[0].stScore == '2'}" >selected</c:if>>2</option><option value="3"<c:if test="${text[0].stScore == '3'}" >selected</c:if>>3</option><option value="4"<c:if test="${text[0].stScore == '4'}" >selected</c:if>>4</option></select></td>
		  <td><select name="st_score_text2"><option value="0"<c:if test="${text[1].stScore == '0'}" >selected</c:if>></option><option value="1"<c:if test="${text[1].stScore == '1'}" >selected</c:if>>1</option><option value="2"<c:if test="${text[1].stScore == '2'}" >selected</c:if>>2</option><option value="3"<c:if test="${text[1].stScore == '3'}" >selected</c:if>>3</option><option value="4"<c:if test="${text[1].stScore == '4'}" >selected</c:if>>4</option></select></td>
		  <td><select name="st_score_text3"><option value="0"<c:if test="${text[2].stScore == '0'}" >selected</c:if>></option><option value="1"<c:if test="${text[2].stScore == '1'}" >selected</c:if>>1</option><option value="2"<c:if test="${text[2].stScore == '2'}" >selected</c:if>>2</option><option value="3"<c:if test="${text[2].stScore == '3'}" >selected</c:if>>3</option><option value="4"<c:if test="${text[2].stScore == '4'}" >selected</c:if>>4</option></select></td>
		  <td><select name="st_score_text4"><option value="0"<c:if test="${text[3].stScore == '0'}" >selected</c:if>></option><option value="1"<c:if test="${text[3].stScore == '1'}" >selected</c:if>>1</option><option value="2"<c:if test="${text[3].stScore == '2'}" >selected</c:if>>2</option><option value="3"<c:if test="${text[3].stScore == '3'}" >selected</c:if>>3</option><option value="4"<c:if test="${text[3].stScore == '4'}" >selected</c:if>>4</option></select></td>
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
          <td style="width: 143px"><input type="date" name="se_firstno" value="${eazy.seFirstNo}"></td>
          <td style="width: 143px"><input type="date" name="se_firstdate" value="${eazy.seFirstDate}"></td>
          <td><select name="sf_score_one1"><option value="0"<c:if test="${face1[0].sfScore == '0'}" >selected</c:if>></option><option value="1"<c:if test="${face1[0].sfScore == '1'}" >selected</c:if>>1</option><option value="2"<c:if test="${face1[0].sfScore == '2'}" >selected</c:if>>2</option><option value="3"<c:if test="${face1[0].sfScore == '3'}" >selected</c:if>>3</option><option value="4"<c:if test="${face1[0].sfScore == '4'}" >selected</c:if>>4</option></select></td>
          <td><select name="sf_score_one1"><option value="0"<c:if test="${face1[1].sfScore == '0'}" >selected</c:if>></option><option value="1"<c:if test="${face1[1].sfScore == '1'}" >selected</c:if>>1</option><option value="2"<c:if test="${face1[1].sfScore == '2'}" >selected</c:if>>2</option><option value="3"<c:if test="${face1[1].sfScore == '3'}" >selected</c:if>>3</option><option value="4"<c:if test="${face1[1].sfScore == '4'}" >selected</c:if>>4</option></select></td>
          <td><select name="sf_score_one1"><option value="0"<c:if test="${face1[2].sfScore == '0'}" >selected</c:if>></option><option value="1"<c:if test="${face1[2].sfScore == '1'}" >selected</c:if>>1</option><option value="2"<c:if test="${face1[2].sfScore == '2'}" >selected</c:if>>2</option><option value="3"<c:if test="${face1[2].sfScore == '3'}" >selected</c:if>>3</option><option value="4"<c:if test="${face1[2].sfScore == '4'}" >selected</c:if>>4</option></select></td>
          <td><select name="se_firstresult"><option value="　"></option><option value="合"<c:if test="${eazy.seFirstResult == '合'}" >selected</c:if>>合</option><option value="否"<c:if test="${eazy.seFirstResult == '否'}" >selected</c:if>>否</option></select></td>
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
          <td style="width: 143px"><input type="date" name="se_secondno" value="${eazy.seSecondNo}"></td>
          <td style="width: 143px"><input type="date" name="se_seconddate" value="${eazy.seSecondDate}"></td>
          <td><select name="sf_score_second1"><option value="0"<c:if test="${face2[0].sfScore == '0'}" >selected</c:if>></option><option value="1"<c:if test="${face2[0].sfScore == '1'}" >selected</c:if>>1</option><option value="2"<c:if test="${face2[0].sfScore == '2'}" >selected</c:if>>2</option><option value="3"<c:if test="${face2[0].sfScore == '3'}" >selected</c:if>>3</option><option value="4"<c:if test="${face2[0].sfScore == '4'}" >selected</c:if>>4</option></select></td>
		  <td><select name="sf_score_second2"><option value="0"<c:if test="${face2[1].sfScore == '0'}" >selected</c:if>></option><option value="1"<c:if test="${face2[1].sfScore == '1'}" >selected</c:if>>1</option><option value="2"<c:if test="${face2[1].sfScore == '2'}" >selected</c:if>>2</option><option value="3"<c:if test="${face2[1].sfScore == '3'}" >selected</c:if>>3</option><option value="4"<c:if test="${face2[1].sfScore == '4'}" >selected</c:if>>4</option></select></td>
          <td><select name="se_secondresult"><option value="　"></option><option value="合"<c:if test="${eazy.seSecondResult == '合'}" >selected</c:if>>合</option><option value="否"<c:if test="${eazy.seSecondResult == '否'}" >selected</c:if>>否</option></select></td>
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
          <td><input type="date" name="se_thirddate" value="${eazy.seThirdDate}"></td>
          <td><select name="se_thirdresult"><option value="　"></option><option value="合"<c:if test="${eazy.seThirdResult == '合'}" >selected</c:if>>合</option><option value="否"<c:if test="${eazy.seThirdResult == '否'}" >selected</c:if>>否</option></select></td>
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
          <td><input type="date" name="se_sendok" value="${eazy.seSendOk}"></td>
          <td><input type="date" name="se_earlyok" value="${eazy.seEarlyOk}"></td>
          <td><input type="date" name="se_earlyno" value="${eazy.seEarlyNo}"></td>
          <td><input type="date" name="se_ok" value="${eazy.seOk}"></td>
          <td><input type="date" name="se_no" value="${eazy.seNo}"></td>
          <td><input type="date" name="se_gettextdate" value="${eazy.seGetTextDate}"></td>
        </tr>
        <tr>
          <th>辞退理由</th>
        </tr>
        <tr>
          <td colspan="7"><textarea style="width: 1069px" name="se_noreason">${eazy.seNoReason}</textarea></td>
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
         <td><textarea name="se_remarks">${eazy.seRemarks}</textarea></td>
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
          <option value="　">${eazy.seSituation}</option>
          <option value="適性検査受験前"<c:if test="${eazy.seSituation == '適性検査受験前'}">selected</c:if>>適性検査受験前</option>
          <option value="適性検査受験済"<c:if test="${eazy.seSituation == '適性検査受験済'}">selected</c:if>>適性検査受験済</option>
          <option value="書類選考中"<c:if test="${eazy.seSituation == '書類選考中'}">selected</c:if>>書類選考中</option>
          <option value="書類選考合否"<c:if test="${eazy.seSituation == '書類選考合否'}">selected</c:if>>書類選考合否</option>
          <option value="一次選考日程調整"<c:if test="${eazy.seSituation == '一次選考日程調整'}">selected</c:if>>一次選考日程調整</option>
          <option value="一次選考実施中"<c:if test="${eazy.seSituation == '一次選考実施中'}">selected</c:if>>一次選考実施中</option>
          <option value="二次選考日程調整"<c:if test="${eazy.seSituation == '二次選考日程調整'}">selected</c:if>>二次選考日程調整</option>
          <option value="二次選考実施中"<c:if test="${eazy.seSituation == '二次選考実施中'}">selected</c:if>>二次選考実施中</option>
          <option value="三次選考日程調整"<c:if test="${eazy.seSituation == '三次選考日程調整'}">selected</c:if>>三次選考日程調整</option>
          <option value="三次選考実施中"<c:if test="${eazy.seSituation == '三次選考実施中'}">selected</c:if>>三次選考実施中</option>
          <option value="内々定決定"<c:if test="${eazy.seSituation == '内々定決定'}">selected</c:if>>内々定決定</option>
          <option value="内々定送付"<c:if test="${eazy.seSituation == '内々定送付'}">selected</c:if>>内々定送付</option>
          <option value="内々定応諾"<c:if test="${eazy.seSituation == '内々定応諾'}">selected</c:if>>内々定応諾</option>
          <option value="辞退"<c:if test="${eazy.seSituation == '辞退'}">selected</c:if>>辞退</option>
          <option value="不合格"<c:if test="${eazy.seSituation == '不合格'}">selected</c:if>>不合格</option>
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
<input type="submit" name="submit" value="更新" style="width: 200px">
<input type="submit" name="submit" value="削除" style="width: 200px">
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