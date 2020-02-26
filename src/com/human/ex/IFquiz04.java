//0~10 정오답
package com.human.ex;
public class IFquiz04 {
	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int x = Integer.parseInt(sc.nextLine());
	
		
		if(x>=0 && x<=10) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("틀렸습니다.");
		}
				
		sc.close();
				
	}
	

}
