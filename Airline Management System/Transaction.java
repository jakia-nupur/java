import java.sql.SQLOutput;
import java.util.Scanner;

public class Transaction {
    String str;
    int choice;
    String cardNumber;
    Scanner sc = new Scanner(System.in);
    Scanner si = new Scanner(System.in);
    Transaction() {}
    public void transactionInfo(Reservation reservation) {
        System.out.println("\t\t\t\t----------Transaction Info----------\n\n");
        System.out.println("\t\t\t\tPress - 1: Master Card / Debit Card / Credit Card\n" +
                "\t\t\t\tPress - 2: Google Pay\n" +
                "\t\t\t\tPress - 3: Apple Pay\n");
        System.out.print("\t\t\t\tEnter Customer ID: ");
        str = sc.nextLine();
        if(str.equals(reservation.customerId)) {
            System.out.print("\t\t\t\tPress --> ");
            choice = si.nextInt();
            if(choice == 1) {
                System.out.println("\t\t\t\tMaster Card / Debit Card / Credit Card: ");
                System.out.print("\t\t\t\tEnter Card Number: ");
                cardNumber = sc.nextLine();
                System.out.println("\t\t\t\t" + reservation.name + " Payment Successful");
            }
            else if(choice == 2) {
                System.out.println("\t\t\t\tGoogle Pay: ");
                System.out.print("\t\t\t\tEnter Card Number: ");
                cardNumber = sc.nextLine();
                System.out.println("\t\t\t\t" + reservation.name + " Payment Successful");
            }
            else if(choice == 3) {
                System.out.println("\t\t\t\tApple Pay: ");
                System.out.print("\t\t\t\tEnter Card Number: ");
                cardNumber = sc.nextLine();
                System.out.println("\t\t\t\t" + reservation.name + " Payment Successful");
            }
            else {
                System.out.println("\t\t\t\tInvalid input. Please press the correct option.");
            }
        }
        else {
            System.out.println("\t\t\t\tInvalid Customer ID");
        }
        System.out.println("\n\n====================================================================================================\n\n");
    }
}