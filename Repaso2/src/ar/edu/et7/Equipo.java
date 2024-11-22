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


	
	public void print() {
		
		

		for(String j : jugadores) {
			System.out.println("jugador: "+j);			
		}
		
		
		
		
	}

}
