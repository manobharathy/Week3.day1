package week3.day1;

public class Axisbank extends BankInfo {

	public void deposit() {
		System.out.println("New Deposit");
	}

	public static void main(String[] args) {

		Axisbank axis = new Axisbank();
		axis.savings();
		axis.fixed();
		axis.deposit();

	}

}
