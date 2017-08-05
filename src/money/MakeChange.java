package money;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		double price = 0.0, tendered = 0.0, cash;

		Scanner kb = new Scanner(System.in);

		System.out.println("What is the price of the item you want to buy? ");
		price = kb.nextDouble();

		System.out.println("How much did the customer pay? ");
		tendered = kb.nextDouble();

		if (tendered < price) {
			System.out.println("Hey, you still owe me money!");
		}

		if (tendered == price) {
			System.out.println("You paid the exact amount, no change back.");
		}

		double overPay = tendered - price;
		System.out.println("I owe you: $ " + overPay);

		int overPay2 = (int) (overPay * 100);
		//System.out.println(overPay2);

		int dollars = overPay2 / 100;
		System.out.println(dollars);
		int twen = 0;
		int ten = 0;
		int five = 0;
		int one = 0;
				
		if (dollars >= 20) {
			 twen = dollars % 20;
			 System.out.println("That's " + twen + " dollars");
		}
		
		else if (dollars < 20 && dollars >= 10) {
			ten = dollars % 10;
			System.out.println("That's " + ten + " dollars");
		}
		
		else if (dollars <= 5 && dollars > 1) {
			five = dollars % 5;
			System.out.println("That's " + five + " dollars");
		}
		
		else {
			System.out.println("That's " + one + " dollars");
		}

		
		int cents = overPay2 % 100;
		
		System.out.println(cents);

	}
}
