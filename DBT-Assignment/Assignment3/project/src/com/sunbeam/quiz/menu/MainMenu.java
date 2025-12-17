package com.sunbeam.quiz.menu;
import java.util.*;

public class MainMenu 
{
	private static int mainMenuOptions(Scanner sc) {
		System.out.println("--------MainMenu--------");
		System.out.println("1. Admin Login");
		System.out.println("2. Student Register");
		System.out.println("3. Student Login");
		System.out.println("4. Exit");
		System.out.print("Enter your choice - ");
		return sc.nextInt();
	}
	
public static void mainMenu(Scanner sc)
{
	int ch;
	while((ch=mainMenuOptions(sc))!=4)
	{
		switch(ch)
		{
		case 1:
			System.out.println("you have selected Admin Login case");
			AdminMenu.adminMenu(sc);
			break;
		case 2:
			System.out.println("you have selected Student Register case");
			break;
		case 3:
			System.out.println("you have selected  Student Login case");	
			StudentMenu.studentMenu(sc);
	        break;
	        
	    default: 
	    	System.out.println("invalid choice");
	    	break;
		}
	}
}

}
