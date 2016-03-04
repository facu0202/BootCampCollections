package com.facudesa.orden;

import java.util.ArrayList;
import java.util.Collections;

public class Principal2 {

	public static void main(String[] args) {

		ArrayList<Persona> milista = new ArrayList<Persona>();
		milista.add(new Persona("facu99"));
		milista.add(new Persona("facu1"));
		milista.add(new Persona("facu2"));

		Collections.sort(milista, (Persona p1, Persona p2) -> p1.getNombre().compareTo(p2.getNombre()));

		for (Persona p : milista) {

			System.out.println(p.getNombre());

		}
	}

}