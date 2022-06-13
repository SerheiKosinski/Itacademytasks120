package by.epam.tr.main;

public class Task16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		
		x=4;
		y=89;
		
		if (x>0 & y>0) {
			System.out.println("Принадлежит 1 четверти");
		}
		if (x<0 & y>0) {
		    System.out.println("Принадлежит 2 четверти");
     	}
	    if (x<0 & y<0) {
		    System.out.println("Принадлежит 3 четверти");
	    } 
     	if (x>0 & y<0) {
	        System.out.println("Принадлежит 4 четверти");
     	}
	    if (x==0 ) {
		    System.out.println("Лежит на оси ОХ");
	    } 
     	if (y==0 ) {
	        System.out.println("Лежит на оси ОY");
	        
 	    
 	    	 }
	}

}
