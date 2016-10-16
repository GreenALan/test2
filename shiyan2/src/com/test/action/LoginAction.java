package com.test.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.text.*;
import java.util.Calendar;
import java.sql.*;

import com.test.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.math.*;

public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -74906200993380354L;
	private String username=null;
	private String password=null;
	private String delname=null;
	public List<book> alist=new ArrayList<book>();
	public List<book> list=new ArrayList<book>();
	private String ISBN=null;
	private String Title=null;
	private int AuthorID=0;
	private String Publisher=null;
	private String date=null;
	private String price=null;
	private String aname=null;
	private int age=0;
	private String country=null;
	private int result=0;
	
	public int getResult() {
		  return result;
	}
	public void setResult(int result) {
		  this.result = result;
	}
	
	public String getISBN() {
		  return ISBN;
	}
	public void setISBN(String ISBN) {
		  this.ISBN = ISBN;
	} 
	
	public String getAname() {
		  return aname;
	}
	public void setAname(String aname) {
		  this.aname = aname;
	}
	
	public int getAge() {
		  return age;
	}
	public void setAge(int age) {
		  this.age = age;
	}
	
	public String getTitle() {
		  return Title;
	}
	public void setTitle(String Title) {
		  this.Title = Title;
	}
	
	public String getPublisher() {
		  return Publisher;
	}
	public void setPublisher(String Publisher) {
		  this.Publisher = Publisher;
	}
	
	public String getDate() {
		  return date;
	}
	public void setDate(String date) {
		  this.date = date;
	}
	
	public String getPrice() {
		  return price;
	}
	public void setPrice(String price) {
		  this.price = price;
	}
	
	public int getAuthorID() {
		  return AuthorID;
	}
	public void setAuthorID(int AuthorID) {
		  this.AuthorID = AuthorID;
	}
	public String getDelname() {
		  return delname;
	}
	public void setDelname(String delname) {
		  this.delname = delname;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry(){
		return country;
	}
	
	public void setCountry(String country){
		this.country=country;
	}
	
	public List<book> getList(){
		return list;
	}
	
	public void setList(List<book> list){
		this.list=list;
	}
	
	public List<book> getAlist(){
		return alist;
	}
	
	public void setAlist(List<book> alist){
		this.alist=alist;
	}
	
	@Override
	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		Integer counter = (Integer) ctx.getApplication().get("counter");
		if (null == counter) {
			counter = 1;
		} else {
			counter += 1;
		}
		ctx.getApplication().put("counter", counter);
		ctx.getSession().put("user", getUsername());
	
		 String driver = "com.mysql.jdbc.Driver";  
       /* // URL指向要访问的数据库名world        
		 String url = "jdbc:mysql://127.0.0.1:3306/bookdb";  
         // MySQL配置时的用户名           
		 String user = "root";           
		 // MySQL配置时的密码          
		 String password = "2333";  */
		 
		 String url = "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_wangzhpp";  
		 String user = "5oyjx5lj4m"; 
		 String password = "1i35xy11ml110kh10x0x4wlwzzlljhkhj30iji3j"; 
		 
		 Class.forName(driver).newInstance();;
		try
		{
			Connection conn = DriverManager.getConnection(url,user,password);//注意是三个参数
			Statement stmt = conn.createStatement();  
			
			//String sql="insert into book(ISBN,AuthorID,Title) values('"+getUsername()+"','"+getPassword()+"','"+getCountry()+"')";
			String sql="select * from  author where name='"+getUsername()+"'";
			//int result = stmt.executeUpdate(sql);
			ResultSet rs=stmt.executeQuery(sql);
			int id=0,num=0,age=0;
			String aname=null,country=null;
			while(rs.next()!=false){
				id=rs.getInt(1);
				aname=rs.getString("Name");
				country=rs.getString("Country");
				age=rs.getInt("Age");
			}
			sql="select * from book where AuthorID='"+Integer.toString(id)+"'";
			rs=stmt.executeQuery(sql);
			while(rs.next()!=false){
				num++;
				book now=new book();
				now.setISBN(rs.getString(1));
				now.setTitle(rs.getString(2));
				now.setAuthorID(rs.getInt(3));
				now.setPublisher(rs.getString(4));
				now.setDate(rs.getString("PublishDate"));
				BigDecimal p=null;
				p=rs.getBigDecimal("price");
				String pp=null;
				if(p!=null)pp=p.toString();
				now.setPrice(pp);
				now.setAge(age);
				now.setAname(aname);
				now.setCountry(country);
				
				list.add(now);
			}
			ctx.put("tip", id);
			if(num==0)return "MEIYOU";
            return SUCCESS;
		}
		catch (SQLException e)
		{
			e.printStackTrace();ctx.put("tip", "mysql bu ok!");return ERROR;
		}

	}
	
	public String del() throws Exception {
		 String driver = "com.mysql.jdbc.Driver";  
      /*   // URL指向要访问的数据库名world        
		 String url = "jdbc:mysql://127.0.0.1:3306/bookdb";  
         // MySQL配置时的用户名           
		 String user = "root";           
		 // MySQL配置时的密码          
		 String password = "2333";  */
		
		 String url = "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_wangzhpp";  
		 String user = "5oyjx5lj4m"; 
		 String password = "1i35xy11ml110kh10x0x4wlwzzlljhkhj30iji3j"; 
		 
		 Class.forName(driver).newInstance();;
		try
		{
			Connection conn = DriverManager.getConnection(url,user,password);//注意是三个参数
			Statement stmt = conn.createStatement();  
			
			//String sql="insert into book(ISBN,AuthorID,Title) values('"+getUsername()+"','"+getPassword()+"','"+getCountry()+"')";
			String sql="delete from book where Title='"+getDelname()+"'";
			result = stmt.executeUpdate(sql);
			//ResultSet rs=stmt.executeQuery(sql);
            return SUCCESS;
		}
		catch (SQLException e)
		{
			e.printStackTrace();return ERROR;
		}

	}
	
	public String insbook() throws Exception {
		 String driver = "com.mysql.jdbc.Driver";  
      /*  // URL指向要访问的数据库名world        
		 String url = "jdbc:mysql://127.0.0.1:3306/bookdb";  
        // MySQL配置时的用户名           
		 String user = "root";           
		 // MySQL配置时的密码          
		 String password = "2333"; */ 
		
		 String url = "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_wangzhpp";  
		 String user = "5oyjx5lj4m"; 
		 String password = "1i35xy11ml110kh10x0x4wlwzzlljhkhj30iji3j";
		 
		 Class.forName(driver).newInstance();;
		try
		{
			Connection conn = DriverManager.getConnection(url,user,password);//注意是三个参数
			Statement stmt = conn.createStatement();  
			
			String sql="insert into book(ISBN,AuthorID,Title,Publisher,PublishDate,price) values('"+getISBN()+"',"+getAuthorID()+",'"+getTitle()+"','"+getPublisher()+"','"+getDate()+"',"+getPrice()+");";
			result = stmt.executeUpdate(sql);
			
			ResultSet rs=stmt.executeQuery("select count(*) num from book");
			while(rs.next()!=false)result = rs.getInt("num");
           return SUCCESS;
		}
		catch (SQLException e)
		{
			e.printStackTrace();return ERROR;
		}

	}
	
	public String insauthor() throws Exception {
		 String driver = "com.mysql.jdbc.Driver";  
     /*  // URL指向要访问的数据库名world        
		 String url = "jdbc:mysql://127.0.0.1:3306/bookdb";  
       // MySQL配置时的用户名           
		 String user = "root";           
		 // MySQL配置时的密码          
		 String password = "2333";  */
		
		 String url = "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_wangzhpp";  
		 String user = "5oyjx5lj4m"; 
		 String password = "1i35xy11ml110kh10x0x4wlwzzlljhkhj30iji3j";
		 
		 Class.forName(driver).newInstance();
		try
		{
			Connection conn = DriverManager.getConnection(url,user,password);//注意是三个参数
			Statement stmt = conn.createStatement();  
			
			String sql="insert into author(Name,Age,Country) values('"+getAname()+"',"+getAge()+",'"+getCountry()+"');";
			result = stmt.executeUpdate(sql);
		
			ResultSet rs=stmt.executeQuery("select count(*) num from author");
			while(rs.next()!=false)result = rs.getInt("num");
          return SUCCESS;
		}
		catch (SQLException e)
		{
			e.printStackTrace();return ERROR;
		}

	}
	
	public String allauthor() throws Exception {
		 String driver = "com.mysql.jdbc.Driver";  
     /* // URL指向要访问的数据库名world        
		 String url = "jdbc:mysql://127.0.0.1:3306/bookdb";  
      // MySQL配置时的用户名           
		 String user = "root";           
		 // MySQL配置时的密码          
		 String password = "2333";  */
		
		 String url = "jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_wangzhpp";  
		 String user = "5oyjx5lj4m"; 
		 String password = "1i35xy11ml110kh10x0x4wlwzzlljhkhj30iji3j";
		 
		 Class.forName(driver).newInstance();
		try
		{
			Connection conn = DriverManager.getConnection(url,user,password);//注意是三个参数
			Statement stmt = conn.createStatement();  
			
			String sql="select * from author";
			//result = stmt.executeUpdate(sql);
		
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()!=false){
				book now=new book();
				now.setISBN(rs.getString("Name"));
				now.setTitle(rs.getString("Country"));
				now.setAuthorID(rs.getInt("AuthorID"));
				alist.add(now);
			}
         return SUCCESS;
		}
		catch (SQLException e)
		{
			e.printStackTrace();return ERROR;
		}

	}
	
}
