//������
package com.human.ex;
public class IFquiz08 {
	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ �Է��ϼ���: ");
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		double d = (double) (a+b+c)/3;
		System.out.println(String.format("��� ���� : %.1f ", d));
		if(d>=80) {
			System.out.println("�հ��Դϴ�.");
		}else {
			System.out.println("���հ��Դϴ�.");
			
		}
				
		sc.close();
				
	}
	

}
