package com.test.entity;

public class book {
	private String ISBN=null;
	private String Title=null;
	private int AuthorID=0;
	private String Publisher=null;
	private String date=null;
	private String price=null;
	private String aname=null;
	private int age=0;
	private String country=null;
	
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
	
	public String getCountry() {
		  return country;
	}
	public void setCountry(String country) {
		  this.country = country;
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
	
	
}
