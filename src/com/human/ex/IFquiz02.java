//ũ���
package com.human.ex;
public class IFquiz02 {
	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("�� ���� ������ �Է��ϼ���");
		int x1 = Integer.parseInt(sc.nextLine());
		int x2 = Integer.parseInt(sc.nextLine());
		if (x1==x2) {
			System.out.println("�� ���� ���� ���� ���Դϴ�.");
		}else if(x1>x2) {
			System.out.println(x2+" ���� "+x1+" ��(��) ū ���Դϴ�.");
		}else {
			System.out.println(x1+" ���� "+x2+" ��(��) ū ���Դϴ�.");
		}
				
		sc.close();		
	}
	

}
