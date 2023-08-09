package br.com.xti.programminglogic;

import java.util.Random;
import java.util.Scanner;

public class RollDiceChallenge {
	public static void main(String[] args){
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int roll = random.nextInt(6) + 1;
		
		System.out.println("Rolled dice! What's your guess?");
		
		int guess = scanner.nextInt();
		
		System.out.println("Roll: " + roll + ", " + "Your guess: " + guess);
		
		if(roll == guess){
			System.out.println("You won!");
		}else{
			System.out.println("You lose!");
		};
		
	}
}