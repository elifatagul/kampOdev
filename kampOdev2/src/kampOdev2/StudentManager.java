package kampOdev2;

public class StudentManager extends UserManager {
	public void add1(Student student1) {
		System.out.println(student1.getStudentNumber() + " Nolu Asl� isimli  ��renci eklendi");
	}
	
	public void add2(Student student2) {
		System.out.println(student2.getStudentNumber() + " Nolu Elif isimli  ��renci eklendi");
	}
	
	public void add3(Student student3) {
		System.out.println(student3.getStudentNumber() + " Nolu �rem Nur isimli  ��renci eklendi");
	}
	
	public void update1(Student student1) {
		System.out.println(student1.getCoursesTaken() + " : Asl� i�in al�nan kurslar g�ncellendi");
	}
	
	public void update2(Student student2) {
		System.out.println(student2.getCoursesTaken() + " : Elif i�in al�nan kurslar g�ncellendi");
	}
	
	public void update3(Student student3) {
		System.out.println(student3.getCoursesTaken() + " : �rem Nur i�in al�nan kurslar g�ncellendi");
	}

}
