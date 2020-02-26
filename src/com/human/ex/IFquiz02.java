//크기비교
package com.human.ex;
public class IFquiz02 {
	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("두 개의 정수를 입력하세요");
		int x1 = Integer.parseInt(sc.nextLine());
		int x2 = Integer.parseInt(sc.nextLine());
		if (x1==x2) {
			System.out.println("두 수의 값은 같은 값입니다.");
		}else if(x1>x2) {
			System.out.println(x2+" 보다 "+x1+" 이(가) 큰 값입니다.");
		}else {
			System.out.println(x1+" 보다 "+x2+" 이(가) 큰 값입니다.");
		}
				
		sc.close();		
	}
	

}
