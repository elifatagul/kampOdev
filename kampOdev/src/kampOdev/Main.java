package kampOdev;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User("Ali  ", 1234);
		User user2 = new User("Esma  ", 4321); 
		User user3 = new User("Ahmet  ", 6758);
		
		User[] users = {user1, user2, user3 };
		
		for (User user : users) {
			
			System.out.print(user.userName);
			System.out.println(user.parola);
			
		}
		
		
		System.out.println();
		
		UserManager usermanager = new UserManager();
		
		usermanager.loggedIn(user1);
		
		usermanager.loggedIn(user2);
		
		usermanager.loggedIn(user3);
		
		System.out.println();
		
		
		Course course1 = new Course("Yazilim Geliþtirici Yetiþtirme Kampý (JAVA + REACT) ", "Engin Demirog " , 10);
		Course course2 = new Course("Yazilim Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", "Engin Demirog", 75);
		Course course3 = new Course("Programlamaya Giris Ýçin Temel Kurs", "Engin Demirog", 80);
		
		Course[] courses = {course1, course2, course3};
		
		for (Course course : courses) {
			
			System.out.println(course.courseName);
			System.out.println(course.courseInsructor);
			System.out.println(course.participation);
			System.out.println();
			
		}
		
		CourseManager coursemanager = new CourseManager();
		
		coursemanager.registrationSuccessful(course1);
		
		coursemanager.registrationSuccessful(course2);
		
		coursemanager.registrationSuccessful(course3);
		
		
		
		
		
		

	}

}
