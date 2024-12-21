import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayOfYear {
    public static int dayOfYear(String date) {
        // Parse the input string into a LocalDate object
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        // Get the day of the year
        return localDate.getDayOfYear();
    }

    public static void main(String[] args) {
        // Example usage
        String date = "2024-12-21";
        int dayNumber = dayOfYear(date);
        System.out.println("The day number of the year is: " + dayNumber);
    }
}
