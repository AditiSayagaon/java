package com.sunbeam.quiz.menu;
import java.util.*;

public class StudentMenu 
{
  private static int studentMenuOptions(Scanner sc)
  {
	  System.out.println("-----StudentMenu-----");
	  System.out.println("1.View Quiz");
	  System.out.println("2. Take Quize");
	  System.out.println("3. View Scores");
	  System.out.println("4. Logout");
	  System.out.print("Enter your choice - ");
	  return sc.nextInt();
  }
  
  public static void studentMenu(Scanner sc)
  {
	  int ch;
	  while((ch=studentMenuOptions(sc)) !=4)
	  {
		  switch(ch)
		  
		  {
		  case 1:
			  System.out.println("you have selected View Quiz case");
			  break;
		  case 2:
			  System.out.println("you have selected Take Quize case");
			  break;
		  case 3:
				  System.out.println("you have selected View Score case");
				  break;
		  case 4:
			  System.out.println("you have selected Logout case");
			  break;
			  
		  default:
			  System.out.println("Wrong Choice");
			  break;
		  }
	  }
  }
}

