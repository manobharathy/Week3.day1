package week3.day1;

public class College {

	public void collegeName() {
		System.out.println("College name");
	}
	public void collegeCode() {
		System.out.println("College code");
	}

	public void collegeRank() {
		System.out.println("College Rank");
	}

	public static void main(String[] args) {
		
		College col = new College();
		col.collegeCode();
		col.collegeName();
		col.collegeRank();

	}

}
