package com.jason.struts2.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;

public class Collection extends ActionSupport{

	
	private static final long serialVersionUID = 1L;
	private int idnum;
	private String referee;
	private String phonenumber;
	private int encoded;
	private String candidates;
	private String phonenumber2;
	private String address1;
	private String address2;
	private String address3;
	private String style;
	private String date;
	
	public String collection() throws Exception {  
	    String url = "jdbc:mysql://localhost:3306/";  
	    String dbName = "tableinform?characterEncoding=UTF-8";  
	    String driverName = "com.mysql.jdbc.Driver";  
	    String userName = "root";  
	    String Password = "69924237";  
	    Connection con=null;  
	    Statement stmt=null;  
	   // ResultSet rs1 = null;
	    //ResultSet rs2 = null;
	    
	    int id = getIdnum();
	    String refe = getReferee();  
	    String phone = getPhonenumber();  
	    int enco = getEncoded();
	    String candi = getCandidates();
	    String phone2 = getPhonenumber2();
	    String add1 = getAddress1();
	    String add2 = getAddress2();
	    String add3 = getAddress3();
	    String sty = getStyle();
	    String da = getDate();
	    
	    try{  
	      Class.forName(driverName);  
	      con=DriverManager.getConnection(url+dbName, userName,Password);  
	      stmt=con.createStatement();  
	      String sql1 = "INSERT INTO tableinform values('"+id+"'"+","+"'"+refe+"'"+","+"'"+phone+"'"+","
	    		  		+"'"+enco+"'"+","+"'"+candi+"'"+","+"'"+phone2+"'"+","
	    		  		+"'"+add1+add2+add3+"'"+","+"'"+sty+"'"+","+"'"+da+"')";
	 

		 // String sql2 = "select * from tableinform where password='"+ pws+"'";
		 // rs1 = stmt.executeQuery(sql1);
		 int val = stmt.executeUpdate(sql1);   
		    if(val == 0){  
		      return "ERROR";  
		    }  
		    else{  
		      return "SUCCESS";  
		    }
		  
		  
	     }  
	    catch(Exception e){  
	      System.out.println(e.getMessage());  
	    }
	    return "Collection";
	   	    
	 
	  }

	public String getReferee() {
		return referee;
	}

	public void setReferee(String referee) {
		this.referee = referee;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public int getEncoded() {
		return encoded;
	}

	public void setEncoded(int encoded) {
		this.encoded = encoded;
	}

	public String getCandidates() {
		return candidates;
	}

	public void setCandidates(String candidates) {
		this.candidates = candidates;
	}

	public String getPhonenumber2() {
		return phonenumber2;
	}

	public void setPhonenumber2(String phonenumber2) {
		this.phonenumber2 = phonenumber2;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getIdnum() {
		return idnum;
	}

	public void setIdnum(int idnum) {
		this.idnum = idnum;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}


}
