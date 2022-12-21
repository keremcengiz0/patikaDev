package Pratik.OgrenciBilgiSistemi;

public class Student {

	String name;
	String stuNo;
	int classes;
	Course mat;
	Course fizik;
	Course tr;
	double avarage;
	boolean isPass;

	public Student(String name, String stuNo, int classes, Course mat, Course fizik, Course tr) {
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.mat = mat;
		this.fizik = fizik;
		this.tr = tr;
		this.avarage = 0.0;
		this.isPass = false;
	}

	public void addBulkExamNote(int mat, int fizik, int tr) {

		if (mat >= 0 && mat <= 100) {
			this.mat.note = mat;
		}

		if (fizik >= 0 && fizik <= 100) {
			this.fizik.note = fizik;
		}

		if (tr >= 0 && tr <= 100) {
			this.tr.note = tr;
		}
	}

	public void isPass() {
		if (this.mat.note == 0 || this.fizik.note == 0 || this.tr.note == 0) {
			System.out.println("Notlar tam olarak girilmemistir.");
		} else {
			this.isPass = isCheckPass();

			if (this.isPass) {
				System.out.println(this.name + " sinifi gecti.");
			} else {
				System.out.println(this.name + " sinifta kaldi.");
			}

		}
	}

	public void calcAvarage() {
		this.avarage = ((mat.note + fizik.note + tr.note) / 3);
	}

	public boolean isCheckPass() {
		calcAvarage();
		return this.avarage > 55;
	}

	public void printStudentInfo() {
		System.out.println("=========================");
		System.out.println("Ogrenci : " + this.name);
		System.out.println("Matematik Notu : " + this.mat.note);
		System.out.println("Fizik Notu : " + this.fizik.note);
		System.out.println("Turkce Notu : " + this.tr.note);
	}

}
