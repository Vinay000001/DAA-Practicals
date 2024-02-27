import java.util.Scanner;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class parkingTicket {
    private static final double HOURLY_RATE = 2.5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter entry time (HH:MM): ");
        String entryTimeInput = scanner.nextLine();
        LocalTime entryTime = LocalTime.parse(entryTimeInput);

        System.out.println("Enter exit time (HH:MM): ");
        String exitTimeInput = scanner.nextLine();
        LocalTime exitTime = LocalTime.parse(exitTimeInput);

        long hoursParked = ChronoUnit.HOURS.between(entryTime, exitTime);
        double parkingFee = hoursParked * HOURLY_RATE;

        System.out.println("---------------------------------------");
        System.out.println("Your entry time : " + entryTimeInput);        
        System.out.println("Your exit time : " + exitTimeInput);        
        System.out.println("Parking duration : " + hoursParked);        
        System.out.println("Parking fee : $" + parkingFee);     
        System.out.println("Fee charge is for the hours only !!!");   
        System.out.println("---------------------------------------");

        scanner.close();
    }
}