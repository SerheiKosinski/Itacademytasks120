package by.epam.tr.main;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner xs;
		int x;

		xs = new Scanner(System.in);

		System.out.println("x> ");
		x = xs.nextInt();

		Scanner ys;
		int y;

		ys = new Scanner(System.in);

		System.out.println("y> ");
		y = ys.nextInt();
		
		
		Scanner zs;
		int z;

		zs = new Scanner(System.in);

		System.out.println("z> ");
		z = zs.nextInt();
		
		
		

		if (x >= 0)  {
			x=x*x; 
			} else {
				x=x*x*x*x;
				}
		System.out.println("x=" +x);
		
		if (y >= 0)  {
			y=y*y; 
			} else { 
				y=y*y*y*y;
				
				}
		System.out.println("y=" +y);
		
		
		if (z >= 0)  {
			z=z*z;
			} else 
			{z=z*z*z*z;
				}
		System.out.println("z=" +z);
		
		
		
		
		

		xs.close();
		ys.close();
		zs.close();
	
	}

}
