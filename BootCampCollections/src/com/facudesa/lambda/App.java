package com.facudesa.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

interface CamisaTest {

	Boolean test(Camisa camisa);
}

class CamisaRoja implements CamisaTest {
	@Override
	public Boolean test(Camisa camisa) {
		return "ROJO".equals(camisa.getColor());
	}

}

class Camisa {

	private String color;
	private String talle;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	public Camisa(String color, String talle) {
		super();
		this.color = color;
		this.talle = talle;
	}

	@Override
	public String toString() {
		return "Camisa [color=" + color + ", talle=" + talle + "]";
	}
	
	public void imprimir()
	{
		System.out.println(this.toString());
	}
	
	
	

}

public class App {

	public static void main(String[] args) {

		
		/*
		z -> z + 2
		() -> System.out.println(” Mensaje 1 “)
		(int longitud, int altura) -> { return altura * longitud; }
		(String x) -> { String retorno = x;
		retorno = retorno.concat(” ***”);
		return retorno; }
		
		*/
		
		List<Camisa> list = Arrays.asList(new Camisa("ROJO", "L"), new Camisa("VERDE", "X"), new Camisa("ROJO", "XL"));

		
		List<Camisa> newlist = App.filtrar(list,(c) -> "VERDE".equals(c.getColor()));
		for (Camisa camisa : newlist) {
			System.out.println(camisa);
		}
		
		System.out.println("-----------------------");
		newlist = App.filtrar(list,(c) -> "VERDE".equals(c.getColor()),(p) -> p.imprimir());
		
		System.out.println("-----------------------");
		newlist = App.filtrar(list,(c) -> "VERDE".equals(c.getColor()),(color) -> System.out.println("color: "+ color), p -> p.getColor());
	}

	

	public static List<Camisa> filtrarRojas(List<Camisa> inv) {
		List<Camisa> sub = new ArrayList<Camisa>();
		for (Camisa camisa : inv) {
			if ("ROJO".equals(camisa.getColor())) {
				sub.add(camisa);
			}
		}
		return sub;
	}

	// incoporar color
	public static List<Camisa> filtrarRojas(List<Camisa> inv, String pColor) {
		List<Camisa> sub = new ArrayList<Camisa>();
		for (Camisa camisa : inv) {
			if (pColor.equals(camisa.getColor())) {
				sub.add(camisa);
			}
		}
		return sub;
	}

	// tambien por talla
	public static List<Camisa> filtrarRojas(List<Camisa> inv, String pColor, String pTalla) {
		List<Camisa> sub = new ArrayList<Camisa>();
		for (Camisa camisa : inv) {
			boolean ok = false;
			if (pColor != null && pColor.equals(camisa.getColor())) {
				ok = true;

			} else {
				ok = pColor != null;
			}
			if (pTalla != null && pTalla.equals(camisa.getTalle())) {
				ok = true;
			} else {
				ok = pTalla != null;
			}
			if (ok)
				sub.add(camisa);
		}
		return sub;
	}

	
	public static List<Camisa> filtrarTest(List<Camisa> inv, CamisaTest predicado) {
		List<Camisa> sub = new ArrayList<>();
		for (Camisa camisa : inv) {
			if (predicado.test(camisa)) {
				sub.add(camisa);
			}
		}
		return sub;
	}
	
	
	public static List<Camisa> filtrar (List<Camisa> camisas, Predicate<Camisa> test)
	{
		List<Camisa> result = new ArrayList<>();
		for (Camisa camisa : camisas) {
			if (test.test(camisa))
				result.add(camisa);
		}
		return result;
		
	}
	
	public static List<Camisa> filtrar (List<Camisa> camisas, Predicate<Camisa> test, Consumer<Camisa> consumer)
	{
		List<Camisa> result = new ArrayList<>();
		for (Camisa camisa : camisas) {
			if (test.test(camisa))
				result.add(camisa);
				consumer.accept(camisa);
		}
		return result;
		
	}
	
	public static List<Camisa> filtrar (List<Camisa> camisas, Predicate<Camisa> test, Consumer<String> consumer, Function<Camisa, String> funcion)
	{
		List<Camisa> result = new ArrayList<>();
		for (Camisa camisa : camisas) {
			if (test.test(camisa))
				result.add(camisa);
				String data = funcion.apply(camisa);
				consumer.accept(data);
		}
		return result;
		
	}
	
	
}
