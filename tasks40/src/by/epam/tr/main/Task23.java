package by.epam.tr.main;

import java.util.Scanner;

public class Task23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1;
		int a;

		sc1 = new Scanner(System.in);
		System.out.println("������� ����� ������>>");
		
		a=sc1.nextInt();
		
		Scanner sc2;
		int b;

		sc2 = new Scanner(System.in);
		System.out.println("������� ����� ������>>");
		
		b=sc2.nextInt();
		
		if (a>=0 & a<=31 & b==1 || b==3 || b==5 || b==7 || b==8 || b==10 || b==12) {
			{ 
				System.out.println("���� "+a+"."+b);}
		if  (a>=0 & a<=30 & b==4 || b==6 || b==9 || b==11) {
			System.out.println("���� "+a+"."+b);}
		if  (a>=0 & a<=29 & b==2) {
			System.out.println("���� "+a+"."+b);}
		}else {
			 System.out.println("���� ������� �� ���������");	
		}
		sc1.close();
		sc2.close();
	}

}
