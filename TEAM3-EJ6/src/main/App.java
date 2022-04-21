package main;

import dto.Cine;
import dto.Espectador;

public class App{

	public static void main(String[] args) {

		//cine con precio entrada:
		Cine cine = new Cine(7);
		//mostramos los asientos
		cine.mostrarAsientos();
		//"entra la gente" generamos x cantidad de pesonas
		
		//"compran las entradas" miramos si tienen el dinero y la edad
		
		//si pueden entrar buscan asiento
		System.out.println();
		Espectador e = new Espectador();
		e.buscarAsiento(cine, 10);
		
		//mostramos los asientos ocupados
		
	}

}
