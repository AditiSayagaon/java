package com.sunbeam.quiz.menu;
import java.util.*;

public class AdminMenu 
{
  private static int adminMenuOptions(Scanner sc)
  {
	
	  System.out.println("1.Create Quiz");
	  System.out.println("2. List Quizzes");
	  System.out.println("3. Logout");
	  System.out.println("4. Delete Quiz");
	  System.out.println("5. Update Quiz");
	  System.out.print("Enter your choice - ");
	  return sc.nextInt();
  }
  
  public static void adminMenu(Scanner sc)
  {
	  int ch;
	  while((ch=adminMenuOptions(sc)) !=3)
	  {
		  switch(ch)
		  
		  {
		  case 1:
			  System.out.println("you have selected create a Quiz case");
			  break;
		  case 2:
			  System.out.println("you have selected List Quizzes case");
			  break;
		  case 3:
			  System.out.println("you have selected Logout case");
			  break;
		  case 4:
			  System.out.println("you have selected Delete case");
			  break;
		  case 5:	  
			  System.out.println("you have selected Update case");
			  break;
			  
		  default:
			  System.out.println("Wrong Choice");
			  break;
		  }
	  }
	  System.out.println("Adimin Logout");
  }
}
