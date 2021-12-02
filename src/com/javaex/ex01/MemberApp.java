package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		/*
		Member m01 = new Member("jws", "정우성", 50000);
		Member m02 = new Member("yjs", "유재석", 30000);
		Member m03 = new Member("lhr", "이효리", 40000);
		*/
		
		Member[] memberArray = new Member[3];
		memberArray[0] = new Member("jws", "정우성", 50000);
		memberArray[1] = new Member("yjs", "유재석", 30000);
		memberArray[2] = new Member("lhr", "이효리", 40000);
		// memberArray[0] = m01 이런식 말고 배열에만 주소를 넣는것도 문제 없을까?
		
		for(int i=0; i<memberArray.length; i++) {
			memberArray[i].showInfo();
		}
		
	}

}
