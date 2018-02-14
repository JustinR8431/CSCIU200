package practice;

import java.util.Scanner; 
import java.text.NumberFormat; 
import java.util.Random;

public class Scannerstuff {
	public static void main(String[] args) {
		
		int mymoney, pizzaprice, subtotal; 
		double taxtotal, moneyleftover, total; 
		
		Scanner scan = new Scanner(System.in);
		Random gen = new Random(); 
		NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
		NumberFormat fmt2 = NumberFormat.getPercentInstance();
		
		System.out.println("How much money do you have?");
		mymoney = scan.nextInt();
		scan.close();
		
		pizzaprice = gen.nextInt(10) + 3;
		System.out.println("The pizza cost " + pizzaprice + " dollars");
		
		subtotal = pizzaprice; 
		taxtotal = subtotal * .06; 
		total = taxtotal + subtotal; 
		moneyleftover = mymoney - total; 
		
		System.out.println("Subtotal: " + subtotal);
		System.out.println("Total with tax is: " + fmt1.format(total));
		System.out.println("You are left with " + fmt1.format(moneyleftover)); 
	
		
	}

}
