//�񸸵�
package com.human.ex;
public class IFquiz12 {
	public static void main(String[] args) {
	
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("�����Ը� �Է��ϼ���(kg) : ");
		double w = Double.parseDouble(sc.next());
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		double h = Double.parseDouble(sc.next());
		double bmi = w/((h/100)*(h/100));
		System.out.println(String.format("����� �񸸵� : %.1f ", bmi));
		if(bmi<20) {
			System.out.print("��ü��");
		}else if(bmi>=20 && bmi<25){
			System.out.print("ǥ��ü�� �����Դϴ�");	
		}else {
			System.out.print("��ü��");
		}
		sc.close();
				
	}
	

}
