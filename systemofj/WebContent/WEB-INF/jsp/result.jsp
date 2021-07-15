<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>リザルトページ</title>
</head>
<body>
<header> </header>

<p>アップロードが完了しました。</p>

<h1 class="result">
	<c:out value="${errMsg.title}"/>
</h1>

<p class="result">
	<c:out value="${errMsg.message}"/>
</p>


<a href="/systemofj/Servlet">トップページに戻る</a>



<div id="upFileWrap">
    <div id="inputFile">
        <!-- ドラッグ&ドロップエリア -->
        <p id="dropArea">ここにファイルをドロップしてください<br>または</p>

        <!-- 通常のinput[type=file] -->
        <div id="inputFileWrap">
            <input type="file" name="uploadFile" id="uploadFile">
            <div id="btnInputFile"><span>ファイルを選択する</span></div>
            <div id="btnChangeFile"><span>ファイルを変更する</span></div>
        </div>
    </div>
</div>

<style>
#inputFile {
    position: relative;
    padding: 180px 0 100px;
    text-align: center;
}

#dropArea {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    padding: 100px 0 0;
    border: 2px dashed #494949;
    background: rgba(22, 165, 191, 0);
    transition: all 0.25s cubic-bezier(0.21, 0.51, 0.51, 1);
}

#dropArea.dragover {
    border: 2px solid #16a5bf;
    background: rgba(22, 165, 191, 0.6);
}

#uploadFile {
    position: absolute;
    top: 0;
    left: 0;
    z-index: 10;
    display: block;
    width: 300px;
    height: 80px;
    opacity: 0;
}

#inputFileWrap {
    position: relative;
    display: inline-block;
}

#btnInputFile,
#btnChangeFile {
    display: table;
    width: 300px;
}

#btnChangeFile {
    display: none;
}


#btnInputFile span,
#btnChangeFile span {
    position: relative;
    z-index: 2;
    display: table-cell;
    width: 300px;
    height: 80px;
    border: 1px solid #333;
    border-radius: 4px;
    background: #333;
    text-decoration: none;
    color: #fff;
    font-size: 26px;
    line-height: 1;
    font-weight: bold;
    vertical-align: middle;
}

#upFileWrap.selected #btnInputFile {
    display: none;
}

#upFileWrap.selected #btnChangeFile {
    display: table;
}
</style>


</body>
<script>
//ドラッグ&ドロップエリアの取得
var fileArea = document.getElementById('dropArea');

// input[type=file]の取得
var fileInput = document.getElementById('uploadFile');

// ドラッグオーバー時の処理
fileArea.addEventListener('dragover', function(e){
    e.preventDefault();
    fileArea.classList.add('dragover');
});

// ドラッグアウト時の処理
fileArea.addEventListener('dragleave', function(e){
    e.preventDefault();
    fileArea.classList.remove('dragover');
});

// ドロップ時の処理
fileArea.addEventListener('drop', function(e){
    e.preventDefault();
    fileArea.classList.remove('dragover');

    // ドロップしたファイルの取得
    var files = e.dataTransfer.files;

    // 取得したファイルをinput[type=file]へ
    fileInput.files = files;

    if(typeof files[0] !== 'undefined') {
        //ファイルが正常に受け取れた際の処理
    } else {
        //ファイルが受け取れなかった際の処理
    }
});

// input[type=file]に変更があれば実行
// もちろんドロップ以外でも発火します
fileInput.addEventListener('change', function(e){
    var file = e.target.files[0];

    if(typeof e.target.files[0] !== 'undefined') {
        // ファイルが正常に受け取れた際の処理
    } else {
        // ファイルが受け取れなかった際の処理
    }
}, false);
</script>

</html>