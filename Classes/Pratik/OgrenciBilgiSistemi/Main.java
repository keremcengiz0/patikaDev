package Pratik.OgrenciBilgiSistemi;

public class Main {

	public static void main(String[] args) {

		Teacher t1 = new Teacher("Huseyin", "123456", "MAT");
		Teacher t2 = new Teacher("Kerem", "654321", "FZK");
		Teacher t3 = new Teacher("Hilal", "147258", "TR");
		Teacher t4 = new Teacher("Hulya", "963852", "KMY");
		
		Course yazilim = new Course("Yazilim", "101", "PC");
		Course mat = new Course("Matematik", "102", "MAT");
		Course fizik = new Course("Fizik", "103", "FZK");
		Course turkce = new Course("Turkce", "104", "TR");
		
		
		mat.addTeacher(t1);
		fizik.addTeacher(t2);
		turkce.addTeacher(t3);
		yazilim.addTeacher(t4);
		
		Student st1 = new Student("Duman", "123", 4, mat, fizik, turkce);
		st1.addBulkExamNote(50, 20, 70);
		st1.isPass();
		
		Student st2 = new Student("Ates", "321", 4, mat, fizik, turkce);
		st2.addBulkExamNote(90, 80, 100);
		st2.isPass();
		
		Student st3 = new Student("Fadime", "456", 4, mat, fizik, turkce);
		st3.addBulkExamNote(60, 50, 65);
		st3.isPass();
		
	}

}
