//5�� �� �ִ� �ּҰ�
package com.human.ex;
public class IFquiz09 {
	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է��ϼ���: ");
		int x1 = Integer.parseInt(sc.next());
		System.out.print("�� ��° ���� �Է��ϼ���: ");
		int x2 = Integer.parseInt(sc.next());
		int m1,n1;
		if(x1>x2) {
			m1 = x1;
			n1 = x2;
		}else {
			m1 = x2;
			n1 = x1;
		}
		System.out.print("�� ��° ���� �Է��ϼ���: ");
		int x3 = Integer.parseInt(sc.next());
		
		if(m1>x3) {
			if(n1<x3) {
			}else {
				n1=x3;
			}
		}else {
			m1= x3;
		}
		System.out.print("�� ��° ���� �Է��ϼ���: ");
		int x4 = Integer.parseInt(sc.next());
		if(m1>x4) {
			if(n1<x4) {
			}else {
				n1=x4;
			}
		}else {
			m1=x4;
		}
		System.out.print("�ټ� ��° ���� �Է��ϼ���: ");
		int x5 = Integer.parseInt(sc.next());
		if(m1>x5) {
			if(n1<x5) {
			}else {
				n1=x5;
			}
		}else {
			m1=x5;
		}
		

		System.out.println(String.format("���� ū ���� : %d ", m1));
		System.out.println(String.format("���� ���� ���� : %d ", n1));
		sc.close();
				
	}
	

}
