package com.foreachvsiterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Borrar {

	public static void main(String[] args) {

		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Pedro");
		lista.add("Olga");
		lista.add("Miguel");
		lista.add("Antonio");
		lista.add("Pedro");
		
		for (String nombre : lista) {

			if (nombre.equals("Pedro")) {

				lista.remove("Pedro");
			}

		}

	}

}
