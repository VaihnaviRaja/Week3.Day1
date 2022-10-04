package or.system;

public class Desktop extends Computer{
	private void desktopSize() {
		System.out.println("Desktop Size");
	}

	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.desktopSize();
		d.computerModel();
		
	}

}
