package abstractAndMethods;

import java.util.Scanner;

/**
 * 1. Change Employee class as abstract and add abstract methods like
 * calculatePay() with concrete methods like getEmployeeDetails(), etc. Extend
 * this abstract class in subclasses - HourlyEmployee and SalariedEmployee.
 * Allow the user to input details of employees and calculate their respective
 * pay using the abstract class reference.
 * 
 */
abstract class Employee {

	protected String name;
	protected String id;

	public Employee(String name, String id) {
		this.name = name;
		this.id = id;
	}

	abstract double calculatePay();

	public static void main(String[] args) {

		Employee employee = new HourlyEmployee("Raji", "4", 30, 90);
		System.out.println(employee.getEmployeeDetails());
		System.out.println("Calculated Pay: " + employee.calculatePay());

		employee = new SalariedEmployee("Raji", "4", 30);
		System.out.println(employee.getEmployeeDetails());
		System.out.println("Calculated Pay: " + employee.calculatePay());

	}

	private String getEmployeeDetails() {
		// TODO Auto-generated method stub

		return name + "  " + id;
	}

}

class HourlyEmployee extends Employee {
	private double hourlyRate;
	private double hoursWorked;

	public HourlyEmployee(String name, String id, double hourlyRate, double hoursWorked) {
		super(name, id);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	@Override
	double calculatePay() {
		return hourlyRate * hoursWorked;
	}
}

class SalariedEmployee extends Employee {
	private double annualSalary;

	public SalariedEmployee(String name, String id, double annualSalary) {
		super(name, id);
		this.annualSalary = annualSalary;
	}

	@Override
	double calculatePay() {
		return annualSalary / 12; // Monthly salary
	}
}
