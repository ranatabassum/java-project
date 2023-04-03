package javafinalproject;

import java.util.Formatter;
import java.io.FileReader;
//import java.io.File;
//import java.io.FileNotFoundException; 
import java.io.IOException;
//import java.util.*;
//import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class CustomerMenu extends LOGIN {

    public void cPanel() {
        Scanner B1 = new Scanner(System.in);
        System.out.print("\n\n\n\n                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n\n\n");
        System.out.println("                                            |||~~    Wellcome to Customer Menu    ~~|||");
        System.out.println("                                            |||~~                                 ~~|||");
        System.out.println("                                            |||~~        {1} Show Account         ~~|||");
        System.out.println("                                            |||~~        {2} Show Bill            ~~|||");
        System.out.println("                                            |||~~        {3} Pay Bill             ~~|||");
        System.out.println("                                            |||~~        {4} Exit                 ~~|||");
        System.out.println("                                            |||~~                                 ~~|||");
        System.out.print("                                                        Enter Your Choice: ");
        int chh;
        do {
            chh = B1.nextInt();
            switch (chh) {
                case 1:
                    showAccount();
                    break;
                case 2:
                    ShowBill();
                    break;
                case 3:
                    BillPay();
                    break;
                case 4:
                    System.out.println("\n                                                 Going to Main Menu.....");
                    Menu E3 = new Menu();
                    E3.ElectricityMenu();
                    break;
                default:
                    System.out.println("\n                                          Entered wrong choice ...");
                    System.out.println("                                          Please enter again");
            }
            //continue;
        } while (chh < 5);
    }

    Scanner EB = new Scanner(System.in);

    //method to display account details
    public void showAccount() {
        String SS;
        System.out.print("\n\n\n\n                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n\n\n");
        System.out.print("                                             ~~|||      Wellcome to Your Account      |||~~\n\n");
        System.out.print("                                                        Enter Meter No : ");
        String meter = EB.nextLine();
        try {
            FileReader readerb = new FileReader("CustomerData.txt");
            Scanner read = new Scanner(readerb);
            while (read.hasNext()) {
                String n = read.next();
                String e = read.next();
                String p = read.next();
                String m = read.next();
                String a = read.next();
                double u = read.nextDouble();
                double tb = read.nextDouble();
                String d = read.nextLine();
                if (m.equals(meter)) {
                    System.out.println("\n                                                       Customer Name: " + n);
                    System.out.println("                                                       Customer Email: " + e);
                    System.out.println("                                                       Phone Number: " + p);
                    System.out.println("                                                       Meter No: " + m);
                    System.out.println("                                                       Adress: " + a);
                    System.out.println("                                                       Bill Amount: " + tb);
                    System.out.println("\n                                                   Press any key to go back....");
                    SS = EB.nextLine();
                    cPanel();
                }
            }
            System.out.println("\n\n                                              Search Failed! Miter does not exist.");
            System.out.println("                                              Going to Customer Panel.....");
            cPanel();
            readerb.close();
        } catch (IOException e) {
            System.out.println("       An error occurred.");
            e.printStackTrace();
        }
    }

    //method of bill calculation
    public void ShowBill() {
        String Sc, Scc;
        double amt;
        double v;
        double ec;
        double sc;
        double st;
        double mr;
        double cd;
        double tb;
        double td;
        double bb;
        System.out.print("\n\n\n\n                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n\n\n");
        System.out.println("\n\n                                                 ~~|||     Show Total Bill    |||~~");
        System.out.print("\n                                                        Enter Meter No.: ");
        Scanner add7 = new Scanner(System.in);
        String meter1 = add7.nextLine();
        try {
            FileReader readerh = new FileReader("CustomerData.txt");
            Scanner read = new Scanner(readerh);
            while (read.hasNext()) {
                String n7 = read.next();
                String e7 = read.next();
                String p7 = read.next();
                String m7 = read.next();
                String a7 = read.next();
                double u7 = read.nextDouble();
                double tb7 = read.nextDouble();
                String d7 = read.nextLine();
                if (m7.equals(meter1)) {
                    if (u7 == 0 && tb7 == 0) {
                        bb = 0;
                        System.out.println("\n                                                        Your unit is: " + bb);
                        System.out.println("\n                                                        Saved On: " + bb);
                        System.out.print("\n                                                        Demand Charge : " + bb);
                        System.out.print("\n                                                        Energy Charge : " + bb);
                        System.out.print("\n                                                        Service Charge : " + bb);
                        System.out.print("\n                                                        Sub-Total : " + bb);
                        System.out.print("\n                                                        Meter Rent : " + bb);
                        System.out.print("\n                                                        Current Dues : " + bb);
                        System.out.print("\n                                                        Vat : " + bb);
                        System.out.print("\n                                                        Total Bill : " + bb);
                        System.out.print("\n                                                        Total if paid after Due date : " + bb);
                        System.out.println("\n\n                                                      Press any key to go back....");
                        Scc = add7.nextLine();
                        cPanel();
                    }
                    if (u7 >= 1 && u7 <= 100) {
                        amt = u7 * 5;
                    } else if (u7 >= 101 && u7 <= 200) {
                        amt = 100 * 5 + (u7 - 100) * 7;
                    } else if (u7 >= 201 && u7 <= 300) {
                        amt = 100 * 5 + (u7 - 200) * 10;
                    } else {
                        amt = 100 * 5 + (u7 - 300) * 15;
                    }
                    if (u7 >= 1 && u7 <= 100.00) {
                        v = 35;
                    } else if (u7 >= 101.00 && u7 <= 200.00) {
                        v = 65;
                    } else if (u7 >= 201.00 && u7 <= 300.00) {
                        v = 95;
                    } else {
                        v = 125;
                    }
                    ec = amt + 30;
                    sc = ec + 20;
                    st = sc;
                    mr = 70;
                    cd = st + 70;
                    tb = cd + v;
                    td = tb + 100;

                    System.out.println("\n                                                        Your unit is: " + u7);
                    System.out.println("\n                                                        Saved On: " + d7);
                    System.out.print("\n\n                                                        Demand Charge : " + amt);
                    System.out.print("\n                                                        Energy Charge : " + ec);
                    System.out.print("\n                                                        Service Charge : " + sc);
                    System.out.print("\n                                                        Sub-Total : " + st);
                    System.out.print("\n                                                        Meter Rent : " + mr);
                    System.out.print("\n                                                        Current Dues : " + cd);
                    System.out.print("\n                                                        Vat : " + v);
                    System.out.print("\n                                                        Total Bill : " + tb);
                    System.out.print("\n                                                        Total if paid after Due date : " + td);
                    System.out.println("\n\n                                                      Press any key to go back....");
                    Sc = add7.nextLine();
                    cPanel();
                }
            }
            System.out.println("\n\n                                                    Search Failed! Miter does not exist.");
            System.out.println("                                                    Going to Customer Panel.....");
            cPanel();
            readerh.close();
        } catch (IOException e) {
            System.out.println("       An error occurred.");
            e.printStackTrace();
        }
    }

    //method to pay the bill
    public void BillPay() {
        String Sb, Sba;
        int count = 0;
        double billp;
        double pay;
        Scanner addd7 = new Scanner(System.in);
        System.out.print("\n\n\n\n                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n\n\n");
        System.out.print("\n\n                                                  ~~|||     Pay Bill Panel     |||~~\n\n");
        System.out.print("                                                        Enter Meter No : ");
        String meter5 = addd7.nextLine();
        try {
            FileReader readera = new FileReader("CustomerData.txt");
            Scanner read = new Scanner(readera);
            while (read.hasNext()) {
                String n6 = read.next();
                String e6 = read.next();
                String p6 = read.next();
                String m6 = read.next();
                String a6 = read.next();
                double u6 = read.nextDouble();
                double tb6 = read.nextDouble();
                String d6 = read.nextLine();
                if (m6.equals(meter5)) {
                    System.out.println("                                                        Your Bill is :" + tb6);
                    System.out.println("\n                                                        LOADING .............");
                    System.out.println("                                                        Bill Paid Successfully.");
                    System.out.println("\n                                                   Press any key to go back....");
                    Sb = addd7.nextLine();
                    cPanel();
                    count = 1;
                    double ubb = 0;
                    double tbbb = 0;
                    try {
                        FileWriter Fo = new FileWriter("CustomerData.txt", true);
                        Formatter ffo = new Formatter(Fo);
                        ffo.format("%s %s %s %s %s %f %f %s\r\n", n6, e6, p6, m6, a6, ubb, tbbb, d6);
                        ffo.close();
                    } catch (IOException e) {
                        System.out.println("      An error occurred.");
                        e.printStackTrace();
                    }
                } else {
                    try {
                        FileWriter F4 = new FileWriter("CustomerData.txt", true);
                        Formatter ff4 = new Formatter(F4);
                        ff4.format("%s %s %s %s %s %f %f %s\r\n", n6, e6, p6, m6, a6, u6, tb6, d6);
                        ff4.close();
                    } catch (IOException e) {
                        System.out.println("      An error occurred.");
                        e.printStackTrace();
                    }
                }
            }
            readera.close();
        } catch (IOException e) {
            System.out.println("      An error occurred.");
            e.printStackTrace();
        }
        if (count == 1) {
            try {
                FileWriter f9 = new FileWriter("CustomerData.txt", false);
                f9.close();
            } catch (IOException e) {
                System.out.println("      An error occurred.");
                e.printStackTrace();
            }
            try {
                FileReader F99 = new FileReader("TempBillData.txt");
                Scanner R = new Scanner(F99);
                while (R.hasNext()) {
                    String nn1 = R.next();
                    String ee1 = R.next();
                    String pp1 = R.next();
                    String mm1 = R.next();
                    String aa1 = R.next();
                    double uu1 = R.nextDouble();
                    double tbb1 = R.nextDouble();
                    String dd1 = R.nextLine();
                    try {
                        FileWriter F4 = new FileWriter("CustomerData.txt", true);
                        Formatter ff4 = new Formatter(F4);
                        ff4.format("%s %s %s %s %s %f %f %s\r\n", nn1, ee1, pp1, mm1, aa1, uu1, tbb1, dd1);
                        ff4.close();
                    } catch (IOException e) {
                        System.out.println("      An error occurred.");
                        e.printStackTrace();
                    }
                }
                F99.close();
            } catch (IOException e) {
                System.out.println("      An error occurred.");
                e.printStackTrace();
            }
            try {
                FileWriter FF9 = new FileWriter("TempBillData.txt", false);
                FF9.close();
            } catch (IOException e) {
                System.out.println("      An error occurred.");
                e.printStackTrace();
            }
            cPanel();
        }
        System.out.println("\n\n                                                          Search Failed! Miter does not exist.");
        System.out.println("                                                          Going to Customer Panel.....");
    }
}
