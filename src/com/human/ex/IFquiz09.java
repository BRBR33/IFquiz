//5개 중 최대 최소값
package com.human.ex;
public class IFquiz09 {
	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("첫 번째 수를 입력하세요: ");
		int x1 = Integer.parseInt(sc.next());
		System.out.print("두 번째 수를 입력하세요: ");
		int x2 = Integer.parseInt(sc.next());
		int m1,n1;
		if(x1>x2) {
			m1 = x1;
			n1 = x2;
		}else {
			m1 = x2;
			n1 = x1;
		}
		System.out.print("세 번째 수를 입력하세요: ");
		int x3 = Integer.parseInt(sc.next());
		
		if(m1>x3) {
			if(n1<x3) {
			}else {
				n1=x3;
			}
		}else {
			m1= x3;
		}
		System.out.print("네 번째 수를 입력하세요: ");
		int x4 = Integer.parseInt(sc.next());
		if(m1>x4) {
			if(n1<x4) {
			}else {
				n1=x4;
			}
		}else {
			m1=x4;
		}
		System.out.print("다섯 번째 수를 입력하세요: ");
		int x5 = Integer.parseInt(sc.next());
		if(m1>x5) {
			if(n1<x5) {
			}else {
				n1=x5;
			}
		}else {
			m1=x5;
		}
		

		System.out.println(String.format("가장 큰 수는 : %d ", m1));
		System.out.println(String.format("가장 작은 수는 : %d ", n1));
		sc.close();
				
	}
	

}
