//ABC
package com.human.ex;
public class IFquiz06 {
	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("A~C까지의 문자를 입력하세요.");
		String x = sc.nextLine();
		String a = "A";
		String b = "B";
		String c = "C";
		
		if(x.equals(a)||x.equals(b)||x.equals(c)) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("틀렸습니다.");
		}
				
		sc.close();
				
	}
	

}
