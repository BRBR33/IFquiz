//3,4,7�� ���
package com.human.ex;
public class IFquiz03_1 {
	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int x = Integer.parseInt(sc.nextLine());
		if (x%3==0 && x%4==0 && x%7==0) {
			System.out.println(x+"��(��) 3�� 4�� 7�� ����Դϴ�.");
		}else if (x%3==0 && x%4==0) {
			System.out.println(x+"��(��) 3�� 4�� ����Դϴ�.");
		}else if (x%4==0 && x%7==0) {
			System.out.println(x+"��(��) 4�� 7�� ����Դϴ�.");
		}else if (x%3==0 && x%7==0) {
			System.out.println(x+"��(��) 3�� 7�� ����Դϴ�.");
		}else if (x%3==0) {
			System.out.println(x+"��(��) 3�� ����Դϴ�.");
		}else if (x%4==0) {
			System.out.println(x+"��(��) 4�� ����Դϴ�.");
		}else if (x%7==0) {
			System.out.println(x+"��(��) 7�� ����Դϴ�.");
		}else {
			System.out.println("3�� 4�� 7�� ����� �ƴմϴ�.");
		}
				
		sc.close();		
	}
	

}
