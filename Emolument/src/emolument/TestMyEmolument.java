/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package emolument;

/**
 *
 * @author Innocent
 * Student Name: Masoud Saeeed Gariba 
 * Index Number: 1723247454
 * 
 */
// Test program
import javax.swing.JOptionPane;
public class TestMyEmolument {
    public static void main(String[] args) {
        // Accept input from the user using input dialog
        double basic_salary = Double.parseDouble(JOptionPane.showInputDialog("Enter Basic Salary: "));
        double tax_relief = Double.parseDouble(JOptionPane.showInputDialog("Enter Tax Relief: "));

        // Create MyEmolument object
        MyEmolument staff_salary = new MyEmolument(basic_salary, tax_relief);

        // Calculate values
        double ssnit = staff_salary.SSNIT();
        double taxableIncome = staff_salary.taxableIncome();
        double incomeTax = staff_salary.incomeTax();
        double totalDeduction = staff_salary.totalDeduction();
        double netSalary = staff_salary.netSalary();

        // Display results
        String output = String.format(
            "Basic Salary: %.2f\n" +
            "Tax Relief: %.2f\n" +
            "SSNIT Contribution: %.2f\n" +
            "Taxable Income: %.2f\n" +
            "Income Tax: %.2f\n" +
            "Total Deduction: %.2f\n" +
            "Net Salary: %.2f\n",
            basic_salary, tax_relief, ssnit, taxableIncome, incomeTax, totalDeduction, netSalary
        );

        JOptionPane.showMessageDialog(null, output, "Salary Breakdown", JOptionPane.INFORMATION_MESSAGE);
    }
}
