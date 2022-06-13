package by.epam.tr.main;

import java.util.Scanner;

public class Task21 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc;
		String q;
		String w;
		w="W";
	
		sc = new Scanner(System.in);
		System.out.println("Who are you? Man or Woman? Enter W/M.>");
		
		q= sc.nextLine();
		
		if (q.equals("w")) {
		     System.out.println("you like Men");
		}else {
			 System.out.println("you like Women");	
		}
		sc.close();
	}

}
