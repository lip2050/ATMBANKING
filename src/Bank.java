public class Bank {

	public static void main(String[] args) {

		SavingsAccount sa = new SavingsAccount();
		CurrentAcount ca = new CurrentAcount();
		sa.pincode();
		sa.withdraw();
		sa.deposit();
		sa.interest();
		ca.pincode();
		ca.withdraw();
		ca.deposit();
		ca.interest();
	}
}
