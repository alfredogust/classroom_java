package edu.alfredogust.basic_operations;

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
        int[] grades = new int[4];
        int sum = 0;

        for (int gradeIndex = 0; gradeIndex < grades.length; gradeIndex++) {
            System.out.println("Enter grade " + (gradeIndex + 1) + ": ");
            sum += grades[gradeIndex];
        }

        int average = sum / grades.length;
        System.out.println("The average of the grades is: " + average);
        return average;
    }
    
    public static void convertMetersToCentimeters (Scanner scanner) {
        System.out.println("Enter the measurement in meters: ");
        double metros = scanner.nextDouble();

        double convertedMeters = metros * 100;
        System.out.println("Centimeters: " + convertedMeters);
    }

    public static void displayCircleAreaAndPerimeter(Scanner scanner) {
        System.out.print("Enter the circle radius: ");
        double radius = scanner.nextDouble();
    
        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;
    
        System.out.printf("Circle area: %.2f. Circle perimeter: %.2f%n", area, perimeter);
    }

    public static void calculateSquareArea(Scanner scanner) {
        System.out.println("Enter the side length of the square: ");
        double sideLength = scanner.nextDouble();
    
        double area = sideLength * sideLength;
        double doubledArea = area * 2;
    
        System.out.printf("The area of the square is: %.2f\n", area);
        System.out.printf("The doubled area of the square is: %.2f\n", doubledArea);
    }    

    public static void calculateSalary (Scanner scanner) {
        System.out.println("Enter how much you earn per hour");
        double earnsPerHour = scanner.nextDouble();

        System.out.println("Enter the number of hours worked in the month");
        double workedHours = scanner.nextDouble();

        double totalSalary = earnsPerHour * workedHours;

        System.out.printf("Total salary for that month: %.2f", totalSalary);
    }

    public static void fahrenheitToCelsius (Scanner scanner) {
        System.out.println("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
    
        double celsius = 5 * ((fahrenheit - 32) / 9);
        System.out.printf("Temperature in Celsius: %.2f%n", celsius);
    }

    public static void celsiusToFahrenheit (Scanner scanner) {
        System.out.println("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * (9.0 / 5)) + 32;
        System.out.printf("Temperature in Fahrenheit: %.2f%n", fahrenheit);
    }

    public static void calculateWithIntegersAndFloats (Scanner scanner) {
        System.out.println("Enter the first integer number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second integer number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter a float number: ");
        double thirdNumber = scanner.nextDouble();

        double productOfDoubleAndHalf = 2.0 * firstNumber + secondNumber / 2.0;
        double sumOfTripleFirstAndThird = 3.0 * firstNumber + thirdNumber;

        double thirdCubed = thirdNumber * thirdNumber * thirdNumber;

        System.out.printf("Product of double and half: %.2f%n", productOfDoubleAndHalf);
        System.out.printf("Sum of triple first and third: %.2f%n", sumOfTripleFirstAndThird);
        System.out.printf("Third cubed: %.2f%n", thirdCubed);
    }

    public static void calculateIdealWeight (Scanner scanner) {
        System.out.println("Enter your height: ");
        double height = scanner.nextDouble();

        double menIdealWeight = (72.7 * height) - 58;
        double womanIdealWeight = (62.1 * height) - 44.7;

        System.out.printf("Ideal weight for mens: %.2f kg", menIdealWeight);
        System.out.printf("Ideal weight for womans: %.2f kg", womanIdealWeight);
    }
}
