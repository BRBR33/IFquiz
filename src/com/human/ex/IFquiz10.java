//�� ���� ������ ��
package com.human.ex;
public class IFquiz10 {
	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է��ϼ���: ");
		int a = Integer.parseInt(sc.next());
		
		if(a<0) {
			a = -a;
		}
		System.out.print("�� ��° ���� �Է��ϼ���: ");
		int b = Integer.parseInt(sc.next());
		if(b<0) {
			b = -b;
		}
		
		System.out.println(String.format("�� ���� ������ �� : %d ", a+b));
		
		sc.close();
				
	}
	

}
