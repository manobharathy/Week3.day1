package week3.day1;

public class BankInfo {
	
	public void savings() {
		System.out.println("savings");
	}

	public void fixed() {
		System.out.println("Fixed");
	}
	
	public void deposit() {
		System.out.println("Deposit 1");
	}
	
	public static void main(String[] args) {
		
		BankInfo bank = new BankInfo();
		bank.savings();
		bank.fixed();
		bank.deposit();
		
				
		

	}

}
