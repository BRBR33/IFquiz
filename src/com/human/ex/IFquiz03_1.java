//3,4,7의 배수
package com.human.ex;
public class IFquiz03_1 {
	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int x = Integer.parseInt(sc.nextLine());
		if (x%3==0 && x%4==0 && x%7==0) {
			System.out.println(x+"은(는) 3과 4와 7의 배수입니다.");
		}else if (x%3==0 && x%4==0) {
			System.out.println(x+"은(는) 3과 4의 배수입니다.");
		}else if (x%4==0 && x%7==0) {
			System.out.println(x+"은(는) 4와 7의 배수입니다.");
		}else if (x%3==0 && x%7==0) {
			System.out.println(x+"은(는) 3과 7의 배수입니다.");
		}else if (x%3==0) {
			System.out.println(x+"은(는) 3의 배수입니다.");
		}else if (x%4==0) {
			System.out.println(x+"은(는) 4의 배수입니다.");
		}else if (x%7==0) {
			System.out.println(x+"은(는) 7의 배수입니다.");
		}else {
			System.out.println("3도 4도 7의 배수도 아닙니다.");
		}
				
		sc.close();		
	}
	

}
