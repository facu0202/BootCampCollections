package com.foreachvsiterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Pedro");
		lista.add("Olga");
		lista.add("Miguel");
		lista.add("Antonio");
		lista.add("Pedro");
		// ahora los pibes hacen
		for (String nombre : lista) {
			 
			 System.out.println(nombre);
			}

	}

}
