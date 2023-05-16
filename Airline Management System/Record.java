import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Record {
    String str;
    String text;
    int lineNumber;
    Scanner sc = new Scanner(System.in);
    public Record() {}

    public void showRecord(Reservation reservation) throws IOException {
        FileReader fileReader = new FileReader("Database.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        System.out.println("\t\t\t\t----------Record----------\n\n");
        System.out.print("\t\t\t\tEnter Customer ID: ");
        str = sc.nextLine();
        if(str.equals(reservation.customerId)) {
            for(lineNumber = 1; lineNumber <= 14; lineNumber++) {
                text = bufferedReader.readLine();
                if (lineNumber == 1) {
                    System.out.println("\t\t\t\tName: " + text);
                }
                else if (lineNumber == 2) {
                    System.out.println("\t\t\t\tAge: " + text);
                }
                else if (lineNumber == 3) {
                    System.out.println("\t\t\t\tGender: " + text);
                }
                else if (lineNumber == 4) {
                    System.out.println("\t\t\t\tAddress: " + text);
                }
                else if (lineNumber == 5) {
                    System.out.println("\t\t\t\tMobile: " + text);
                }
                else if (lineNumber == 6) {
                    System.out.println("\t\t\t\tEmail: " + text);
                }
                else if (lineNumber == 7) {
                    System.out.println("\t\t\t\tNationality: " + text);
                }
                else if (lineNumber == 8) {
                    System.out.println("\t\t\t\tDestination: " + text);
                }
                else if (lineNumber == 9) {
                    System.out.println("\t\t\t\tSeat Count: " + text);
                }
                else if (lineNumber == 10) {
                    System.out.println("\t\t\t\tDeparture time: " + text);
                }
                else if (lineNumber == 11) {
                    System.out.println("\t\t\t\tPassport ID: " + text);
                }
                else if (lineNumber == 12) {
                    System.out.println("\t\t\t\tFlight ID: " + text);
                }
                else if (lineNumber == 13) {
                    System.out.println("\t\t\t\tCustomer ID: " + text);
                }
                else if (lineNumber == 14) {
                    System.out.println("\t\t\t\tBill: " + text + " BDT");
                }
            }

        }
        else {
            System.out.println("\t\t\t\tInvalid Customer ID");
        }
        System.out.println("\n\n====================================================================================================\n\n");
    }
}
