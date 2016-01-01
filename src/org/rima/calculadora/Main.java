package org.rima.calculadora;

public class Main {
	public static void main(String[] args) {
		Calculadora c;
		c = new Calculadora();
		c.suma();
		c.resta();
		c.multiplica();
		c.divide();
		
		System.out.println("Resultado de suma : "+c.sum);
		System.out.println("Resultado de resta : "+c.res);
		System.out.println("Resultado de multiplica : "+c.multi);
		System.out.println("Resultado de división : "+c.div);
	}
}
