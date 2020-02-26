//국영수
package com.human.ex;
public class IFquiz08 {
	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("국어, 영어, 수학 성적을 입력하세요: ");
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		double d = (double) (a+b+c)/3;
		System.out.println(String.format("평균 성적 : %.1f ", d));
		if(d>=80) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
			
		}
				
		sc.close();
				
	}
	

}
