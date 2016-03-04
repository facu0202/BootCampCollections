package com.facudesa.generico;

public class Wrapper<T> {
	
	private T t;
	public void add(T param)
	{
		t = param;
	}
	
	public void imprimir()
	{
		
		System.out.println(t.getClass().getName());
	}
	
	
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public static void main(String[] args) {
		
		Wrapper<Golosina> w = new Wrapper<Golosina>();
		w.add(new Golosina("facu"));
		w.imprimir();
		
		
		Wrapper<Chocolatin> w2 = new Wrapper<Chocolatin>();
		//w2.add(new Golosina("facu"));
		w2.add(new Chocolatin("facu"));
		w2.imprimir();
		
		//w2.getT().getMarca();
			
	}
	

}
