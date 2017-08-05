package money;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		double price = 0.0, tendered = 0.0;

		Scanner kb = new Scanner(System.in);

		System.out.println("What is the price of the item you want to buy? ");
		price = kb.nextDouble();

		System.out.println("How much did the customer pay? ");
		tendered = kb.nextDouble();

		if (tendered < price) {
			System.out.println("Hey, you still owe me money!");

		}
		kb.close();
		if (tendered == price) {
			System.out.println("You paid the exact amount, no change back.");
		}

		double overPay = (tendered - price); // difference between
		System.out.println("I owe you: $ " + overPay);

		int overPay2 = (int) (overPay * 100);// casting to an int
		 //double overPay3 = overPay - overPay2;
		int twenty = overPay2 / 2000;
		if (twenty > 0) {
			overPay2 = overPay2 % 2000;
			System.out.println(twenty + "twenty dollar bill(s)");
		}

		int tens = overPay2 / 1000;
		if (tens > 0) {
			overPay2 = overPay2 % 1000;
			System.out.println(tens + " ten dollar bill(s)");
		}

		int fives = overPay2 / 500;
		if (fives > 0) {
			overPay2 = overPay2 % 500;
			System.out.println(fives + " five dollar bill(s)");
		}

		int ones = overPay2 / 100;
		if (ones > 0) {
			overPay = overPay % 100;
			System.out.println(ones + " one dollar bill(s)");

		}
//System.out.println(overPay3);
	}

}
