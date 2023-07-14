package br.com.xti.programminglogic;

import java.util.Random;

public class CardsDeck {
	public static void main(String[] args){
		
		String[] faces = 
		{
			"A","2","3","4","5","6","7","8","9","10","Jack","Queen","King"
		};
		
		String[] nipes = 
		{
			"Spades", "Clubs", "Hearts", "Diamonds"
		};
		
		Random random = new Random();
		int randomFace = random.nextInt(faces.length);
		int randomNipe = random.nextInt(nipes.length);
		
		String card = faces[randomFace] + " " + nipes[randomNipe];
		
		System.out.println(card);
		
		
	}
}