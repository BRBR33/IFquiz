package com.human.ex;

public class SayHello {

	public static void main(String[] args) {

	java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("안녕하세요 몇 번 말할래? : ");
		String str = sc.nextLine();
		int x = Integer.parseInt(str);
		int a=0; //초기값
		while(a<x) {//비교값
			System.out.println("안녕하세요");
			a++; //변환값
			
		}
		sc.close();
		
	}

}
