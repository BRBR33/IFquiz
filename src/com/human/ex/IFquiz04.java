//0~10 ������
package com.human.ex;
public class IFquiz04 {
	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int x = Integer.parseInt(sc.nextLine());
	
		
		if(x>=0 && x<=10) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
		}
				
		sc.close();
				
	}
	

}
