//���̰���
package com.human.ex;
public class IFquiz07 {
	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("���� �ð��� ���̸� �Է��Ͻÿ�(�ð�, ����): ");
		int t = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());
		
		if(t>17) {
			System.out.println("����� 10000�� �Դϴ�.");
		}else {
			if(a>12) {
				System.out.println("����� 34000�� �Դϴ�.");
			}else {
				System.out.println("����� 25000�� �Դϴ�.");
			}
			
		}
				
		sc.close();
				
	}
	

}
