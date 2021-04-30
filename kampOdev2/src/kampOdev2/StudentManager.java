package kampOdev2;

public class StudentManager extends UserManager {
	public void add1(Student student1) {
		System.out.println(student1.getStudentNumber() + " Nolu Aslı isimli  öğrenci eklendi");
	}
	
	public void add2(Student student2) {
		System.out.println(student2.getStudentNumber() + " Nolu Elif isimli  öğrenci eklendi");
	}
	
	public void add3(Student student3) {
		System.out.println(student3.getStudentNumber() + " Nolu İrem Nur isimli  öğrenci eklendi");
	}
	
	public void update1(Student student1) {
		System.out.println(student1.getCoursesTaken() + " : Aslı için alınan kurslar güncellendi");
	}
	
	public void update2(Student student2) {
		System.out.println(student2.getCoursesTaken() + " : Elif için alınan kurslar güncellendi");
	}
	
	public void update3(Student student3) {
		System.out.println(student3.getCoursesTaken() + " : İrem Nur için alınan kurslar güncellendi");
	}

}
