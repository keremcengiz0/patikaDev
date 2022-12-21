package Pratik.OgrenciBilgiSistemi;

public class Teacher {

	String name;
	String mpno;
	String branch;

	public Teacher(String name, String mpno, String branch) {
		this.name = name;
		this.mpno = mpno;
		this.branch = branch;
	}

	void printTeacherInfo() {
		System.out.println("Ogretmen adi: " + this.name);
		System.out.println("Telefon no: " + this.mpno);
		System.out.println("Brans: " + this.branch);
		System.out.println();
	}

}
