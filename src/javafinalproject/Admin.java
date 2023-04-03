
package javafinalproject;

import java.util.Scanner;
  public class Admin extends Menu
{
	public void aReg()
	{
		Scanner ED = new Scanner(System.in);
    System.out.print("\n\n\n\n                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n\n\n");
	System.out.println("\n\n                                               |||||||||||||||||||||||||||||||||||||||||");
	System.out.println("                                               ||                                     ||");
    System.out.println("                                               ||  <<   WELLCOME TO LOG IN MENU   >>  ||");
    System.out.println("                                               ||                                     ||");
	System.out.println("                                               ||     {1} LOG IN                      ||");
	System.out.println("                                               ||     {2} EXIT                        ||");
    System.out.println("                                               ||                                     ||");
	System.out.println("                                               |||||||||||||||||||||||||||||||||||||||||\n");
    System.out.print("                                                       Enter Your Choice: ");
	int cg;
	do{
    cg = ED.nextInt();
     switch(cg)
     { 
	  case 1:
	  System.out.println("\n                                               Going To Log In Menu ....");
	  LOGIN L1 = new LOGIN();
	      L1.AdminLogIN();
	  break;
	  case 2:
	  System.out.println("\n                                               Going To Main Menu ....\n");
          ElectricityMenu();
		  break;
	  default:
	  System.out.println("\n                                               Entered wrong choice!");
	  System.out.println("                                               Please enter again");
	  
	}
	}while(cg<5);
  }

}
