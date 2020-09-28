package Calculadora;

import java.util.ArrayList;

public class Calculadora {
	private ArrayList<String> historial;
	
	private void saveToHistory(String operacion) {
		historial.add(operacion);
	}
	public double suma(double a, double b) {
		saveToHistory(a+"+"+b);
		return a+b;
		}                                             //a ver si cambia github
	                                                      //agrego esto para hacer un pull
}
