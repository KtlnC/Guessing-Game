/*	
 * Name: Guessing Game
 * Author: Kaitlyn Cao	
 * Date: 9/26/17
 */

package game;

import java.util.Scanner;
import java.util.InputMismatchException;
public class GuessingGame {
	private static Scanner input;

	public static void main(String[] args)
	{
  		input = new Scanner(System.in);
		System.out.println("What is your name?");
		String s = input.next();
		System.out.println("Nice to meet you, " + s);
		
		boolean isNumber = false;
		int answer = (int) (Math.random() * 10 + 1);
		int guess = 0;
		//guess should be changed in the while loop
		while(guess != answer)
		{
			while(!isNumber)
			{
				try
				{
					System.out.println("Pick a number from 1 - 10");
					input.nextInt();
					isNumber = true;
					
				}
				catch(InputMismatchException e)
				{
					System.out.println("That was error type: " + e);
				}				
			}

		}
	}
}


 