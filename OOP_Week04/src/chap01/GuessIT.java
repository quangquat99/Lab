package chap01;

import java.util.Random;
import java.util.Scanner;

public class GuessIT {
	private static Scanner sc;

	public static void main(String[] args) {
//		Random random = new Random();
//		int randomNum = random.nextInt(100);
		final int max 		= 100;
		final int min 		= 1;
		final int maxFail 	= 10;
		int secretNum = (int) (Math.random() * ( max - min )) + min;
		
		
		int yourNum = 0;
		int NumofGuess = 0;
		while ( secretNum != yourNum && NumofGuess < maxFail )
		{
			NumofGuess++;
			System.out.println("Your's Guess : ");
			sc = new Scanner(System.in);
			yourNum = sc.nextInt();
			sc.nextLine();
			
			if ( secretNum > yourNum ) 
			{
				System.out.println("Greater than!");
				System.out.println("Num of your's Guess : " + NumofGuess);
			}
			else if ( secretNum < yourNum ) 
			{
				System.out.println("Less than!");
				System.out.println("Num of your's Guess : " + NumofGuess);
			}
			else
			{
				System.out.println("Succesfull! YOu WIN...!");
				System.out.println("Num of your's Guess : " + NumofGuess);
			}
			
			
			System.out.println("----------------------");
		}
		
		if ( NumofGuess >= maxFail )
		{
			System.out.println("You lose!!!");
		}
	
	}
}
