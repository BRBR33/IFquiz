//ABC
package com.human.ex;
public class IFquiz06 {
	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("A~C������ ���ڸ� �Է��ϼ���.");
		String x = sc.nextLine();
		String a = "A";
		String b = "B";
		String c = "C";
		
		if(x.equals(a)||x.equals(b)||x.equals(c)) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
		}
				
		sc.close();
				
	}
	

}
