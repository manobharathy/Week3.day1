package week3.day1;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Student name");
	}
	public void studentDept() {
		System.out.println("Student department");
	}

	public void studentId() {
		System.out.println("student id");
	}

	public static void main(String[] args) {
		
		Student stud = new Student();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
		stud.collegeCode();
		stud.collegeName();
		stud.collegeRank();
		stud.deptName();
		
	}

}
