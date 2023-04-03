
package javafinalproject;
/*import java.util.Scanner;*/
//import java.lang.*;
//import java.io.*;
import java.util.*;

public class Menu {
  
     
    public int n;
	public void Demo()
   {
	   String Sd1;
	   Scanner add7 = new Scanner(System.in);
	   System.out.println("\n\n\n\n                                                         ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	   System.out.println("                                        {1} ADMIN MENU - i.Add Customer        {2} CUSTOMER PANEL - i.Show Account");
	   System.out.println("                                                         ii.Remove Customer                         ii.Show Bill");
	   System.out.println("                                                         iii.Search By Miter                        iii.Pay Bill");
	   System.out.println("                                                         iv.Show Bill   ");
	   System.out.println("                                                         v.Customer List    ");
	    System.out.println("                                                        vi.Paid Customer List    ");
	System.out.print("                                        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
	System.out.print("                                                        Press any key to go back....");
    Sd1 = add7.nextLine(); 
	ElectricityMenu();
   }
  
	public void ElectricityMenu()
	{
		do
	  {
	 System.out.print("\n\n\n\n                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n\n\n");
      System.out.print("\n                                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
      System.out.print("                                              >>     ELECTRICITY BILLING SYSTEM     <<\n");
      System.out.print("                                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
      System.out.print("                                                          >>  Menu Bar  <<   \n");
	  System.out.print("                                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
      System.out.print("                                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	  System.out.print("                                               ~                                    ~\n");
      System.out.print("                                               ~         {1} Admin Panel            ~\n");
      System.out.print("                                               ~         {2} Customer Panel         ~\n");
      System.out.print("                                               ~         {3} Exit                   ~\n");
	  System.out.print("                                               ~                                    ~\n");
      System.out.print("                                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	  System.out.print("                                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
      System.out.print("                                                      Enter your option : ");
      Scanner in = new Scanner(System.in);
 	  n = in.nextInt();
 	  if(n==1)
 	  {
 		 System.out.println("\n                                               Entering in Login Menu....");
		 Admin B = new Admin();
		 B.aReg();
 	  }
 	  else if(n==2)
 	  {
 		 System.out.println("\n                                               Entering in Login Menu....");
		 Customer C = new Customer();
		 C.cReg();
 	  }
 	  else if(n==3)
 	  {
		  System.out.println("\n                                              Thank You for Using Our System");
 		 System.out.println("\n                                             Exiting from system...");
 	  }
 	  else
 	  { 
 		 System.out.println("\n                                                     Invalid input!");
 		System.out.println("                                                     Please enter again");
		continue;
 	  }
	  }while(n<=3);
	}
}


