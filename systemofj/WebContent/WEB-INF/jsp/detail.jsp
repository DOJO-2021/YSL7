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
<br>
<!-- 基本情報テーブル -->

基本情報<input type="checkbox" id="s_info">
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

イベント<input type="checkbox" id="e_info">
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

インターン<input type="checkbox" id="i_info">
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

選考<input type="checkbox" id="sele_info">
<table>
  <tr>
    <td>
      <table>
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
          <td>　</td>
          <td>　</td>
          <td>　</td>
          <td>　</td>
        </tr>
      </table>
    </td>
    <td>
      <table>
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
    <td>
      <table>
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
    <td>
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
    <td>
      <table>
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
    <td>
      <table>
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
    <td>
      <table>
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
    <td>
      <table>
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
    <td>
      <table>
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
    <td>
      <table>
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
    <td colspan="3">
      <table>
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
    <td>
     <table>
       <tr>
         <th>備考</th>
       </tr>
       <tr>
         <td></td>
       </tr>
     </table>
    </td>
  </tr>
</table>

<!-- 備考テーブル -->
<table>
</table>

</body>
</html>