import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Reservation {
    String name;
    String age;
    String gender;
    String address;
    String mobile;
    String email;
    String nationality;
    String destination;
    String seatCount;
    String departureTime;
    String passportId;
    String flightId;
    String customerId;
    double bill;

    Scanner sc = new Scanner(System.in);

    public Reservation() {} //Default constructor
    public void reservationForm() throws IOException {
        File file = new File("Database.txt");
        if (file.exists()) {
            // File already exist
        }
        else {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file);
        System.out.println("\t\t\t\t----------Reservation From----------\n");
        System.out.print("\t\t\t\tName: ");
        name = sc.nextLine();
        fileWriter.write(name + "\n");
        System.out.print("\t\t\t\tAge: ");
        age = sc.nextLine();
        fileWriter.write(age + "\n");
        System.out.print("\t\t\t\tGender: ");
        gender = sc.nextLine();
        fileWriter.write(gender + "\n");
        System.out.print("\t\t\t\tAddress: ");
        address = sc.nextLine();
        fileWriter.write(address + "\n");
        System.out.print("\t\t\t\tMobile: ");
        mobile = sc.nextLine();
        fileWriter.write(mobile + "\n");
        System.out.print("\t\t\t\tEmail: ");
        email = sc.nextLine();
        fileWriter.write(email + "\n");
        System.out.print("\t\t\t\tNationality: ");
        nationality = sc.nextLine();
        fileWriter.write(nationality + "\n");
        System.out.print("\t\t\t\tDestination: ");
        destination = sc.nextLine();
        fileWriter.write(destination + "\n");
        System.out.print("\t\t\t\tSeat Count: ");
        seatCount = sc.nextLine();
        fileWriter.write(seatCount + "\n");
        System.out.print("\t\t\t\tDeparture Time: ");
        departureTime = sc.nextLine();
        fileWriter.write(departureTime + "\n");
        System.out.print("\t\t\t\tPassport ID: ");
        passportId = sc.nextLine();
        fileWriter.write(passportId + "\n");
        System.out.print("\t\t\t\tFlight ID: ");
        flightId = sc.nextLine();
        fileWriter.write(flightId + "\n");
        System.out.print("\t\t\t\tCustomer ID: ");
        customerId = sc.nextLine();
        fileWriter.write(customerId + "\n");
        if(destination.equals("Cox's Bazar")) {
            bill = Double.parseDouble(seatCount) * 5000;
            System.out.println("\t\t\t\tBill: " + bill);
            fileWriter.write(bill + "\n");
        }
        else if (destination.equals("Barisal")) {
            bill = Double.parseDouble(seatCount) * 3000;
            System.out.println("cBill: " + bill);
            fileWriter.write(bill + "\n");
        }
        else if(destination.equals("Jessore")) {
            bill = Double.parseDouble(seatCount) * 2500;
            System.out.println("\t\t\t\tBill: " + bill);
            fileWriter.write(bill + "\n");
        }
        else if(destination.equals("United States")) {
            bill = Double.parseDouble(seatCount) * 60000;
            System.out.println("\t\t\t\tBill: " + bill);
            fileWriter.write(bill + "\n");
        }
        else if(destination.equals("Canada")) {
            bill = Double.parseDouble(seatCount) * 50000;
            System.out.println("\t\t\t\tBill: " + bill);
            fileWriter.write(bill + "\n");
        }
        else if(destination.equals("Germany")) {
            bill = Double.parseDouble(seatCount) * 40000;
            System.out.println("\t\t\t\tBill: " + bill);
            fileWriter.write(bill + "\n");
        }
        else if(destination.equals("Australia")) {
            bill = Double.parseDouble(seatCount) * 55000;
            System.out.println("\t\t\t\tBill: " + bill);
            fileWriter.write(bill + "\n");
        }
        else {
            System.out.println("\t\t\t\tSelect the valid available destination...");
        }
        fileWriter.flush();
        fileWriter.close();
        System.out.println("\n\n====================================================================================================\n\n");
    }
}
