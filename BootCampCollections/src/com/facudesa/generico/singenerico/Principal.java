package com.facudesa.generico.singenerico;

import com.facudesa.generico.Chocolatin;
import com.facudesa.generico.Golosina;

public class Principal {

	public static void main(String[] args) {

		Bolsa bolsa = new Bolsa(5);
		Chocolatin c = new Chocolatin("milka");
		Chocolatin c1 = new Chocolatin("milka");
		Chocolatin c2 = new Chocolatin("ferrero");
		Golosina g1 = new Golosina("gominola");
		Golosina g2 = new Golosina("chicle");

		bolsa.add(c);
		bolsa.add(c1);
		bolsa.add(c2);
		bolsa.add(g1);
		bolsa.add(g2);

		for (Object o : bolsa) {

			if (o instanceof Chocolatin) {

				Chocolatin chocolatina = (Chocolatin) o;
				System.out.println(chocolatina.getMarca());

			} else {

				Golosina golosina = (Golosina) o;
				System.out.println(golosina.getNombre());
			}
		}

	}

}