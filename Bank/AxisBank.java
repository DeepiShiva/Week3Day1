package Bank;

public class AxisBank extends BankInfo {

	public void deposit()

	{
		System.out.println("This is my Deposit Account of AxisBank");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankInfo bank = new AxisBank();

		bank.deposit();

	}

}
