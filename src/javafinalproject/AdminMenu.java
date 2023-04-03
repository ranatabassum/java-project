
package javafinalproject;
import java.util.Formatter;
import java.io.FileReader;
//import java.io.File;
import java.io.FileNotFoundException; 
import java.io.IOException;
//import java.util.*;
//import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class AdminMenu extends LOGIN {
    public void aPanel()
    {
    Scanner EB = new Scanner(System.in);
	int ch;
	do{
	System.out.print("\n\n\n\n                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n\n\n");
    System.out.println("\n                                            |||~~       Wellcome to Admin Menu       ~~|||");
	System.out.println("                                            |||~~                                    ~~|||");
	System.out.println("                                            |||~~       {1}  Add Customer            ~~|||");
    System.out.println("                                            |||~~       {2}  Remove Customer         ~~|||");
	System.out.println("                                            |||~~       {3}  Search By Miter         ~~|||");
	System.out.println("                                            |||~~       {4}  Show Bill               ~~|||");
	System.out.println("                                            |||~~       {5}  Customer List           ~~|||");
	System.out.println("                                            |||~~       {6}  Paid Customer List      ~~|||");
	System.out.println("                                            |||~~       {7}  Exit                    ~~|||");
	System.out.println("                                            |||~~                                    ~~|||");
    System.out.print("                                                          Enter Your Choice: ");
                    ch = EB.nextInt(); 
                     switch(ch)
                     { 
					case 1:
					AddAc();
					int yy;
					do{
					System.out.print("\n\n                                                  Do you want to add more ?\n");
			        System.out.print("                                                    {1} Yes\n");
			        System.out.print("                                                    {2} No\n");
					System.out.print("                                                  Enter Choice : ");
			        yy = EB.nextInt();
			        if(yy==1)
			        {
						AddAc();
			         }
			         else
			         {
			         break;
			        }
                    }while(yy<2);
					System.out.print("\n                                             Customers successfully added !! ");
						break;
					case 2:
						RemoveAccount();
						break;
                    case 3:
					SearchAccount();
						break;
					case 4:
					SBill();
						break;
					case 5:
		             CList();
						break;
					case 6:
					PaidCustomerList();
					break;
					case 7:
					System.out.println("                                             Going to Main Menu......");
					Menu sm = new Menu();
					sm.ElectricityMenu();
					break;
					default:
					System.out.println("                                              Entered wrong choice ...");
					System.out.println(                                        );
				}
	   }while(ch<8);		
    }
	
	public void AddAc()
    {
		double amt;
		double v;
		double ec ;
			 double sc;
			 double st;
			 double mr ;
			 double cd;
			 double tb;
			 System.out.print("\n\n\n\n                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n\n\n");
			 System.out.println("\n\n                                               >> |||   Customer Details   ||| <<\n");
		Scanner EB = new Scanner(System.in);
		System.out.print("\n                                                       Customer Name: ");
	 String name = EB.nextLine();
    System.out.print("                                                       Customer Email: ");
	String email = EB.nextLine();
	System.out.print("                                                       Phone Number: ");
	String phoneNo = EB.nextLine();
	System.out.print("                                                       Meter No: ");
	String meterNo = EB.nextLine();
	System.out.print("                                                       Adress: ");
	String adress = EB.nextLine();
 	System.out.print("                                                       Unit: ");
	double unit = EB.nextDouble();
	System.out.print("                                                       Date: ");
	String date = EB.next();
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
	f3.format("%s %s %s %s %s %f %f %s\r\n",name,email,phoneNo,meterNo,adress,unit,tb,date);
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
		int abc6, count=0;
		String Sdd;
		System.out.print("\n                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n\n\n");
		System.out.println("                                                >> |||    Remove Customer    ||| <<\n");
		System.out.print("\n                                                   Enter Miter No. : ");
		Scanner add1 = new Scanner(System.in);
      	String meter = add1.nextLine();
		try {
	    FileReader reader1 = new FileReader("CustomerData.txt");
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
			  String d5 = read.nextLine();
		  if(m5.equals(meter))
		  {
     count =1;			  
	System.out.println("\n\n                                                  ~~|||   Customer Details   |||~~\n\n");
	System.out.println("                                                     Customer Name: "+n5);
    System.out.println("                                                     Customer Email: "+e5);
	System.out.println("                                                     Phone Number: "+p5);
	System.out.println("                                                     Meter No: "+m5);
	System.out.println("                                                     Adress: "+a5);
	System.out.println("                                                     Bill: "+tb5);
    System.out.println("\n\n                                                 Successfully Removed Account.");
	 System.out.println("\n\n                                                    Press any key to go back....");
    Sdd = add1.nextLine();
	     }
    else{
		try{
		  FileWriter writer1 = new FileWriter("TempData.txt",true);
		  Formatter f3 = new Formatter(writer1);
		  f3.format("%s %s %s %s %s %f %f %s\r\n",n5,e5,p5,m5,a5,u5,tb5,d5);
		  f3.close();
		  }
		  catch (IOException e){
          System.out.println("      An error occurred.");
          e.printStackTrace();
          }
	    }
		 }
		 reader1.close();
		 }
		  catch (IOException e){
          System.out.println("      An error occurred.");
          e.printStackTrace();
          }
		  if(count==1)
		  {
			  try{
			  FileWriter f9 = new FileWriter("CustomerData.txt",false);
		      f9.close();
			  }
			  catch (IOException e){
              System.out.println("      An error occurred.");
              e.printStackTrace();
              }
			  try
			  {  
		   FileReader F9 = new FileReader("TempData.txt");
		   Scanner R = new Scanner(F9);
		   while(R.hasNext())
		   {
			  String nn1 = R.next();
			  String ee1 = R.next();
			  String pp1 = R.next();
			  String mm1 = R.next();
			  String aa1 = R.next();
			  double uu1 = R.nextDouble();
			  double tbb1 = R.nextDouble();
			  String dd1 = R.nextLine();
			  try{
			FileWriter F4 = new FileWriter("CustomerData.txt",true);
	        Formatter ff4 = new Formatter(F4);
	        ff4.format("%s %s %s %s %s %f %f %s\r\n",nn1,ee1,pp1,mm1,aa1,uu1,tbb1,dd1);
			ff4.close();
			  }
			  catch (IOException e){
              System.out.println("      An error occurred.");
              e.printStackTrace();
              }
		   }
		   F9.close();
			  }
			  catch (IOException e){
              System.out.println("      An error occurred.");
              e.printStackTrace();
              }
			  try{
			  FileWriter FF9 = new FileWriter("TempData.txt",false);
		      FF9.close();
			  }
			  catch (IOException e){
              System.out.println("      An error occurred.");
              e.printStackTrace();
              }
			  aPanel();
		  }
		  System.out.println("\n\n                                                          Search Failed! Miter does not exist.");
		System.out.println("                                                          Going to Customer Panel.....");
		
	}
	
	//method to search account
	public void SearchAccount()
	{
		String Sd1;
		System.out.print("\n\n\n\n                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n\n\n");
	    System.out.println("\n                                               |||~~     Customer Details    ~~|||\n");
		System.out.print("                                                       Enter Meter No : ");
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
			  String d3 = read.nextLine();
			 if(m3.equals(meterb))
		  {   
	System.out.println("\n                                                    Customer Name: "+n3);
    System.out.println("                                                    Customer Email: "+e3);
	System.out.println("                                                    Phone Number: "+p3);
	System.out.println("                                                    Meter No: "+m3);
	System.out.println("                                                    Adress: "+a3);
	System.out.println("                                                    Bill: "+tb3);
	System.out.println("                                                    Saved on: "+d3);
	System.out.println("\n\n                                                    Press any key to go back....");
    Sd1 = add7.nextLine();
	aPanel();
		}
	  }
	  System.out.println("\n\n                                                    Search Failed! Miter does not exist.");
	  System.out.println("\n                                                    Going to Admin Panel.....");
	  aPanel();
	  reader8.close();
		}
	 catch (FileNotFoundException e){
		  System.out.println("           Error! File not found.");
		  }
		  catch (IOException e){
          System.out.println("           An error occurred.");
          e.printStackTrace();
          }
   }
   public void SBill()
   {
	        String Sd,Scc;
	   		double amt;
		    double v;
		    double ec ;
			 double sc;
			 double st;
			 double mr ;
			 double cd;
			 double tb;
			 double td;
			 double bb;
		System.out.print("\n\n\n\n                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n\n\n");
	   System.out.print("\n\n                                              |||~~     Bill Details     ~~|||\n\n");
	   Scanner add8 = new Scanner(System.in);
	   	System.out.print("                                                   Enter Meter No : ");
		String metert = add8.nextLine();
		try{
	    FileReader reader = new FileReader("CustomerData.txt");
	    Scanner read = new Scanner(reader);
	    while (read.hasNext())
		    {
			  String n7 = read.next();
			  String e7 = read.next();
			  String p7 = read.next();
			  String m7 = read.next();
			  String a7 = read.next();
			  double u7 = read.nextDouble();
			  double tb7 = read.nextDouble();
			  String d7 = read.nextLine();
			 if(m7.equals(metert))
		  {   
	    if(u7==0 && tb7==0)
		{
			bb=0;
			System.out.println("\n                                                        Your unit is: "+bb);
			 System.out.println("\n                                                        Saved On: "+bb);
	        System.out.print("\n\n                                                        Demand Charge : "+bb);
			System.out.print("\n                                                        Energy Charge : "+bb);
			System.out.print("\n                                                        Service Charge : "+bb);
			System.out.print("\n                                                        Sub-Total : "+bb);
			System.out.print("\n                                                        Meter Rent : "+bb);
			System.out.print("\n                                                        Current Dues : "+bb);
			System.out.print("\n                                                        Vat : "+bb);
			System.out.print("\n                                                        Total Bill : "+bb);
			System.out.print("\n                                                        Total if paid after Due date : "+bb);
			System.out.println("\n\n                                                      Press any key to go back....");
           Scc = add8.nextLine();
		   aPanel();
		}
	    if(u7>=1 && u7<=100.00)
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
			 if(u7>=1 && u7<=100.00)
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
			  td= tb+100;
			  System.out.print("\n                                                 Saved On : "+d7);
	        System.out.print("\n\n                                                 Demand Charge : "+amt);
			System.out.print("\n                                                 Energy Charge : "+ec);
			System.out.print("\n                                                 Service Charge : "+sc);
			System.out.print("\n                                                 Sub-Total : "+st);
			System.out.print("\n                                                 Meter Rent : "+mr);
			System.out.print("\n                                                 Current Dues : "+cd);
			System.out.print("\n                                                 Vat : "+v);
			System.out.print("\n                                                 Total Bill : "+tb);
			System.out.print("\n                                                 Total if paid after Due date : "+td);
			System.out.println("\n\n                                                Press any key to go back....");
			 Sd = add8.nextLine();
			 aPanel();
		  }
		}
		System.out.println("\n\n                                                     Search Failed! Miter does not exist.");
		System.out.println("\n                                                     Going to Customer Panel.....");
		aPanel();
		reader.close();
        }
        catch (IOException e){
          System.out.println("       An error occurred.");
          e.printStackTrace();
          }
   }

   public void PaidCustomerList()
   {
	   String Sn;
	   System.out.print("\n\n\n\n                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n\n\n");
	   System.out.print("                                                 ~~|||      Paid Customers List     |||~~\n\n");
	   Scanner add64 = new Scanner(System.in);
	   try {
          FileReader reader2 = new FileReader("CustomerData.txt");
		  Scanner read = new Scanner(reader2);
		  while (read.hasNext())
		  {
			  int j=0;
			  String n7 = read.next();
			  String e7 = read.next();
			  String p7 = read.next();
			  String m7 = read.next();
			  String a7 = read.next();
			  double u7 = read.nextDouble();
			  double tb7 = read.nextDouble();
			  String d7 = read.nextLine();
			  j++;
			   if(tb7==0.00)
		      { 
			     System.out.println("\n                           Serial No."+j);
				 System.out.println("\n                           Miter No.:"+m7+"      Name:"+n7+"\n      Email:"+e7+"      Phone No."+p7+"       Saved On:"+d7+"\n");
			  }
			  else{}
		  }
		  System.out.println("\n\n                                                Press any key to go back....");
			 Sn = add64.nextLine();
	   reader2.close();
		  }
		 catch (FileNotFoundException e){
		  System.out.println("      Error! File not found.");
		  }
		  catch (IOException e){
          System.out.println("      An error occurred.");
          e.printStackTrace();
          }
   }
   
   public void CList()
   {
	   String Sn;
	   System.out.print("\n\n\n\n                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n\n\n");
		   System.out.print("\n\n                                                  |||~~     Default Customers List    ~~|||\n\n");
		   Scanner add44 = new Scanner(System.in);
		   try {
          FileReader reader3 = new FileReader("CustomerData.txt");
		  Scanner read = new Scanner(reader3);
		  int i=0;
		  while (read.hasNext())
		  {
			  String n9 = read.next();
			  String e9 = read.next();
			  String p9 = read.next();
			  String m9 = read.next();
			  String a9 = read.next();
			  double u9 = read.nextDouble();
			  double tb9 = read.nextDouble();
			  String d9 = read.nextLine();
			  i++;
	        System.out.print("\n                              Serial No."+i);
			System.out.print("\n                              Miter No.:"+m9+"       Name:"+n9+"       Email:"+e9+"       Phone No."+p9+"       Saved On:"+d9+"\n");	   
			}
			 reader3.close();
			System.out.println("\n\n                                                Press any key to go back....");
			 Sn = add44.nextLine();
		  }
		  catch (FileNotFoundException e){
		  System.out.println("          Error! File not found.");
		  }
		  catch (IOException e){
          System.out.println("         An error occurred.");
          e.printStackTrace();
          }
   }
   
}

