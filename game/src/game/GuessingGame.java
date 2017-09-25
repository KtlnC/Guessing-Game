package game;

import java.util.Scanner;
import java.
public class GuessingGame {
	private static Scanner input;

	public static void main(String[] args)
	{
  		input = new Scanner(System.in);
		System.out.println("What is your name?");
		String s = input.next();
		System.out.println("Nice to meet you, " + s);
		
		int answer = (int) (Math.random() * 10 + 1);
		int guess = 0;
		while(guess != answer)
		{
			try
			{
				System.out.println("Pick a number from 1 - 10");
				input.nextInt();
				
			}
			catch(Input MisMatch Exception e)
			{
				System.out.println("That was error type: " + e);
			}
		}
	}
}


 