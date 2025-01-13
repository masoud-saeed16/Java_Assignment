/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package emolument;

/**
 *
 * @author Innocent
 * Student Name: Masoud Saeeed Gariba 
 * Index Number: 1723247454
 * 
 */

// Class representing an emolument
class Emolument {
    // Encapsulated data fields
    private double basic_salary;
    private double tax_relief;

    // Constructor
    public Emolument(double basic_salary, double tax_relief) {
        this.basic_salary = basic_salary;
        this.tax_relief = tax_relief;
    }

    // Getter for basic_salary
    public double getBasicSalary() {
        return basic_salary;
    }

    // Getter for tax_relief
    public double getTaxRelief() {
        return tax_relief;
    }

    // Method to compute SSNIT contribution
    public double SSNIT() {
        return basic_salary * 0.035;
    }

    // Method to compute taxable income
    public double taxableIncome() {
        return basic_salary - (tax_relief + SSNIT());
    }
}

// Subclass inheriting from Emolument
class MyEmolument extends Emolument {
    // Encapsulated data fields
    private double basic_salary;
    private double tax_relief;

    // Default constructor
    public MyEmolument() {
        super(0, 0);
        this.basic_salary = 0;
        this.tax_relief = 0;
    }

    // Constructor with specified basic salary and tax relief
    public MyEmolument(double basic_salary, double tax_relief) {
        super(basic_salary, tax_relief);
        this.basic_salary = basic_salary;
        this.tax_relief = tax_relief;
    }

    // Method to compute income tax
    public double incomeTax() {
        double taxableIncome = taxableIncome();
        double tax = 0;

        if (taxableIncome <= 500) {
            tax = taxableIncome * 0.05;
        } else if (taxableIncome <= 1000) {
            tax = 500 * 0.05 + (taxableIncome - 500) * 0.125;
        } else {
            tax = 500 * 0.05 + 500 * 0.125 + (taxableIncome - 1000) * 0.175;
        }

        return tax;
    }

    // Method to compute total deduction
    public double totalDeduction() {
        return SSNIT() + incomeTax();
    }

    // Method to compute net salary
    public double netSalary() {
        return getBasicSalary() - totalDeduction();
    }
}
