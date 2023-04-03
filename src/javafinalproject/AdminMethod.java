
package javafinalproject;
 import java.util.Formatter;
import java.util.Scanner;
//import java.util.*;
//import java.lang.*;
import java.io.*;


public class AdminMethod extends AdminMenu
{
    //method to open an account
    public void AddAccount()
    {
		double amt;
		double v;
		double ec ;
			 double sc;
			 double st;
			 double mr ;
			 double cd;
			 double tb;
		Scanner EB = new Scanner(System.in);
		System.out.print("Customer Name: ");
	 String name = EB.nextLine();
    System.out.print("Customer Email: ");
	String email = EB.nextLine();
	System.out.print("Phone Number: ");
	String phoneNo = EB.nextLine();
	System.out.print("Meter No: ");
	String meterNo = EB.nextLine();
	System.out.print("Adress: ");
	String adress = EB.nextLine();
 	System.out.print("Unit: ");
	double unit = EB.nextDouble();
	if(unit<=100.00)
        {
            amt = unit * 5;
        }
        else if(unit>=101.00 && unit<=200.00)
        {
             amt = 100 * 5 + (unit-100.00) * 7;
        }
        else if(unit>=201.00 && unit<=300.00)
        {
             amt = 100 * 5 + (unit-200.00) * 10;
        }
        else
        {
             amt = 100 * 5 + (unit-300.00) * 15;
        }
		if(unit<=100.00)
        {
             v=35;
        }
        else if(unit>=101.00 && unit<=200.00)
        {
             v=65;
        }
        else if(unit>=201.00 && unit<=300.00)
        {
             v=95;
        }
        else
        {
             v=125;
        }
		      ec = amt+30;
			 sc = ec+20;
			 st = sc;
			  mr = 70;
			  cd = st+70;
			 tb = cd+v;
	try{
    FileWriter writer4 = new FileWriter("CustomerData.txt",true);
	Formatter f3 = new Formatter(writer4);
	f3.format("%s %s %s %s %s %f %f \r\n",name,email,phoneNo,meterNo,adress,unit,tb);
		  f3.close();
	}
		  catch (IOException e){
          System.out.println("An error occurred.");
          e.printStackTrace();
          }
    }    
	
