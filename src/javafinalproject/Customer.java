package javafinalproject;

import java.util.Scanner;

public class Customer extends Menu {

    public void cReg() {
        System.out.print("\n\n\n\n                                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n\n\n");
        System.out.println("\n\n                                                 |||||||||||||||||||||||||||||||||||||||||");
        System.out.println("                                                 ||                                     ||");
        System.out.println("                                                 ||  <<   WELLCOME TO LOG IN MENU   >>  ||");
        System.out.println("                                                 ||                                     ||");
        System.out.println("                                                 ||     {1} LOG IN                      ||");
        System.out.println("                                                 ||     {2} EXIT                        ||");
        System.out.println("                                                 ||                                     ||");
        System.out.println("                                                 |||||||||||||||||||||||||||||||||||||||||\n");
        System.out.print("                                                        Enter Your Choice: ");
        Scanner add9 = new Scanner(System.in);
        int ch1;
        do {
            ch1 = add9.nextInt();
            switch (ch1) {
                case 1:
                    System.out.println("\n                                                Going To Log In Menu ....");
                    LOGIN L2 = new LOGIN();
                    L2.CustomLogIN();
                    break;
                case 2:
                    System.out.println("\n                                                Going To Main Menu ....");
                    ElectricityMenu();
                    break;
                default:
                    System.out.println("\n                                                Entered wrong choice!");
                    System.out.println("                                                Please enter again");
                    continue;

            }
        } while (ch1 <= 4);
    }

}
