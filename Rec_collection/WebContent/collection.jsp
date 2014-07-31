<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<form action="Collection.action" method="post" >  
   
	<h2>
    <font color=BLUE>推荐报装单采集</font>
   </h2>
&nbsp;&nbsp;&nbsp;
<label>推荐人:</label>
<input type="text" name="referee">  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>手机号码:</label>
<input type="text" name="phonenumber">  
<br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>编码:</label>
<input type="text" name="encoded"> 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>Id号码:</label>
<input type="text" name="idnum">  
<br><br><br>

<label>被推荐人:</label>
<input type="text" name="candidates">  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>手机号码:</label>
<input type="text" name="phonenumber2" >
<br><br> 

<label>家宽类型:</label>
<input type="text" name="style">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>报装日期:</label>
<input type="text" name="date">
<br><br> 

<label>地址:</label>
<select name="address1"> 
<option value ="惠城区">惠城区</option>
<option value ="惠阳区">惠阳区</option>
<option value ="仲恺区">仲恺区</option>
</select>
<select name="addrees2"> 
<option value ="惠城区">惠城区</option>
<option value ="惠阳区">惠阳区</option>
<option value ="仲恺区">仲恺区</option>
</select>
<input type="text" name="address3">
 
<br><br> 
<input type ="submit" value="提交"> 
  
</form> 
</center>
</body>
</html>