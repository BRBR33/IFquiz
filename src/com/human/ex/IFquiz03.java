//���
package com.human.ex;
public class IFquiz03 {
	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int x1 = Integer.parseInt(sc.nextLine());
		System.out.print("������ �Է��ϼ��� : ");
		int x2 = Integer.parseInt(sc.nextLine());
		
		if(x1 % x2==0) {
			System.out.println("����Դϴ�.");
		}else {
			System.out.println("����� �ƴմϴ�.");
		}
				
		sc.close();
				
	}
	

}
