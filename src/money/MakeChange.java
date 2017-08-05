package money;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		double price = 0.0, tendered = 0.0;
		double cash;

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
		double dollar = (int)(overPay);
		double cents = (overPay * 100) % 100;
		System.out.println("I owe you " + dollar + " dollars and " + cents + " cents.");
		
		
		
	
	}
}
