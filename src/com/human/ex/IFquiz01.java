//¦��Ȧ���Ǵ�
package com.human.ex;
public class IFquiz01 {
	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int x = Integer.parseInt(sc.nextLine());
		if (x%2==0) {
			System.out.println(x+"��(��) ¦��");
		}else {
			System.out.println(x+"��(��) Ȧ��");
		}
				
		sc.close();		
	}
	

}
