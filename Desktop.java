package week3.day1;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("Desktop size");
		
	}
	
	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.computerModel();
		desk.desktopSize();		
	
	}

}
