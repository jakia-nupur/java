import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String username = "Jubsha", password = "jubsha";
		for(;;) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n====================================================================================================\n\n");
        System.out.println("\t\t\t\t**********Admin Portal**********\n");
        System.out.print("\t\t\t\t\tusername: ");
        String str1 = sc.nextLine();
        System.out.print("\t\t\t\t\tpassword: ");
        String str2 = sc.nextLine();
		vanish();
        System.out.println("\n\n====================================================================================================\n\n");

        if(str1.equals(username) && str2.equals(password)) {
            Reservation r = new Reservation();
            FlightInfo fi = new FlightInfo();
            PriceInfo p = new PriceInfo();
            Transaction tr = new Transaction();
            Record record = new Record();
            FlightCancellation fc = new FlightCancellation();
            for(;;) {
                System.out.println("\t\t\t\t----------Option----------\n" +
                        "\n\t\t\t\tPress - 1: Reservation" +
                        "\n\t\t\t\tPress - 2: Flight Info" +
                        "\n\t\t\t\tPress - 3: Price Info" +
                        "\n\t\t\t\tPress - 4: Transaction Info" +
                        "\n\t\t\t\tPress - 5: Record" +
                        "\n\t\t\t\tPress - 6: Flight Cancellation" +
                        "\n\t\t\t\tPress - 7: Exit");
                System.out.print("\n\t\t\t\tPress --> ");
                String press = sc.nextLine();
				vanish();
                System.out.println("\n\n====================================================================================================\n\n");
                if (press.equals("1")) {
                    r.reservationForm();
					System.out.print("\t\t\t\t0 - Back");
                    System.out.print("\n\n\t\t\t\tPress --> ");
                    String back = sc.nextLine();
                    if(back.equals("0")) {
                        vanish();
                    }
					
                }
                else if(press.equals("2")) {
                    fi.routine();
					System.out.print("\t\t\t\t0 - Back");
                    System.out.print("\n\n\t\t\t\tPress --> ");
                    String back = sc.nextLine();
                    if(back.equals("0")) {
                        vanish();
                    }
                }
                else if(press.equals("3")) {
                    p.showPriceInfo();
					System.out.print("\t\t\t\t0 - Back");
                    System.out.print("\n\n\t\t\t\tPress --> ");
                    String back = sc.nextLine();
                    if(back.equals("0")) {
                        vanish();
                    }
                }
                else if(press.equals("4")) {
                    tr.transactionInfo(r);
					System.out.print("\t\t\t\t0 - Back");
                    System.out.print("\n\n\t\t\t\tPress --> ");
                    String back = sc.nextLine();
                    if(back.equals("0")) {
                        vanish();
                    }
                }
                else if(press.equals("5")) {
                    record.showRecord(r);
					System.out.print("\t\t\t\t0 - Back");
                    System.out.print("\n\n\t\t\t\tPress --> ");
                    String back = sc.nextLine();
                    if(back.equals("0")) {
                        vanish();
                    }
                }
                else if(press.equals("6")) {
                    fc.cancelFlight(r);
					System.out.print("\t\t\t\t0 - Back");
                    System.out.print("\n\n\t\t\t\tPress --> ");
                    String back = sc.nextLine();
                    if(back.equals("0")) {
                        vanish();
                    }
                }
                else if(press.equals("7")) {
                    System.out.println("\t\t\t\tExit...");
                    System.exit(0);
					
                }
                else {
                    System.out.println("\t\t\t\tInvalid input! Press the given number...");
					System.out.println("\n\n====================================================================================================\n\n");
                }
            }
        }
        else {
            System.out.println("\t\t\t\tInvalid username or password!");
			
        }
    }
	}
	public static void vanish() // For vanishing code
    {
        try
        {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
