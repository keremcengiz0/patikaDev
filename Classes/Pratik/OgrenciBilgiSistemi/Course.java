package Pratik.OgrenciBilgiSistemi;

public class Course {

	String name;
	String code;
	String prefix;
	int note;
	Teacher courseTeacher;

	public Course(String name, String code, String prefix) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
	}

	void printTeacherInfo() {
		this.courseTeacher.printTeacherInfo();
	}

	void printCourseInfo() {
		System.out.println("Kurs adi: " + this.name + "\n" + "Kurs kodu: " + this.code + "\n" + "Kurs prefix: "
				+ this.prefix + "\n");
	}

	void addTeacher(Teacher t) {

		if (this.prefix.equals(t.branch)) {
			this.courseTeacher = t;
			System.out.println(this.name + " dersine ogretmen eklendi: " + t.name);
			System.out.println();
		} else {
			System.out.println(t.name + " ogretmenin bransi dersi vermeye uygun degil." + "\n" + t.name
					+ " ogretmenin bransi: " + t.branch + " dersin adi: " + this.name);
			System.out.println();

		}
	}

	void printTeacher() {
		if (courseTeacher != null) {
			System.out.println(this.name + " --> kursunun ogretmeni : " + this.courseTeacher.name);
			System.out.println();

		} else {
			System.out.println(this.name + " dersine ogretmen atanmamistir.");
			System.out.println();
		}
	}

}
