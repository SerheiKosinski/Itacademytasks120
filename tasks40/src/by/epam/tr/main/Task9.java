package by.epam.tr.main;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		
		Scanner xs;
		int x;

		xs = new Scanner(System.in);

		System.out.println("������� ��> ");
		x = xs.nextInt();

		Scanner ys;
		int y;

		ys = new Scanner(System.in);

		System.out.println("������� ��> ");
		y = ys.nextInt();
		

		Scanner zs;
		int z;

		zs = new Scanner(System.in);

		System.out.println("������� ��> ");
		z = zs.nextInt();
				
		
				if (x==y && x==z) {
					System.out.println("���y������� ��������������" );
				} else {
					System.out.println("���y������� �� ��������������" );
				}
		
			xs.close();
			ys.close();
			zs.close();
	}
				
}
