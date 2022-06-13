package by.epam.tr.main;

public class Task22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		int j;
		
			
		x=2;
		y=6;
		j=0;
		
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		if (y>x) {
			j=x;
			x=y;
			y=j;
		
		}
		System.out.println("x="+x);
		System.out.println("y="+y);

	}

}
