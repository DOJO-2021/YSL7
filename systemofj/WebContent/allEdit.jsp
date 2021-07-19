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
<h3>インターン情報一括編集</h3>
<form action="/systemofj/Servlet.java" method="POST">
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
                <td><select name="i_meeting1"><option value=""></option><option value="〇">〇</option></select></td>
                <td><select name="i_meeting2"><option value=""></option><option value="〇">〇</option></select></td>
                <td><select name="i_meeting3"><option value=""></option><option value="〇">〇</option></select></td>
                <td><select name="i_meeting4"><option value=""></option><option value="〇">〇</option></select></td>
                <td><select name="i_meeting5"><option value=""></option><option value="〇">〇</option></select></td>
              </tr>
              <tr>
                <th>アンケート合否</th>
                <td><select name="i_acceptance1"><option value=""></option><option value="〇">〇</option></select></td>
                <td><select name="i_acceptance2"><option value=""></option><option value="〇">〇</option></select></td>
                <td><select name="i_acceptance3"><option value=""></option><option value="〇">〇</option></select></td>
                <td><select name="i_acceptance4"><option value=""></option><option value="〇">〇</option></select></td>
                <td><select name="i_acceptance5"><option value=""></option><option value="〇">〇</option></select></td>
              </tr>
              <tr>
                <th>アンケート提出有無</th>
                <td><select name="i_submit1"><option value=""></option><option value="〇">〇</option></select></td>
                <td><select name="i_submit2"><option value=""></option><option value="〇">〇</option></select></td>
                <td><select name="i_submit3"><option value=""></option><option value="〇">〇</option></select></td>
                <td><select name="i_submit4"><option value=""></option><option value="〇">〇</option></select></td>
                <td><select name="i_submit5"><option value=""></option><option value="〇">〇</option></select></td>
              </tr>
              <tr>
                <th>資料送付</th>
                <td><select name="i_document1"><option value=""></option><option value="〇">〇</option></select></td>
                <td><select name="i_document2"><option value=""></option><option value="〇">〇</option></select></td>
                <td><select name="i_document3"><option value=""></option><option value="〇">〇</option></select></td>
                <td><select name="i_document4"><option value=""></option><option value="〇">〇</option></select></td>
                <td><select name="i_document5"><option value=""></option><option value="〇">〇</option></select></td>
              </tr>
            </table>
          </td>
        </tr>
      </table>
    </td>

  </tr>
</table>
</form>
<div align="center">
<input type="submit" name="allUpdate" value="一括更新" style="width: 200px">
</div>
</body>
</html>