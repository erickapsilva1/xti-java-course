package br.com.xti.oop;

public class Hen {
	
	public static int farmEggs;
	public int eggs; 
	
	public Hen lay() {
		this.eggs++;
		Hen.farmEggs++;
		return this;
	}
	
	public static double farmEggsAverage(int hens) {
		return Hen.farmEggs / hens;
	}
}
