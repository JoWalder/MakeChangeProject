package money;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		float price = 0, tendered = 0;

		Scanner kb = new Scanner(System.in);

		System.out.println("What is the price of the item you want to buy? ");
		price = kb.nextFloat();

		System.out.println("How much did the customer pay? ");
		tendered = kb.nextFloat();

		if (tendered < price) {
			System.out.println("Hey, you still owe me money!");

		}
		kb.close();
		if (tendered == price) {
			System.out.println("You paid the exact amount, no change back.");
		}
		double overPay = (tendered - price); // difference between
		
		if (overPay > 0) {
			DecimalFormat twoPlaces = new DecimalFormat();
			System.out.println("I owe you $" + twoPlaces.format(overPay) );

		}
		

		overPay =(int)(overPay * 100);
		int overPay2 = (int)(overPay); 
		 
		 int twenty = overPay2 / 2000;
		if (twenty > 0) {
			overPay2 = overPay2 % 2000;
			System.out.println(twenty + " twenty dollar bill(s)");
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
			overPay2 = overPay2 % 100;
			System.out.println(ones + " one dollar bill(s)");

		}
		
		 overPay = (int)overPay *1;
		overPay = (overPay) % 100;
		int overPay3 = (int)overPay;
		
		
		int quarters = overPay3 / 25;
		if (quarters >  0) {
			overPay3 = overPay3 % 25;
			System.out.println(quarters + " quarter(s)");
		}
		
		int dimes  = overPay3 / 10;
		if(dimes > 0) {
			overPay3 = overPay3 % 10;
			System.out.println(dimes + " dime(s)");
		}
		int nickle = overPay3 /5;
		if (nickle > 0) {
			overPay3 = overPay3 % 5;
			System.out.println(nickle + " nickle(s)");	
		}
		int penny = overPay3 /1;
		if (penny > 0) {
			System.out.println(penny + " cent(s)");
		}
		
	}

}
