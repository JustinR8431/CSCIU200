package practice;

import java.util.Random; 
import java.util.Scanner; 

public class prac {
	
	public static void main(String[] args) {
		int num1;
		int num2; 
		
		Random generator = new Random();
		
		num1 = generator.nextInt(10);
		num2 = generator.nextInt(10); 
		
		if (num1 > num2)
			System.out.println(num1 + " num1 is greater than " + num2);
		
		if (num1 < num2)
			System.out.println(num2 + " num2 is greater than " + num1);
		
		if (num1 == num2)
			System.out.println(num1 + " num1 is the same as num2" + num2);
		
	}

}
