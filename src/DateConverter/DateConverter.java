package DateConverter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDate = scanner.nextLine();

        LocalDate date = LocalDate.parse(shortDate, DateTimeFormatter.ISO_DATE);

        String monthName = date.getMonth().name();

        System.out.printf("%s %d, %d", monthName, date.getDayOfMonth(), date.getYear());
    }
}