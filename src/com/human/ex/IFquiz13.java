//Ű, ��ź
package com.human.ex;
public class IFquiz13 {
	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("�������� Ű�� �Է��ϼ���. ������ cm �Դϴ�.\n���� Ű : ");
		double h = Double.parseDouble(sc.next());
		System.out.println("\n");
		
		if(h<175) {
			System.out.println(String.format("Ű�� %.1f�̽ñ���. ", h));
		}else {
			System.out.println(String.format("Ű�� %.1f�̽ñ���. \nŰ�� ũ�ó׿�.", h));
		}
		
		sc.close();
				
	}
	

}
