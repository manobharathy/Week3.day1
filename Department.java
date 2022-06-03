package week3.day1;

public class Department extends College {

	public void deptName() {
		System.out.println("Department Name");
	}

	public static void main(String[] args) {
		
		Department dept = new Department();
		dept.deptName();
		dept.collegeCode();
		dept.collegeRank();
		dept.collegeName();

	}



	}


