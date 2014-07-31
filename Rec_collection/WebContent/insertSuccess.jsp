<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<b> 插入的数据如下: </b>  
	<br><br>
	<b>推荐人 = </b><%=request.getParameter("referee") %>!  
	<br><br>
	<b>手机号码 = </b><%=request.getParameter("phonenumber") %>!  
</body>
</html>