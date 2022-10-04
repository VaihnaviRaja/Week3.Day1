package Week3.Day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Overridden Deposit");
	}

	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.deposit();
		a.fixed();
		a.savings();	

	}

}
