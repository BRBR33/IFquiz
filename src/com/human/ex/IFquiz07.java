//놀이공원
package com.human.ex;
public class IFquiz07 {
	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("현재 시간과 나이를 입력하시오(시간, 나이): ");
		int t = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		
		if(t>17) {
			System.out.println("요금은 10000원 입니다.");
		}else {
			if(a>12) {
				System.out.println("요금은 34000원 입니다.");
			}else {
				System.out.println("요금은 25000원 입니다.");
			}
			
		}
				
		sc.close();
				
	}
	

}
