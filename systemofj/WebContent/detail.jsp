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
  <form action="/systemofj/Servlet.java" method="POST" style="display:inline-flex">
    <input type="SUBMIT" value="メール作成">
  </form>

<!-- フィードバックボタン -->
  <form action="/systemofj/Servlet.java" method="POST" style="display:inline-flex">
    <input type="SUBMIT" value="フィードバック">
  </form>

<!-- 履歴書ボタン -->
  <form action="/systemofj/Servlet.java" method="POST" style="display:inline-flex">
    <input type="SUBMIT" value="履歴書PDFを表示">
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
	    	  <td>その他<hr>${student.Other}</td>
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
          <td>2021-07-07</td>
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

          <c:forEach items="mock" var="mock">
			<td>${mock.eDate}</td>>
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
          <c:forEach items="talk" var="talk">
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
                <c:forEach items="intern" var="intern">
          		  <td>${intern.iDate}</td>
           		</c:forEach>
              </tr>
              <tr>
              	<th>インターン出欠</th>
                <c:forEach items="intern" var="intern">
          		  <td>${intern.iAttend}</td>
           		</c:forEach>
              </tr>
              <tr>
                <th>懇親会出欠</th>
                <c:forEach items="intern" var="intern">
          		  <td>${intern.iMeeting}</td>
           		</c:forEach>

              </tr>
              <tr>
                <th>アンケート合否</th>
                <c:forEach items="intern" var="intern">
          		  <td>${intern.iAcceptance}</td>
           		</c:forEach>

              </tr>
              <tr>
                <th>アンケート提出有無</th>
                <c:forEach items="intern" var="intern">
          		  <td>${intern.iSubmit}</td>
           		</c:forEach>


              </tr>
              <tr>
                <th>資料送付</th>
                <c:forEach items="intern" var="intern">
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
          <td>予約日</td>
          <td>参加日</td>
          <td>出欠</td>
        </tr>
        <tr>
          <c:forEach items="exp" var="exp">
            <td>${exp.iDate}</td>
            <c:if test="last">
              <td>${exp.iAttend}</td>
            </c:if>
          </c:forEach>
          <td>　</td>
          <td>　</td>
          <td>　</td>
          <td>　</td>
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
          <td>　</td>
          <td>　</td>
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
          <td>　</td>
          <td>　</td>
        </tr>
      </table>
    </td>
    <td style="border: 0px">
      <table>
        <tr>
          <th>選考進捗状況</th>
        </tr>
        <tr>
          <td>　</td>
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
          <td>松野</td>
          <td>藤原</td>
          <td>板谷</td>
          <td>菅澤</td>
        </tr>
        <tr>
          <td>　</td>
          <td>　</td>
          <td>　</td>
          <td>　</td>
        </tr>
      </table>
    </td>
    <td style="border: 0px">
      <table style="width: 230px">
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
          <td>　</td>
          <td>　</td>
          <td>　</td>
          <td>　</td>
        </tr>
      </table>
    </td>
    <td style="border: 0px">
      <table style="width: 170px">
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
          <td>　</td>
          <td>　</td>
          <td>　</td>
          <td>　</td>
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
          <td>藤原</td>
          <td>板谷</td>
          <td>菅澤</td>
          <th>合否</th>
        </tr>
        <tr>
          <td>　</td>
          <td>　</td>
          <td>　</td>
          <td>　</td>
          <td>　</td>
          <td>　</td>
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
          <td>藤原</td>
          <td>板谷</td>
          <th>合否</th>
        </tr>
        <tr>
          <td>　</td>
          <td>　</td>
          <td>　</td>
          <td>　</td>
          <td>　</td>
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
          <td>　</td>
          <td>　</td>
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
          <td>　</td>
          <td>　</td>
          <td>　</td>
          <td>　</td>
          <td>　</td>
          <td>　</td>
          <td>　</td>
        </tr>
        <tr>
          <th>辞退理由</th>
        </tr>
        <tr>
          <td colspan="7">理由は～～～～～～～～～です。</td>
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
         <td>　</td>
       </tr>
     </table>
    </td>
  </tr>
</table>
</div>
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