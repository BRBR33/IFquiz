package com.human.ex;

public class SayHello {

	public static void main(String[] args) {

	java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("�ȳ��ϼ��� �� �� ���ҷ�? : ");
		String str = sc.nextLine();
		int x = Integer.parseInt(str);
		int a=0; //�ʱⰪ
		while(a<x) {//�񱳰�
			System.out.println("�ȳ��ϼ���");
			a++; //��ȯ��
			
		}
		sc.close();
		
	}

}
