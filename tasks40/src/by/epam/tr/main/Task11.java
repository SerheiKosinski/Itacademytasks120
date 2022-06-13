package by.epam.tr.main;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double AB;
		double BC;
		double CA;
		
		double DE;
		double EF;
		double FD;
		
		double S1;
		double S2;
		
		double  p1;
		double  p2;
		
		
		AB=5;
		BC=3;
		CA=3;
		
		DE=6;
		EF=7;
		FD=1;
		
		p1=(AB+BC+CA)/2;
		p2=(DE+EF+FD)/2;
		
		S1=Math.sqrt(p1*(p1-AB)*(p1-BC)*(p1-CA));
		S2=Math.sqrt(p2*(p2-DE)*(p2-EF)*(p2-FD));
		
		

		if (S1>S2) {
			System.out.print("S1>S2");
			if (S2>S1) {
				System.out.print("S2>S1");
			}
		}else {
			System.out.print("S2=S1");
		}
	}
	

}
