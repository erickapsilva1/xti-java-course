package br.com.xti.oop;

public class EnumTest {
	
	public static void walk(Measure measure, int total) {
		if(measure == Measure.M) {
			System.out.println("Walking " + total + " " + measure);
		}else if(measure == Measure.MM){
			System.out.println("Walking " + total + " " + measure);
		}
	}

	public static void main(String[] args) {
		
		System.out.println(ChessPieces.BISHOP);
		System.out.println(Measure.MM.title);
		
		for(Measure m : Measure.values()) {
			System.out.println(m + ": " + m.title + ";");
		}
		
		walk(Measure.M, 159);
		
	}

}
