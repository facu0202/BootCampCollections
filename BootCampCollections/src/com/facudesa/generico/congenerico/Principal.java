package com.facudesa.generico.congenerico;

import com.facudesa.generico.Chocolatin;

public class Principal {

	public static void main(String[] args) {

		Bolsa<Chocolatin> bolsa = new Bolsa<Chocolatin>();
		Chocolatin c = new Chocolatin("milka");
		Chocolatin c1 = new Chocolatin("milka");
		Chocolatin c2 = new Chocolatin("ferrero");

		bolsa.add(c);
		bolsa.add(c1);
		bolsa.add(c2);

		for (Chocolatin chocolatina : bolsa) {

			System.out.println(chocolatina.getMarca());
		}

	}

}