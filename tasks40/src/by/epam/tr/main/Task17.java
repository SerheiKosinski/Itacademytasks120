package by.epam.tr.main;

public class Task17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		int n;
		int j;
		
			
		m=5;
		n=5;
		j=0;
		
		
		System.out.println("m="+m);
		System.out.println("n="+n);
		
		if (m!=n) {
			j=m;
			m=n;
			n=j;
		}else {
			n=0;
			m=0;
		}
		System.out.println("m="+m);
		System.out.println("n="+n);

	}

}
