package kampOdev2;

public class Student extends User {
	
	private String coursesTaken;
	private int studentNumber;
	
	/*public Student(String coursesTaken, int studentNumber) {
		super();
		this.coursesTaken = coursesTaken;
		this.studentNumber = studentNumber;*/
	//}
	public String getCoursesTaken() {
		return coursesTaken;
	}
	public void setCoursesTaken(String coursesTaken) {
		this.coursesTaken = coursesTaken;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	

}
