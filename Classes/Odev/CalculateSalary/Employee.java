package Odev.CalculateSalary;

import java.time.LocalDate;

public class Employee {
	
	private String name;
	private double salary;
	private int workHours;
	private int hireYear;
	private double vergi;
	private double bonusMaas;
	private double maasArtisi;
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	
	public double tax() {
		if(this.salary < 1000) {
			return this.salary;
		} else {
			return  vergi = this.salary*0.03;
		}
	}
	
	public double bonus() {
		int extraHours = this.workHours - 40;
		
		if(this.workHours < 40) {
			return this.salary;
		} else {
			return bonusMaas = 30*extraHours;
		}
	}
	
	public double raiseSalary() {
		LocalDate currentDate = LocalDate.now();
		int currentYear = currentDate.getYear();
		
		if(currentYear - this.hireYear < 10) {
			return maasArtisi = (this.salary*0.05);
		} else if(currentYear - this.hireYear > 9 && currentYear - this.hireYear < 20) {
			return maasArtisi = (this.salary*0.10);

		} else {
			return maasArtisi = (this.salary*0.15);
		}
		
	}

	@Override
	public String toString() {
		return " Employee " + "\n ***********************************"
				+ "\n Adi: " + name + "\n Maasi: " + salary + "\n Calisma saati: " + workHours + "\n Baslangic yili: " + hireYear
				+"\n Vergi: " + vergi + "\n Bonus: " + bonusMaas + " \n Maas artisi: " + maasArtisi + 
				"\n Vergi ve Bonuslar ile birlikte maas: " + (this.salary+this.bonusMaas-this.vergi) + "\n Toplam maas: " + (salary+maasArtisi);
	}
	
	

}
