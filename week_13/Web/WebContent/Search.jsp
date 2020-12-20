<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GoogleSearch</title>
</head>
<body>
<form action='${requestUri}' method='get'>
<input type='text' name='keyword' placeholder = 'keyword'/>
<input type='submit' value='submit' />
</form>
</body>
</html>