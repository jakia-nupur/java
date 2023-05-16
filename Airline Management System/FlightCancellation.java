import java.util.Scanner;

public class FlightCancellation {
    String str1;
    String str2;
    String press;
    Scanner sc = new Scanner(System.in);
    public FlightCancellation() {}
    public void cancelFlight(Reservation reservation) {
        System.out.println("\t\t\t\t----------Flight Cancellation----------\n\n");
        System.out.print("\t\t\t\tEnter Customer ID: ");
        str1 = sc.nextLine();
        System.out.print("\t\t\t\tEnter Flight ID: ");
        str2 = sc.nextLine();
        if(str1.equals(reservation.customerId) && str2.equals(reservation.flightId)) {
            System.out.println("\t\t\t\t*****Customer & Flight Details*****" +
                    "\n\t\t\t\tCustomer Name: " + reservation.name +
                    "\n\t\t\t\tAge: " + reservation.age +
                    "\n\t\t\t\tSeat Count: " + reservation.seatCount +
                    "\n\t\t\t\tDestination: " + reservation.destination);
            System.out.println("\t\t\t\tAre you want to cancel the flight?\n" +
                    "\t\t\t\tPress 'Y' to OK\n" +
                    "\t\t\t\tPress 'N' to Cancel");
            System.out.print("\t\t\t\tPress --> ");
            press = sc.nextLine();
            if(press.equals("Y")) {
                System.out.println("\t\t\t\tFlight Cancellation Successful");
            }
            else if(press.equals("N")) {
                System.out.println("\t\t\t\tFlight Cancellation Discarded");
            }
        }
        else {
            System.out.println("\n\t\t\t\tInvalid Customer ID or Flight ID!");
        }
        System.out.println("\n\n====================================================================================================\n\n");
    }
}

