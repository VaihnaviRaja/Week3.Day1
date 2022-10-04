package Week3.Day1;

public class MyVehicles {

	public static void main(String[] args) {
		AshokLeyland a = new AshokLeyland();
		a.accelerate();
		a.container();
		a.load();
		System.out.println("==============");
		Suzuki s = new Suzuki();
		s.accelerate();
		s.autoStart();
		s.selfStart();

	}

}
