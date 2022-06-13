package by.epam.tr.main;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		
		Scanner xs;
		int x;

		xs = new Scanner(System.in);

		System.out.println("сторона АВ> ");
		x = xs.nextInt();

		Scanner ys;
		int y;

		ys = new Scanner(System.in);

		System.out.println("сторана ВС> ");
		y = ys.nextInt();
		

		Scanner zs;
		int z;

		zs = new Scanner(System.in);

		System.out.println("сторона СА> ");
		z = zs.nextInt();
				
		
				if (x==y && x==z) {
					System.out.println("Треyгольник равносторонний" );
				} else {
					System.out.println("Треyгольник не равносторонний" );
				}
		
			xs.close();
			ys.close();
			zs.close();
	}
				
}
