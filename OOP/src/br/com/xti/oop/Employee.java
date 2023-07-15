package br.com.xti.oop;

public class Employee {
	
	private String name;
	private boolean active;
	
	public String getName() {
		return name;
	}
	
	public boolean isActive() {
		return active;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setActive(boolean status) {
		this.active = status;
	}
	
}
