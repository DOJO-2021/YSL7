<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table, td, th {
border: 2px #000000 solid;
}
hr {
margin-block-start: 0em;
margin-block-end: 0em;
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

<!-- 基本情報テーブル -->
  <div class="student">
	<table>
	  <tr>
	    <td>氏名<hr>椹篤弥</td>
	    <td>フリガナ<hr>サワラギアツヤ</td>
	    <td>年齢<hr>23</td>
	    <td>住所<hr>東京都大田区</td>
	  </tr>
	  <tr>
	    <td>学校名<hr>日本大学</td>
	    <td>学部<hr>経済学部</td>
	    <td>学科<hr>経済学科</td>
	    <td>文理<hr>文</td>
	  </tr>
	  <tr>
	    <td>PCメール<hr>@gmail.com</td>
	    <td>携帯メール<hr>@docomo.ne.jp</td>
	  </tr>
	  <tr>
	    <td>キャリタス<hr>〇</td>
	    <td>リクナビ<hr>　</td>
	    <td>マイナビ<hr>　</td>
	    <td>その他<hr>　</td>
	  </tr>
	</table>
  </div>
<!-- イベントテーブル -->

<table>
  <tr>
    <td>
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
    <td>
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
          <td>2021-08-08</td>
		  <td>2021-08-12</td>
		  <td>2021-08-12</td>

        </tr>
      </table>
    </td>
    <td>
      <table>
        <tr>
          <th colspan="2">座談会</th>
        </tr>
        <tr>
          <td>参加日</td>
		  <td>参加日</td>
        </tr>
        <tr>
          <td>2021-08-14</td>
          <td>2021-08-19</td>
        </tr>
      </table>
    </td>
  </tr>
</table>

<!-- インターンテーブル -->
<table>
  <tr>
    <td>
      <table>
        <tr>
          <td>
            <table>
              <tr>
                <td></td>
                <th>1day</th>
                <th>3days</th>
                <th>初級</th>
                <th>中級</th>
                <th>準備</th>
              </tr>
              <tr>
                <td></td>
                <td>2021-08-08</td>
                <td>2021-08-12</td>
                <td>2021-08-15</td>
                <td>2021-08-23</td>
                <td>2021-08-30</td>
              </tr>
              <tr>
                <th>懇親会出欠</th>
                <td>　</td>
                <td>　</td>
                <td>　</td>
                <td>〇</td>
                <td>　</td>
              </tr>
            </table>
          </td>
        </tr>
      </table>
    </td>
    <td>
      <table>
        <tr>
          <th>アンケート提出有無</th>
          <th>アンケート合否</th>
          <th>資料送付</th>
        </tr>
        <tr>
          <td>なし</td>
          <td>合格</td>
          <td>済</td>
        </tr>
      </table>
    </td>
  </tr>
</table>

<!-- 選考テーブル -->
<table>
  <tr>
    <td>
      <table>
        <tr>
          <th>説明会</th>
        </tr>
        <tr>
          <td>申込日</td>
          <td>予約日</td>
          <td>参加日</td>
          <td>出欠</td>
        </tr>
        <tr>
        </tr>
      </table>
    </td>
    <td>
      <table>
        <tr>
        </tr>
        <tr>
        </tr>
        <tr>
        </tr>
      </table>
    </td>
    <td>

    </td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
  </tr>
  <tr>
  </tr>
</table>

<!-- 備考テーブル -->
<table>
</table>

</body>
</html>