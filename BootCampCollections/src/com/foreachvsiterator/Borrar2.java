package com.foreachvsiterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Borrar2 {

	public static void main(	String[] args) {

		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Pedro");
		lista.add("Olga");
		lista.add("Miguel");
		lista.add("Antonio");
		lista.add("Pedro");

		Iterator<String> it = lista.iterator();

		while (it.hasNext()) {

			String nombre = it.next();
			if (nombre.equals("Pedro")) {

				it.remove();
			}
		}

	}

}
