//음수
package com.human.ex;
public class IFquiz05 {
	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("한 개의 숫자를 입력 : ");
		int x = Integer.parseInt(sc.nextLine());
	
		
		if(x<0) {
			System.out.println(x+"은(는) 음수입니다.");
		}
				
		sc.close();
				
	}
	

}
