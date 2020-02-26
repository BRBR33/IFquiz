//약수
package com.human.ex;
public class IFquiz03 {
	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int x1 = Integer.parseInt(sc.nextLine());
		System.out.print("정수를 입력하세요 : ");
		int x2 = Integer.parseInt(sc.nextLine());
		
		if(x1 % x2==0) {
			System.out.println("약수입니다.");
		}else {
			System.out.println("약수가 아닙니다.");
		}
				
		sc.close();
				
	}
	

}
