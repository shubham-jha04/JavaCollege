import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if (birthDate != null && currentDate != null) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            throw new IllegalArgumentException("Invalid date provided");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get today's date
        LocalDate currentDate = LocalDate.now();
        
        // Input date of birth
        System.out.print("Enter your birth year: ");
        int year = scanner.nextInt();
        System.out.print("Enter your birth month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter your birth day: ");
        int day = scanner.nextInt();
        
        // Create a LocalDate object for birth date
        LocalDate birthDate = LocalDate.of(year, month, day);

        // Calculate and display the age
        int age = calculateAge(birthDate, currentDate);
        System.out.println("You are " + age + " years old.");
        
        scanner.close();
    }
}