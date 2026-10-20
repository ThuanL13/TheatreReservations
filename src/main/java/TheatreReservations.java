import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class TheatreReservations {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Asking user for full name
        System.out.println("What is your full name?(First and Last): ");
        String fullName = read.nextLine();

        // Asking user for the date of the show
        System.out.println("What date will you be coming?(MM/dd/yyyy): ");
        String showDate = read.nextLine();

        // Asking user for number of tickets
        System.out.println("How many tickets would you like?: ");
        int tickets = read.nextInt();

        // Splitting the name into parts
        String[] nameParts = fullName.split(" "); // Cuts string when there is a space
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        // Converting date to YYYY-MM-DD
        DateTimeFormatter userDate = DateTimeFormatter.ofPattern("MM/dd/yyyy"); // Creating date format pattern
        // Input -> (mm/dd/yyyy)
        // Converts user date to yyyy/dd/mm
        LocalDate date = LocalDate.parse(showDate, userDate); // userDate -> How the user entered the date

        // Confirmation message
        if (tickets == 1) {
            System.out.println(tickets + " ticket reserved for " + date + " under " + lastName +
                    ", " + firstName);
        }
        else {
            System.out.println(tickets + " tickets reserved for " + date + " under " + lastName +
                    ", " + firstName);
        }
        read.close();
        }
    }