
package javafinalproject;

import java.io.FileReader;
//import java.io.File;
import java.io.FileNotFoundException; 
import java.io.IOException;
//import java.util.*;
//import java.lang.*;
//import java.io.*;
import java.util.Scanner;
public class LOGIN {
  
	public int ac5;
	public int bbn;
	public int g;
	public int bg;
	public int c1;
	public int a;
	public int abc;
	public int a11;
      public void AdminLogIN()
      {
		  String emlA;
		  String passA;
		  System.out.print("\n\n\n\n                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n\n\n");
    	  System.out.println("\n                                                     Wellcome to Log In page !!\n\n");
    	  System.out.println("                                               ~~~    LOG IN TO YOUR ACCOUNT    ~~~ \n");
		  System.out.print("                                                     EMAIL : ");
		  Scanner add = new Scanner(System.in);
     	  emlA = add.nextLine();
   	      System.out.print("                                                     PASSWORD : ");
      	  passA = add.nextLine();
		try {
			FileReader readerd = new FileReader("Admin.txt");
			  Scanner read = new Scanner(readerd);
		  while (read.hasNext())
		  {
			  String e = read.next();
			  String p = read.next();
		  if(e.equals(emlA) && p.equals(passA))
		  {
			  System.out.print("\n                                                     Successfully Loged In !!");
			  AdminMenu admin = new AdminMenu();
			  admin.aPanel(); 
		  }
		  }
		  System.out.print("\n                                                     Incorrect Email or Password !");
		  System.out.print("\n                                                     Going to LOG IN Menu .....");
		 Admin admin1 = new Admin();
		 admin1.aReg();
		  readerd.close();
          } catch (FileNotFoundException e){
		  System.out.println("\n\n       Error! File not found.");
		  }
		  catch (IOException e){
          System.out.println("\n\n       An error occurred.");
          e.printStackTrace();
          }
	   }
	
	  public void CustomLogIN()
      {
		  String emlC;
		  String passC;
		  String meterC;
		  System.out.print("\n\n\n\n                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n\n\n");
    	  System.out.println("\n                                                     Wellcome to Log In page !!\n\n");
    	  System.out.println("                                                   ~~~ LOG IN TO YOUR ACCOUNT ~~~ \n");
		  System.out.print("                                                     EMAIL : ");
    	  Scanner add= new Scanner(System.in);
     	  emlC = add.nextLine();
	      System.out.print("                                                     METER NO. : ");
    	  Scanner add3= new Scanner(System.in);
     	   meterC = add3.nextLine();
   	    	  System.out.print("                                                     PASSWORD : ");
     	      Scanner add1 = new Scanner(System.in);
      	    passC = add1.nextLine();
		  try {
          FileReader readerg = new FileReader("C:/Users/DELL/Documents/NetBeansProjects/JavaFinalProject/Customer.txt");
			  Scanner read = new Scanner(readerg);
		  while(read.hasNext())
		  {
			  String e1 = read.next();
			  String m1 = read.next();
			  String p1 = read.next();
		  if(emlC.equals(e1) && meterC.equals(m1) && passC.equals(p1))
		  {
			  System.out.print("\n                                                     Successfully Loged In !!");
			  CustomerMenu customer = new CustomerMenu();
			  customer.cPanel(); 
		  }
		  }
		  System.out.print("\n                                                     Incorrect Email or Password !");
			  System.out.print("\n                                                     Going to LOG IN Menu .....\n");
			  Customer customer1 = new Customer();
			  customer1.cReg();
		  readerg.close();
		  }
		  catch (FileNotFoundException e){
		  System.out.println("      Error! File not found.");
		  }
		  catch (IOException e){
          System.out.println("      An error occurred.");
          e.printStackTrace();
          }
      }
    }

