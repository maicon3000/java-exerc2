package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("NAME: ");
		emp.name = sc.nextLine();
		System.out.print("GROSS SALARY: ");
		emp.grossSalary = sc.nextDouble();
		System.out.print("TAX: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("EMPLOYEE: " + emp.name + ", $ " + emp.netSalary());
		System.out.println();
		
		System.out.print("WHICH PERCENTAGE TO INCREASE SALARY? ");
		double increase = sc.nextDouble();
		emp.increaseSalary(increase);
		
		System.out.println("UPDATE DATA: " + emp.name + ", $ " + emp.netSalary());
		
		
		
		sc.close();

	}

}
