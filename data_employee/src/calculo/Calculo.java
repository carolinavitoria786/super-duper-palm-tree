package calculo;

import java.util.Locale;
import java.util.Scanner;

import funcionario.Employee;

public class Calculo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Digite o nome do funcionario, salário e imposto referido: ");
		employee.name = sc.nextLine();
		employee.grossSalary = sc.nextDouble();
		employee.tax = sc.nextDouble();
		
		System.out.printf("Name: %s%n", employee.name);
		System.out.println("Gross salary: " + employee.grossSalary);
		System.out.println("Tax: " + employee.tax);
		
		System.out.println();
		System.out.printf("Employee: %n", employee);
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		
		System.out.printf("Updated data: %s, $ %.2f%n", employee.name, employee.netSalary());
		
		sc.close();
	}

}

