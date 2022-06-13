package by.epam.tr.main;

public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;
			
		x=4;
		y=5;
		
		System.out.println(x);
		System.out.println(y);
		
		if (x<y) {
			x=x/2+y/2;
			y=2*x*y;
		}else {
			y=x/2+y/2;
			x=2*x*y;
		}
		System.out.println(x);
		System.out.println(y);

	}

}
