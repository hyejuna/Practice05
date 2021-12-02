package com.javaex.ex10;

public class Book {
	//필드
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	//생성자
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}
	

	//메소드 g/s
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//메소드 일반
	public static void rent(Book[] books, int num) {
		books[num-1].stateCode = 0;
		System.out.println(books[num-1].title+"이(가) 대여 됐습니다.");
	}
	
	public static void displayBookInfo(Book[] books) {
		
		for(int i=0; i<books.length; i++) {
			String on;
			if(books[i].stateCode==0) {
				on = "대여중";
			} else {
				on = "재고있음";
			}
			System.out.println(books[i].bookNo+ " 첵 제목:" +books[i].title+ ", 작가:" +books[i].author+ ", 대여 유무:" +on);
		}
	}


    
    
    
    
    
}
