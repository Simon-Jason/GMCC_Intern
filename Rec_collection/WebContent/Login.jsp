<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
<center>
<form action="Login.action" method="post" >  
    
	<h2>
    <font color=BLUE>登录页面</font>
   </h2>
&nbsp;&nbsp;&nbsp;
<label>ID号码:</label>
<input type="text" name="idnum">  
<br><br>
<label>用户姓名:</label>
<input type="text" name="username">  
<br><br>
<label>登录密码:</label>
<input type="password" name="password" >
<br><br>  
<input type ="submit" value="登录"> 
  
</form> 
</center>
</body>
</html>