package com.foreachvsiterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {

	
	
	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Pedro");
		lista.add("Olga");
		lista.add("Miguel");
		lista.add("Antonio");
		lista.add("Pedro");	
		// como dirian los viejos, en mi epoca era la unica forma
		Iterator<String> it = lista.iterator();
		while (it.hasNext()) {
		 
			System.out.println(it.next());
		 
		}
		

	}
	
	

}
