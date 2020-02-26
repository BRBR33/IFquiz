//비만도
package com.human.ex;
public class IFquiz12 {
	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("몸무게를 입력하세요(kg) : ");
		double w = Double.parseDouble(sc.next());
		System.out.print("키를 입력하세요(cm) : ");
		double h = Double.parseDouble(sc.next());
		double bmi = w/((h/100)*(h/100));
		System.out.println(String.format("당신의 비만도 : %.1f ", bmi));
		if(bmi<20) {
			System.out.print("저체중");
		}else if(bmi>=20 && bmi<25){
			System.out.print("표준체중 정상입니다");	
		}else {
			System.out.print("과체중");
		}
		sc.close();
				
	}
	

}
