package by.epam.tr.main;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner xs;
		int r1;

		xs = new Scanner(System.in);

		System.out.println("r1> ");
		r1 = xs.nextInt();

		Scanner ys;
		int r2;

		ys = new Scanner(System.in);

		System.out.println("r2> ");
		r2 = ys.nextInt();
		
		double S1;
		double S2;
		
		S1=3.14*r1*r1;
		S2=3.14*r2*r2;

		if (S1<S2) {
			System.out.print("S1<S2");
			if (S2<S1) {
				System.out.print("S2<S1");
			}
		}else {
			System.out.print("S2=S1");
		}
		xs.close();
		ys.close();
	}

	
}
