package com.bridgelabz.snakeandladder;

import java.util.Random;

public class SnakeLadder {
	public static void main(String[] args) {
		int start;
		start = 0;

		// print the starting position
		System.out.println("Player Starting Position will be:~ ");
		System.out.println(+start); // just print out to start value

		/*
		 * create instance of random class Then Invoke methods Generate numbers in the
		 * range 1to6 print dice roll result
		 */
		Random random = new Random();
		int dice = random.nextInt(6) + 1;
		System.out.println("dice roll result: " + dice);

	}

}
