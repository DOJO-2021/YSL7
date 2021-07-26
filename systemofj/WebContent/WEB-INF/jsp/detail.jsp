<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table, td, th {
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
width: 800px;
background-color: #e0e0e0;
}
</style>
</head>
<body>
<!-- メール作成ボタン -->
  <form action="/systemofj/Servlet" method="POST" style="display:inline-flex">
  	<input type="hidden" name="page_id" value="detail">
  	<input type="hidden" name=sId value="${student.sId}">
    <input type="submit" name="submit" value="メール作成">
  </form>

<!-- フィードバックボタン -->
  <form action="/systemofj/Servlet" method="POST" style="display:inline-flex">
  	<input type="hidden" name="page_id" value="detail">
    <input type="hidden" name="sId" value="${student.sId}">
    <input type="submit" name="submit" value="フィードバック">
  </form>

<!-- 履歴書ボタン -->
  <form action="/systemofj/uploaded/${student.sName}${student.sAddress}.pdf" method="GET" target="_blank" style="display:inline-flex">
    <input type="submit" name="submit" value="履歴書PDFを表示">
  </form>
<br>
<!-- 基本情報テーブル -->

<h3>基本情報<input type="checkbox" id="s_info"  onclick="divOpen(this,'student')"></h3>
  <div id="student" style="display:none;">
	<table style="border: 0px; width: 800px;">
	  <tr>
	    <td>氏名<hr>${student.sName}</td>
	    <td>フリガナ<hr>${student.sKana}</td>
	    <td colspan="2">住所<hr>${student.sAddress}</td>
	  </tr>
	  <tr>
	    <td>学校名<hr>${student.sUnivercity}</td>
	    <td>学部<hr>${student.sFaculty}</td>
	    <td>学科<hr>${student.sDepartment}</td>
	    <td>文理<hr>${student.sContexts}</td>
	  </tr>
	  <tr>
	    <td colspan="2">PCメール<hr>${student.sPcMail}</td>
	    <td colspan="2">携帯メール<hr>${student.sMobileMail}</td>
	  </tr>
	  <tr>
	    <td colspan="4">
	      <table style="width: 800px;">
	        <tr>
	          <th colspan="4">申込分類</th>
	        </tr>
	        <tr>
	    	  <td>キャリタス<hr>${student.sCareertasu}</td>
	    	  <td>リクナビ<hr>${student.sRikunavi}</td>
	    	  <td>マイナビ<hr>${student.sMynavi}</td>
	    	  <td>その他<hr>${student.sOther}</td>
	        </tr>
	      </table>
	    </td>
	  </tr>
	</table>
  </div>
<!-- イベントテーブル -->

<h3>イベント<input type="checkbox" id="e_info" onclick="divOpen(this,'event')"></h3>
<div id="event" style="display:none;">
<table style="border: 0px; width: 800px;">
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
          <td>${con}</td>
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

          <c:forEach items="${mock}" var="mock">
			<td>${mock.eDate}</td>
          </c:forEach>

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
          <c:forEach items="${talk}" var="talk">
            <td>${talk.eDate}</td>
          </c:forEach>

        </tr>
      </table>
    </td>
  </tr>
</table>
</div>
<!-- インターンテーブル -->

