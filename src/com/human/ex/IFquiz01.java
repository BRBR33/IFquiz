//짝수홀수판단
package com.human.ex;
public class IFquiz01 {
	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int x = Integer.parseInt(sc.nextLine());
		if (x%2==0) {
			System.out.println(x+"은(는) 짝수");
		}else {
			System.out.println(x+"은(는) 홀수");
		}
				
		sc.close();		
	}
	

}
