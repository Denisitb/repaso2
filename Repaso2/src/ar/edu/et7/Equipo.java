package ar.edu.et7;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

	List<String> jugadores;

	Equipo() {
		jugadores = new ArrayList<String>();
		//
	}

	public void add(String n) {
		jugadores.add(n);
	}

	public static void main() {
		Equipo e = new Equipo();
		e.add("Galindez");
		e.add("Ibañez");
		e.add("Tobio");
		e.add("Merolla");
		e.add("Souto");
		e.add("Fattori");
		e.add("Hezze");
		e.add("Cristaldo");
		e.add("Mazanti");
		e.add("Gauto");
		e.add("Coccaro");
		
		e.print();

	}
	
	public void print() {
		
		

		for(String j : jugadores) {
			System.out.println("jugador: "+j);			
		}
		
		
		
		
	}

}
