package week4;

import java.util.Scanner;

public class SundaySchool {

	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	
	System.out.println("Please enter the member's age:");
	int age = Integer.parseInt(in.nextLine());


	if (age < 1) {
	System.out.println("The member is a Babe in Arms.");
	
	} else if (age >= 1 && age < 3) {
	System.out.println("The member should be in Nursery.");
	
	} else if (age >= 3 && age < 12) {
	System.out.println("The member should attend Primary.");
	
	} else if (age >= 12 && age < 18) {
		
	System.out.println("Please enter the member's gender:");
	String gender = in.nextLine();
	
		
	if (gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("male")) {
	System.out.println("The member should attend Young Men." );
	
	}if (gender.equalsIgnoreCase("f") || gender.equalsIgnoreCase("female"))
	System.out.println("The member should attend Young Women's." );
	
	} else if (age >= 18) {
	System.out.println("Please enter the member's gender:");
	String gender = in.nextLine();
	
	if (gender.equalsIgnoreCase("m")|| gender.equalsIgnoreCase("male")) {
	System.out.println("The member should attend Elder's Quorum." );
	
	}if (gender.equalsIgnoreCase("f")|| gender.equalsIgnoreCase("female"))
	System.out.println("The member should attend Relief Society." );

	in.close();
	}
		}
			}
