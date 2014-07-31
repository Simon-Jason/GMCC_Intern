package com.jason.struts2.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.struts2.components.Select;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private int password;
	private int idnum;
	private String msg;
	
	public String execute() throws Exception {  
	    String url = "jdbc:mysql://localhost:3306/";  
	    String dbName = "testdb";  
	    String driverName = "com.mysql.jdbc.Driver";  
	    String userName = "root";  
	    String Password = "69924237";  
	    Connection con=null;  
	    Statement stmt=null;  
	    ResultSet rs1 = null;
	    ResultSet rs2 = null;
	    
	    String uname=getUsername();  
	    int pws=getPassword();  
	    int id=getIdnum();
	    
	    try{  
	      Class.forName(driverName);  
	      con=DriverManager.getConnection(url+dbName, userName,Password);  
	      stmt=con.createStatement();  
	      String sql1 = "select * from manager where username='"+ uname + "'";
		  String sql2 = "select * from manager where password='"+ pws+"'";
		  rs1 = stmt.executeQuery(sql1);
		  if (!rs1.next()) {
		  // 判断用户名是不是 存在,如果不是则输出信息，返回界面
		  this.setMsg("用户名不正确！");
		  System.out.println("username error!");
		  return "usererror";
		  }else {
			  rs2 = stmt.executeQuery(sql2);
			  if (!rs2.next()) {
		    	this.setMsg("密码不正确");
				System.out.println("password error!");
				return "passworderror";
			  }
		  }
		  
		  
	     }  
	    catch(Exception e){  
	      System.out.println(e.getMessage());  
	    }
	    return "manager";
	   	    
	   // stmt = con.createStatement();  
	   
	    /*int val = stmt.executeUpdate("INSERT into login VALUES("+id+","+pws+","+"'"+uname+"'"+")");   
	    if(val == 0){  
	      return "ERROR";  
	    }  
	    else{  
	      return "SUCCESS";  
	    }*/  
	  }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public int getIdnum() {
		return idnum;
	}

	public void setIdnum(int idnum) {
		this.idnum = idnum;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}  
	 
	  
	  
	
}
