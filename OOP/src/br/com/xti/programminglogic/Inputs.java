package br.com.xti.programminglogic;

import java.util.Scanner;

public class Inputs {
	
	public static void main(String[] args){
		
		// Chamada do programa
		// System.out.println(args[0]);
		
		// Interagindo com o usuario
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type your name: ");
		String name = scanner.nextLine();
		System.out.println("Welcome " + name);
		
	}
}