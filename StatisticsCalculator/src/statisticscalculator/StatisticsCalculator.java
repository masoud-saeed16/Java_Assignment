/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statisticscalculator;

/**
 *
 * @author Innocent
 * Student Name: Masoud Saeeed Gariba 
 * Index Number: 1723247454
 */
import java.util.Arrays;
import java.util.Scanner;

public class StatisticsCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Check if the number of elements is valid
        if (n < 1) {
            System.out.println("The array must have at least one element.");
            return;
        }

        // Accept the user's input for each element of the array
        double[] numbers = new double[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        // Calculate mean, median, and standard deviation
        double mean = calculateMean(numbers);
        double median = calculateMedian(numbers);
        double standardDeviation = calculateStandardDeviation(numbers);

        // Display the results
        System.out.printf("Mean: %.2f\n", mean);
        System.out.printf("Median: %.2f\n", median);
        if (n < 2) {
            System.out.println("Standard deviation cannot be calculated for less than 2 elements.");
        } else {
            System.out.printf("Standard Deviation: %.2f\n", standardDeviation);
        }
    }

    // Method to calculate the mean
    public static double calculateMean(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    // Method to calculate the median
    public static double calculateMedian(double[] numbers) {
        Arrays.sort(numbers);
        int n = numbers.length;
        if (n % 2 == 0) {
            return (numbers[n / 2 - 1] + numbers[n / 2]) / 2.0;
        } else {
            return numbers[n / 2];
        }
    }

    // Method to calculate the standard deviation
    public static double calculateStandardDeviation(double[] numbers) {
        if (numbers.length < 2) {
            return Double.NaN; // Return NaN if standard deviation cannot be calculated
        }
        double mean = calculateMean(numbers);
        double sumSquaredDifferences = 0;
        for (double num : numbers) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDifferences / (numbers.length - 1));
    }
}

