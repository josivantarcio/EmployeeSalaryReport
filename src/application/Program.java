package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String path = "/home/josivan/eclipse-workspace/reportSalaryEmployee/in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Employee> employee = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {

				String[] part = line.split(",");
				String name = part[0];
				String email = part[1];
				Double salary = Double.parseDouble(part[2]);

				employee.add(new Employee(name, email, salary));

				line = br.readLine();
			}

			System.out.print("Salario Base: ");
			double salaryBase = sc.nextDouble();

			//list emails with salary > variable salaryBase
			List<String> newList = employee.stream().filter(p -> p.getSalary() > salaryBase)
					.map(p -> p.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			newList.forEach(System.out::println);


			//sum salary with name begin letter M
			double sum = employee.stream()
					.filter(p -> p.getName().charAt(0) == 'M')
					.map(p -> p.getSalary())
					.reduce(0.0, (p,q) -> p + q);
			
			System.out.println("Total:" + sum);
			
			
			
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
