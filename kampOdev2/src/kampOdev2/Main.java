package kampOdev2;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setFirstName("Aslı");
		student1.setId(8989);
		student1.setStudentNumber(789654);
		student1.setCoursesTaken("JAVA / REACT");
		student1.setParola(2143);
		student1.setContact(54321546);
		
		Student student2 = new Student();
		student2.setFirstName("Elif");
		student2.setId(7676);
		student2.setStudentNumber(345678);
		student2.setCoursesTaken("C#");
		student2.setParola(9854);
		student2.setContact(12345678);
		
		Student student3 = new Student();
		student3.setFirstName("İrem Nur");
		student3.setId(6565);
		student3.setStudentNumber(214365);
		student3.setCoursesTaken("C++");
		student3.setParola(4532);
		student3.setContact(98765432);
		
		Student[] students = new Student[1];
		for (Student student : students) {
						
			System.out.println();
			System.out.println(student1.getFirstName());
			System.out.println(student1.getCoursesTaken());
			System.out.println(student1.getStudentNumber());
			System.out.println();
			System.out.println(student2.getFirstName());
			System.out.println(student2.getCoursesTaken());
			System.out.println(student2.getStudentNumber());
			System.out.println();
			System.out.println(student3.getFirstName());
			System.out.println(student3.getCoursesTaken());
			System.out.println(student3.getStudentNumber());
			System.out.println();

		
		}
		
		StudentManager studentmanager = new StudentManager();
		studentmanager.add1(student1);
		studentmanager.update1(student1);
		
		studentmanager.add2(student2);
		studentmanager.update2(student2);
		
		studentmanager.add3(student3);
		studentmanager.update3(student3);
		
		System.out.println();
		
		System.out.println("EĞİTMENLER");
		
		Insructor insructor1 = new Insructor();
		insructor1.setFirstName("Engin Demiroğ");
		insructor1.setJob("Meslek : Eğitmen");
		insructor1.setCoursesGiven("Verdiği Kurslar : C#, JAVA ");
		insructor1.setId(2345);
		
		Insructor insructor2 = new Insructor();
		insructor2.setFirstName("Ali Aras");
		insructor2.setJob("Meslek : Eğitmen");
		insructor2.setCoursesGiven("Verdiği Kurslar : C++ , Phyton ");
		insructor2.setId(8954);
		
		Insructor insructor3 = new Insructor();
		insructor3.setFirstName("Yasemin Deniz");
		insructor3.setJob("Meslek: Eğitmen");
		insructor3.setCoursesGiven("Verdiği Kurslar : C , C++ ");
		insructor3.setId(3478);
		
		System.out.println();
		
		Insructor[] insructors = new Insructor[1];
		
		for (Insructor insructor : insructors) {
			System.out.println(insructor1.getFirstName());
			System.out.println(insructor1.getJob());
			System.out.println(insructor1.getCoursesGiven());
			System.out.println(insructor1.getId());
			System.out.println();
			System.out.println(insructor2.getFirstName());
			System.out.println(insructor2.getJob());
			System.out.println(insructor2.getCoursesGiven());
			System.out.println(insructor2.getId());
			System.out.println();
			System.out.println(insructor3.getFirstName());
			System.out.println(insructor3.getJob());
			System.out.println(insructor3.getCoursesGiven());
			System.out.println(insructor3.getId());
			System.out.println();
			
		}
		
		InsructorManager insructormanager = new InsructorManager();
		insructormanager.update1(insructor1);
		insructormanager.update2(insructor2);
		insructormanager.update3(insructor3);

		
		
		
			
			
		
		

			
			
		
		
		
		
		
		
		

	}

}
