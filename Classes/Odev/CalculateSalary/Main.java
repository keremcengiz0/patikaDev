package Odev.CalculateSalary;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee("Kerem", 2000.0, 45, 1985);
		
		e1.tax();
		e1.bonus();
		e1.raiseSalary();
		System.out.println(e1.toString());
	}

}
