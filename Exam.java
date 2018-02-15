package practice;

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int height, width, length, paint;
		double paintNeeded, roomSize;
		paint = 350;

		System.out.println("Please provide the height of the room");
		height = scan.nextInt();

		System.out.println("Please provide the width of the room");
		width = scan.nextInt();

		System.out.println("Please provide the length of the room");
		length = scan.nextInt();
		scan.close();

		roomSize = Math.pow(height + width + length, 2);
		System.out.println("The room is " + roomSize + " square feet");

		paintNeeded = roomSize / paint;
		System.out.println("You need " + paintNeeded + " gallons of paint");
	}
}