<h3>インターン<input type="checkbox" id="i_info" onclick="divOpen(this,'intern')"></h3>
<div id="intern" style="display:none;">
<table style="border: 0px #000000 solid; width: 830px;">
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
                <c:forEach items="${intern}" var="intern">
          		  <td>${intern.iDate}</td>
           		</c:forEach>
              </tr>
              <tr>
              	<th>インターン出欠</th>
                <c:forEach items="${intern}" var="intern">
          		  <td>${intern.iAttend}</td>
           		</c:forEach>
              </tr>
              <tr>
                <th>懇親会出欠</th>
                <c:forEach items="${intern}" var="intern">
          		  <td>${intern.iMeeting}</td>
           		</c:forEach>

              </tr>
              <tr>
                <th>アンケート合否</th>
                <c:forEach items="${intern}" var="intern">
          		  <td>${intern.iAcceptance}</td>
           		</c:forEach>

              </tr>
              <tr>
                <th>アンケート提出有無</th>
                <c:forEach items="${intern}" var="intern">
          		  <td>${intern.iSubmit}</td>
           		</c:forEach>


              </tr>
              <tr>
                <th>資料送付</th>
                <c:forEach items="${intern}" var="intern">
          		  <td>${intern.iDocument}</td>
           		</c:forEach>

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
          <td>${exp.applyflag}</td>
		  <td>${exp.iDate}</td>
		  <td>${exp.iAttend}</td>
        </tr>
      </table>
    </td>
    <td style="border: 0px">
      <table style="width: 230px">
        <tr>
         <th>選考受験日</th>
         <th>適正点数</th>
        </tr>
        <tr>
          <td>${eazy.seSelectionDate}</td>
          <td>${eazy.seScore}</td>
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
          <td>${eazy.seTextScore}</td>
          <td>${eazy.seTextResult}</td>
        </tr>
      </table>
    </td>
    <td style="border: 0px">
      <table>
        <tr>
          <th>選考進捗状況</th>
        </tr>
        <tr>
          <td>${eazy.seSituation}</td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td style="border: 0px">
      <table style="width: 265px">
        <tr>
          <th colspan="4">履歴書評価</th>
        </tr>
        <tr>
          <c:forEach items="${resume}" var="resume">
            <td>${resume.stName}</td>
          </c:forEach>
        </tr>
        <tr>
        <c:forEach items="${resume}" var="resume">
          <td>${resume.stScore}</td>
        </c:forEach>
        </tr>
      </table>
    </td>
    <td style="border: 0px">
      <table style="width: 230px">
        <tr>
          <th colspan="4">自己PR文評価</th>
        </tr>
        <tr>
          <c:forEach items="${pr}" var="pr">
            <td>${pr.stName}</td>
          </c:forEach>
        </tr>
        <tr>
          <c:forEach items="${pr}" var="pr">
            <td>${pr.stScore}</td>
          </c:forEach>
        </tr>
      </table>
    </td>
    <td style="border: 0px">
      <table style="width: 170px">
        <tr>
          <th colspan="4">書類選考評価</th>
        </tr>
        <tr>
          <c:forEach items="${text}" var="text">
            <td>${text.stName}</td>
          </c:forEach>
        </tr>
        <tr>
          <c:forEach items="${text}" var="text">
            <td>${text.stScore}</td>
          </c:forEach>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td style="border: 0px">
      <table style="width: 265px">
        <tr>
          <th colspan="6">1次面接</th>
        </tr>
        <tr>
          <td>前辞退</td>
          <td>実施</td>
          <c:forEach items="${face1}" var="face1">
            <td>${face1.sfName}</td>
          </c:forEach>
          <th>合否</th>
        </tr>
        <tr>
          <td>${eazy.seFirstNo}</td>
          <td>${eazy.seFirstDate}</td>
          <c:forEach items="${face1}" var="face1">
            <td>${face1.sfScore}</td>
          </c:forEach>
          <td>${eazy.seFirstResult}</td>
        </tr>
      </table>
    </td>
    <td style="border: 0px">
      <table style="width: 230px">
        <tr>
          <th colspan="5">2次面接</th>
        </tr>
        <tr>
          <td>前辞退</td>
          <td>実施</td>
          <c:forEach items="${face2}" var="face2">
            <td>${face2.sfName}</td>
          </c:forEach>
          <th>合否</th>
        </tr>
        <tr>
          <td>${eazy.seSecondNo}</td>
          <td>${eazy.seSecondDate}</td>
          <c:forEach items="${face2}" var="face2">
            <td>${face2.sfScore}</td>
          </c:forEach>
          <td>${eazy.seSecondResult}</td>
        </tr>
      </table>
    </td>
    <td style="border: 0px">
      <table style="width: 170px">
        <tr>
          <th colspan="2">3次面接</th>
        </tr>
        <tr>
          <td>実施</td>
          <th>合否</th>
        </tr>
        <tr>
          <td>${eazy.seThirdDate}</td>
          <td>${eazy.seThirdResult}</td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td colspan="3" style="border: 0px">
      <table style="width: 678px">
        <tr>
          <th>内々定送付</th>
          <th>応諾</th>
          <th>辞退</th>
          <th>内定応諾</th>
          <th>応諾後辞退</th>
          <th>書類受領日</th>
          <th>決定までの日数</th>
        </tr>
        <tr>
          <td>${eazy.seSendOk}</td>
          <td>${eazy.seEarlyOk}</td>
          <td>${eazy.seEarlyNo}</td>
          <td>${eazy.seOk}</td>
          <td>${eazy.seNo}</td>
          <td>${eazy.seGetTextDate}</td>
          <td>計算</td>
        </tr>
        <tr>
          <th>辞退理由</th>
        </tr>
        <tr>
          <td colspan="7">${eazy.seNoReason}</td>
        </tr>
      </table>
    </td>
  </tr>
  <tr>
    <td style="border: 0px" colspan="3">
     <table style="width: 678px">
       <tr>
         <th>備考</th>
       </tr>
       <tr>
         <td>${eazy.seRemarks}</td>
       </tr>
     </table>
    </td>
  </tr>
</table>
</div>
<!-- 編集ボタン -->
<form action="/systemofj/Servlet" method="POST" style="display:inline-flex">
	<input type="hidden" name="page_id" value="detail">
	<input type="hidden" name="sId" value="${student.sId}">
    <input type="submit" name="submit" value="編集">
  </form>

<!-- 削除ボタン -->
<form action="/systemofj/Servlet" method="POST" style="display:inline-flex">
	<input type="hidden" name="page_id" value="detail">
	<input type="hidden" name="sId" value="${student.sId}">
    <input type="submit" name="submit" value="削除">
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