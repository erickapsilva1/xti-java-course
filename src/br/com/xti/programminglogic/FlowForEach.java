package br.com.xti.programminglogic;

import java.util.ArrayList;

public class FlowForEach {
	public static void main(String[] args){
		
		// common for
		int[] even = {2,4,6,8,10};
		for(int i=0; i<even.length; i++){
			System.out.println(i);
		}
		
		// foreach
		for(int e : even){
			System.out.println(e);
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<=10; i++){
			list.add(i);
		}
		
		for(int i : list){
			System.out.println(i);
		}
	}
}