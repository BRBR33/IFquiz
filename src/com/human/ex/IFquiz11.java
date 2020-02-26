//함수값
package com.human.ex;
public class IFquiz11 {
	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("x 값을 입력하세요: ");
		double x = Double.parseDouble(sc.next());
		double fx;
		if(x<=0) {
			fx = x*x*x-9*x+2;
		}else {
			fx = 7*x+2;
		}
				
		System.out.println(String.format("함수값 f(x) = %f ", fx));
		
		sc.close();
				
	}
	

}
