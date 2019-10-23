<%@page language="java" autoFlush="true" contentType="text/html;charset=utf-8" pageEncoding="UTF-8" %>
<html>
<body>
<h2>上传页面</h2>
<div>
    <form action="upload" enctype="multipart/form-data" method="post">
        <input type="file" name="file">
        <input type="submit" value="上传">
    </form>

</div>
</body>
</html>