	//method to remove details
	public void RemoveAccount()
	{
		int abc6;
		System.out.println(" ||**   Remove Customer  **||/n");
		System.out.println("    Enter Miter No. : ");
		Scanner add1 = new Scanner(System.in);
      	String meter = add1.nextLine();
		try {
	    FileReader reader1 = new FileReader("CustomerData.txt");
		FileReader reader2 = new FileReader("CustomerData.txt");
		FileWriter writer1 = new FileWriter("TempData.txt",true);
	    Scanner read = new Scanner(reader1);
          while(read.hasNext())
		  {
	    	  String n5 = read.next();
			  String e5 = read.next();
			  String p5 = read.next();
			  String m5 = read.next();
			  String a5 = read.next();
			  double u5 = read.nextDouble();
			  double tb5 = read.nextDouble();
		  if(m5.equals(meter))
		  {   
	System.out.print("   ~~|||   Customer Details   |||~~\n\n");
	System.out.println("      Customer Name: "+n5);
    System.out.println("      Customer Email: "+e5);
	System.out.println("      Phone Number: "+p5);
	System.out.println("      Meter No: "+m5);
	System.out.println("      Adress: "+a5);
	System.out.println("      Bill: "+tb5);
	System.out.println(" Are you sure to remove details ?");
	 System.out.println("      {1} Yes");
    System.out.println("      {2} No");
    System.out.print("      Enter choice :");
    Scanner addd1 = new Scanner(System.in);
    abc6 = addd1.nextInt();
	if(abc6==1)
	{
		break;
	}
    else{
		System.out.println("     You are not sure !");
		System.out.println("     Going to Admin Panel ......");
		break;
	   }
		  }
		  if(m5.equals(meter))
		  {   
			  
		  }
		  else
				 {
					 Scanner read1 = new Scanner(reader2);
					 while(read1.hasNext())
					 {
					 String nn4 = read1.next();
			         String e4 = read1.next();
                     String p4 = read1.next();
			         String m4 = read1.next();
			         String a4 = read1.next();
			         double u4 = read1.nextDouble();
			         double tb4 = read1.nextDouble();
					 writer1.write("\r\n"+nn4+e4+p4+m4+a4+u4+tb4);
				 }
		      } 
		  System.out.println("    Successfully Removed Account.");
		  System.out.println("     Going to Admin Panel ....");
		  }
		   writer1.flush();
		   writer1.close();
		   reader2.close();
		   reader1.close();
		   File f1 = new File("CustomerData.txt");
           boolean b = f1.delete();
		   File F1 = new File("TempData.txt");
           File F2 = new File("CustomerData.txt");
           boolean b1 = F1.renameTo(F2);
		}
		 catch (FileNotFoundException e){
		  System.out.println("Error! File not found.");
		  }
		  catch (IOException e){
          System.out.println("An error occurred.");
          e.printStackTrace();
          }
	}
	//method to search account
	public void SearchAccount()
	{
	    System.out.println("   ~~~   Search Panel   ~~~ \n\n");
		System.out.print("   Enter Meter No : ");
		try{
	    FileReader reader8 = new FileReader("CustomerData.txt");
	    Scanner read = new Scanner(reader8);
		Scanner add7 = new Scanner(System.in);
		String meterb = add7.nextLine();
	    while (read.hasNext())
		    {
			  String n3 = read.next();
			  String e3 = read.next();
			  String p3 = read.next();
			  String m3 = read.next();
			  String a3 = read.next();
			  double u3 = read.nextDouble();
			  double tb3 = read.nextDouble();
			 if(m3.equals(meterb))
		  {   
	System.out.print("   ~~|||   Customer Details   |||~~\n\n");
	System.out.println("      Customer Name: "+n3);
    System.out.println("      Customer Email: "+e3);
	System.out.println("      Phone Number: "+p3);
	System.out.println("      Meter No: "+m3);
	System.out.println("      Adress: "+a3);
	System.out.println("      Bill: "+tb3);
		}
		else 
		{
			int abct;
			System.out.print("    Incorrect Meter No. !");
			  System.out.println("      {1} Enter Again");
			  System.out.println("      {2} Exit");
			   System.out.print("      Enter choice :");
			   Scanner addd2 = new Scanner(System.in);
      	      abct = addd2.nextInt();
		}
	  }
	  reader8.close();
		}
	 catch (FileNotFoundException e){
		  System.out.println("Error! File not found.");
		  }
		  catch (IOException e){
          System.out.println("An error occurred.");
          e.printStackTrace();
          }
   }
   public void SearchBill()
   {
	   		double amt;
		    double v;
		    double ec ;
			 double sc;
			 double st;
			 double mr ;
			 double cd;
			 double tb;
	   System.out.print("   ~~|||   Bill Details   |||~~\n\n");
	   		System.out.print("   Enter Meter No : ");
		try{
	    FileReader reader = new FileReader("CustomerData.txt");
	    Scanner read = new Scanner(reader);
		Scanner add8 = new Scanner(System.in);
		String metert = add8.nextLine();
	    while (read.hasNext())
		    {
			  String n7 = read.next();
			  String e7 = read.next();
			  String p7 = read.next();
			  String m7 = read.next();
			  String a7 = read.next();
			  double u7 = read.nextDouble();
			  double tb7 = read.nextDouble();
			 if(m7.equals(metert))
		  {   
	    if(u7<=100.00)
        {
            amt = u7* 5;
        }
        else if(u7>=101.00 && u7<=200.00)
        {
            amt = 100 * 5 + (u7-100.00) * 7;
        }
        else if(u7>=201.00 && u7<=300.00)
        {
            amt = 100 * 5 + (u7-200.00) * 10;
        }
        else
        {
            amt = 100 * 5 + (u7-300.00) * 15;
        }
			 if(u7<=100.00)
        {
             v=35;
        }
        else if(u7>=101.00 && u7<=200.00)
        {
            v=65;
        }
        else if(u7>=201.00 && u7<=300.00)
        {
             v=95;
        }
        else
        {
             v=125;
        }
		      ec = amt+30;
			  sc = ec+20;
			  st = sc;
			  mr = 70;
			  cd = st+70;
			  tb = cd+v;
                              double td = tb+100;
	        System.out.print("   Demand Charge : "+amt);
			System.out.print("   Energy Charge : "+ec);
			System.out.print("   Service Charge : "+sc);
			System.out.print("   Sub-Total : "+st);
			System.out.print("   Meter Rent : "+mr);
			System.out.print("   Current Dues : "+cd);
			System.out.print("   Vat : "+v);
			System.out.print("   Total Bill : "+tb);
		        System.out.print("   Total if paid after Due date : "+td);
		  }
		}
		reader.close();
        }
        catch (IOException e){
          System.out.println("An error occurred.");
          e.printStackTrace();
          }
   }
   public void ModifyAccount()
   {
	   int ch = 0;
		try {
			do{
	       Scanner add4 = new Scanner(System.in);
			 System.out.print("      ~~|||  Modify Details   |||~~\n\n");
		     FileReader readeri = new FileReader("CustomerData.txt");
			 FileReader readerj = new FileReader("CustomerData.txt");
			 FileWriter writeri = new FileWriter("TempData.txt",true);
			 Scanner read = new Scanner(readeri);
			 String meterx = add4.nextLine();
		     while (read.hasNext())
		    {
			  String n6 = read.next();
			  String e6 = read.next();
			  String p6 = read.next();
			  String m6 = read.next();
			  String a6 = read.next();
			  double u6 = read.nextDouble();
			  double tb6 = read.nextDouble();
			  if(m6.equals(meterx))
		      {  
	System.out.println("     Which part do you want to modify?\n");
    System.out.println("     {1}Name\n");
	System.out.println("     {2}Phone no.\n");
	System.out.println("     {3}Adress\n");
	System.out.println("     {4}Exit\n");
	System.out.print("      Enter choice - ");
	Scanner add1 = new Scanner(System.in);
		ch = add1.nextInt();
			if(ch==1)
			{
			Scanner add10 = new Scanner(System.in);
			System.out.print("     Enter new Name : ");
			String nm = add10.nextLine();
			if(m6.equals(meterx))
			{ }
		else
		{  
	        Scanner read1 = new Scanner(readerj);
		     while (read1.hasNext())
		    {
				String n9 = read1.next();
			  String e9 = read1.next();
			  String p9 = read1.next();
			  String m9 = read1.next();
			  String a9 = read1.next();
			  double u9 = read1.nextDouble();
			  double tb9 = read1.nextDouble();
			  writeri.write("\r\n"+n9+e9+p9+m9+a9+u9+tb9);
			}
			writeri.flush();
	        writeri.close();
			readerj.close();
	    }
			break;
			}
			if(ch==2)
			{
			Scanner add5 = new Scanner(System.in);
			System.out.print("     Enter new Phone No. : ");
			String ph = add5.nextLine();
			break;
			}
			if(ch==3)
			{
			Scanner add6 = new Scanner(System.in);
			System.out.print("     Enter new Adress : ");
			String ad = add6.nextLine();
			break;
			}
			if(ch==4)
			{
			System.out.print("     Going to Admin Panel .....");
			break;
			}
			else{
			System.out.print("     Wrong Choice Entered !");
			System.out.print("     Enter Again.");
			continue;
			}
	  }
		  else 
	{
		System.out.println("   Search Failed! Miter does not exist.");
		System.out.println("   Going to Admin Panel.....");
		break;
	}
	}
	readeri.close();
	}
	while(ch<5);
	  }
   catch (IOException e){
          System.out.println("An error occurred.");
          e.printStackTrace();
          }
   }
   public void PaidCustomerList()
   {
	   try {
	   System.out.print("                 ~~|||      Paid Customers     |||~~\n\n");
	   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	   System.out.print("| No.| Miter No. |       Name       |      Email     |  Phone No. |  Bill  |");
	   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
          FileReader reader2 = new FileReader("CustomerData.txt");
		  Scanner read = new Scanner(reader2);
		  while (read.hasNext())
		  {
			  int i=1;
			  String n7 = read.next();
			  String e7 = read.next();
			  String p7 = read.next();
			  String m7 = read.next();
			  String a7 = read.next();
			  double u7 = read.nextDouble();
			  double tb7 = read.nextDouble();
			  i++;
			   if(tb7 ==0.00)
		      { 
			  System.out.println(" "+i+"   "+m7+"    "+n7+"    "+e7+"    "+p7+"   "+tb7+"     ");
			  }
		  }
	   reader2.close();
		  }
		 catch (FileNotFoundException e){
		  System.out.println("Error! File not found.");
		  }
		  catch (IOException e){
          System.out.println("An error occurred.");
          e.printStackTrace();
          }
   }
   
   public void CustomerList()
   {
	   try {
		   System.out.print("                 ~~|||      Default Customers     |||~~\n\n");
	   System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	   System.out.print("| No.| Miter No. |       Name       |      Email     |  Phone No. |\n");
	   System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
          FileReader reader3 = new FileReader("CustomerData.txt");
		  Scanner read = new Scanner(reader3);
		  while (read.hasNext())
		  {
			  int i=1;
			  String n9 = read.next();
			  String e9 = read.next();
			  String p9 = read.next();
			  String m9 = read.next();
			  String a9 = read.next();
			  double u9 = read.nextDouble();
			  double tb9 = read.nextDouble();
			  i++;
	        System.out.println(" "+i+"   "+m9+"    "+n9+"    "+e9+"    "+p9+"   ");
	      }
	     reader3.close();
		  }
		  catch (FileNotFoundException e){
		  System.out.println("Error! File not found.");
		  }
		  catch (IOException e){
          System.out.println("An error occurred.");
          e.printStackTrace();
          }
   }
   
   
}

