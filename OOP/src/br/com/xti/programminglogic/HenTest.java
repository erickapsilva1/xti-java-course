package br.com.xti.programminglogic;

public class HenTest {

	public static void main(String[] args) {
		
		Hen hen = new Hen();
		hen.lay().lay().lay();
		
		Hen hen2 = new Hen();
		hen2.lay().lay();
		
		System.out.println(hen.eggs);
		System.out.println(hen2.eggs);
		System.out.println(Hen.farmEggs);
		System.out.println(Hen.farmEggsAverage(2));
	}

}
