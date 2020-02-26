//키, 감탄
package com.human.ex;
public class IFquiz13 {
	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("여러분의 키를 입력하세요. 단위는 cm 입니다.\n나의 키 : ");
		double h = Double.parseDouble(sc.next());
		System.out.println("\n");
		
		if(h<175) {
			System.out.println(String.format("키가 %.1f이시군요. ", h));
		}else {
			System.out.println(String.format("키가 %.1f이시군요. \n키가 크시네요.", h));
		}
		
		sc.close();
				
	}
	

}
