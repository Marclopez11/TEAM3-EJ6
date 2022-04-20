package main;

import dto.Espectador;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Espectador espectadores[] = new Espectador[20];
		for (int i = 0; i < espectadores.length; i++) {
			espectadores[i] = new Espectador();
			System.out.println(espectadores[i]);
		}
	}

}
