//두 수의 절댓값의 합
package com.human.ex;
public class IFquiz10 {
	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("첫 번째 수를 입력하세요: ");
		int a = Integer.parseInt(sc.next());
		
		if(a<0) {
			a = -a;
		}
		System.out.print("두 번째 수를 입력하세요: ");
		int b = Integer.parseInt(sc.next());
		if(b<0) {
			b = -b;
		}
		
		System.out.println(String.format("두 수의 절댓값의 합 : %d ", a+b));
		
		sc.close();
				
	}
	

}
