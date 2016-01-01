package org.rima.calculadora;

public class Calculadora {
	Integer op1=30;
	Integer op2=10;
	Integer sum;
	Integer res;
	Integer multi;
	Float div;
	public Calculadora() {
		super();
	}
	public Calculadora (int p1, int p2){
		op1 = p1;
		op2 = p2;		
	}
	public Integer suma(){
		sum = op1 + op2;
		return sum;
	}
	public Integer resta(){
		res = op1 - op2;
		return res;
	}
	public Integer multiplica(){
		multi = op1 * op2;
		return multi;
	}
	public Float divide(){
		div = (float) (op1 / op2);
		return div;
	}
}
