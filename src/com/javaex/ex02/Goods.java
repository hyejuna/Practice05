package com.javaex.ex02;

public class Goods {
	
	private String name;
	private int price;
	
	
	//생성자를 새로 만들면 default 생성자 없어짐. 메인시나리오에서 default 생성자 사용하려면 이 클래스에 default 생성자 만들어야 함!
	public Goods() {}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}


	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	public void showInfo() {
		System.out.println("상품명: " +name+ ", 가격: " +price);
	}
	
}




