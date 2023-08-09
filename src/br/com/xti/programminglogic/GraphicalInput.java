package br.com.xti.programminglogic;

import javax.swing.JOptionPane;

public class GraphicalInput {
	
	public static void main(String[] args){
		
		String name = JOptionPane.showInputDialog("What's your name? ");
		JOptionPane.showMessageDialog(null, "Hi " + name);
		
	}
}