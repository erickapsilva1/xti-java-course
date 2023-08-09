package br.com.xti.oop;

public enum Measure {
	
	MM("Millimeter"), CM("Mentimeter"), M("Meter");
	
	public String title;
	
	Measure(String title){
		this.title = title;
	}

}
