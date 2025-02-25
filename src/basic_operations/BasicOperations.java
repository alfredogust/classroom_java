package basic_operations;

import java.util.Locale;
import java.util.Scanner;

public final class BasicOperations {

    public static void helloWorld() {
        System.out.println("Hello, world!");
    }

    public static int informedNumber(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.printf("The informed number was: %d%n", number);
        return number;
    }

    public static void formatAndDisplayData() {
        String product01 = "Computer";
        String product02 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price01 = 2100.0;
        double price02 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", product01, price01);
        System.out.printf("%s, which price is $ %.2f%n", product02, price02);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
        System.out.println();
        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }

    public static int sumTwoNumbers(Scanner scanner) {
        System.out.println("Digite o primeiro numero: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println("O valor da soma é: " + sum);
        return sum;
    }

    public static double calculateAverage(Scanner scanner) {
        System.out.println("Enter the first grade: ");
        double grade01 = scanner.nextDouble();
        System.out.println("Enter the second grade: ");
        double grade02 = scanner.nextDouble();
        System.out.println("Enter the third grade: ");
        double grade03 = scanner.nextDouble();
        System.out.println("Enter the fourth grade: ");
        double grade04 = scanner.nextDouble();
    
        double averageGrade = (grade01 + grade02 + grade03 + grade04) / 4;
    
        System.out.println("The average grade is: " + averageGrade);
        return averageGrade;
    }
    
    public static void convertMetersToCentimeters (Scanner scanner) {
        System.out.println("Enter the measurement in meters: ");
        double metros = scanner.nextDouble();

        double convertedMeters = metros * 100;
        System.out.println("Centimeters: " + convertedMeters);
    }
}
