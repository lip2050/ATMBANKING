import java.util.Scanner;

public class SavingsAccount implements BankDemo {
	Scanner scan = new Scanner(System.in);

	public void pincode() {
		int i;
		for (i = 1; i <= 3; i++) {
			System.out.println("Enter your pin");
			int z = scan.nextInt();
			if (z != 1234) {
				System.out.println("Incorrect");
			} 
			else {
				break;
			}

		}

		if (i == 4) {
			System.out.println("Sorry, you have exausted your tries.\n See your bank for more information.\n Thank you. ");
		}

	}

	public void withdraw() {
		System.out.println("Enter 1 for Savings account.\nEnter 2 for Current acccount.");
		int x = scan.nextInt();
		System.out.println(x);
		if (x == 1) {
			System.out.println("SAVINGS ACCOUNT");
			System.out.println("Enter 1 for withdrawal.\nEnter 2 for deposit.\nEnter 3 for balance enqiures.");
			int y = scan.nextInt();

			if (y == 1) {

				System.out.println("1.$10\n2.$20\n3.$50\n4.$100\n5.$300\n6.$500");
				int j = scan.nextInt();
				System.out.println("Thank you for your transactions.");
			}
		}
	}


	public void deposit() {
		System.out.println("Enter 1 for Savings account.\nEnter 2 for Current acccount");
		int x = scan.nextInt();
		System.out.println(x);
		if (x == 1) {
			System.out.println("SAVINGS ACOUNT");
			System.out.println("Enter 1 for withdrawal.\nEnter 2 for deposit.\nEnter 3 for balance enqiures");
			int d = scan.nextInt();
			if (d == 2) {
				System.out.println("Please deposite amount");
				int dp = scan.nextInt();
				System.out.println("$ " + dp + " Amount verified");
			}
		}
	}

	public void interest() {
		System.out.println("Enter 1 for Savings account.\nEnter 2 for Current acccount");
		int x = scan.nextInt();
		System.out.println(x);
		if (x == 1) {
			System.out.println("Enter 1 for withdrawal.\nEnter 2 for deposit.\nEnter 3 for balance enqiures");
			int y = scan.nextInt();
			if (y == 3) {
				double p = 5000;
				double t = 2.5;
				double r = 8;
				double s = (p * t * r) / 100;
				double b = p + s;
				System.out.println("Your balance is" + b);
			}
		}
	}

}
