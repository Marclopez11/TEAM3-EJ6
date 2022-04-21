package main;

import java.util.Iterator;

import dto.Cine;
import dto.Espectador;
import dto.Pelicula;

public class App{

	//Eloi Martorell 
	//Marc Lopez
	//21/04/2022
	public static void main(String[] args) {

		//cine con precio entrada:
		Cine cine = new Cine(7);
		Pelicula p = new Pelicula("Batamanta man",130, 16, "Loulogio");
		
		
		//"entra la gente" generamos x cantidad de pesonas
		Espectador e[] = new Espectador[30];
		for (int i = 0; i < e.length; i++) {
			e[i] = new Espectador();
			System.out.println(e[i]);
		}
		
		//mostramos los asientos
		System.out.println();
		cine.mostrarAsientos();
		System.out.println();
		
		//"compran las entradas" miramos si tienen el dinero y la edad
		int espectadores = 0;
		for (int i = 0; i < e.length; i++) {
			if(cine.comprobarEdad(p,e[i].getEdad()) && cine.comprobarDinero(e[i].getDinero())) {
				espectadores++;
			}
		}
		
		//si pueden entrar buscan asiento && //mostramos los asientos ocupados
		cine.buscarAsiento(espectadores);
		
	}

}
