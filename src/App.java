import edu.alfredogust.basic_operations.BasicOperations;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int option;

            do {
                System.out.println("\n=== Exercise List: Basic Operations with Java ===");
                System.out.println("1 - Hello World");
                System.out.println("2 - Informed Number");
                System.out.println("3 - Format and Display Data");
                System.out.println("4 - Sum Two Numbers");
                System.out.println("5 - Calculate Average");
                System.out.println("6 - Convert Meters to Centimeters");
                System.out.println("7 - Display Circle and Area Perimeter");
                System.out.println("8 - Calculate Square Area");
                System.out.println("9 - Calculate Salary");
                System.out.println("10 - Fahrenheit to Celsius");
                System.out.println("11 - Celsius to Fahrenheit");
                System.out.println("12 - Calculate Integer and Floats");
                System.out.println("13 - Calculate Ideal Weight");
                System.out.println("0 - Exit\n");
                System.out.print("Choose an option: ");
                
                option = scanner.nextInt();
                System.out.println();

                switch (option) {
                    case 1 -> BasicOperations.helloWorld();
                    case 2 -> {
                        int number = BasicOperations.informedNumber(scanner);
                        System.out.println("Stored number: " + number);
                    }
                    case 3 -> BasicOperations.formatAndDisplayData();
                    case 4 -> BasicOperations.sumTwoNumbers(scanner);
                    case 5 -> BasicOperations.calculateAverage(scanner);
                    case 6 -> BasicOperations.convertMetersToCentimeters(scanner);
                    case 7 -> BasicOperations.displayCircleAreaAndPerimeter(scanner);
                    case 8 -> BasicOperations.calculateSquareArea(scanner);
                    case 9 -> BasicOperations.calculateSalary(scanner);
                    case 10 -> BasicOperations.fahrenheitToCelsius(scanner);
                    case 11 -> BasicOperations.celsiusToFahrenheit(scanner);
                    case 12 -> BasicOperations.calculateWithIntegersAndFloats(scanner);
                    case 13-> BasicOperations.calculateIdealWeight(scanner);
                    case 0 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid option! Try again.");
                }
                
            } while (option != 0);
        }
    }
}
