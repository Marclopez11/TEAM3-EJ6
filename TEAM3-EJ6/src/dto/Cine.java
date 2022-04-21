package dto;

public class Cine {

	private int precioEntrada = 7;

	private int[] filas = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	private String[] columnas = { "A-", "B-", "C-", "D-", "E-", "F-", "G-", "H-", "I-" };

	public Cine(int precioEntrada) {
		super();
		this.precioEntrada = precioEntrada;
	}

	public int getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(int precioEntrada) {
		this.precioEntrada = precioEntrada;
	}
	
	
	public int[] getFilas() {
		return filas;
	}

	public void setFilas(int[] filas) {
		this.filas = filas;
	}

	public String[] getColumnas() {
		return columnas;
	}

	public void setColumnas(String[] columnas) {
		this.columnas = columnas;
	}

	public void mostrarAsientos() {

		for (int i = 0; i < filas.length; i++) {
			for (int j = 0; j < columnas.length; j++) {
				if (columnas[j].charAt(0) == 'A') {
					System.out.println("");

				}
				System.out.print(filas[i] + columnas[j] + " ");
			}
		}

	}

	//comprobar si el usuario puede comprar la entrada
	public boolean comprobarDinero(int dinero) {
		
		boolean cmdinero =  false;
		if(dinero >= precioEntrada ) {
			System.out.println("Tienes dinero para comprar la entrada!!");
			cmdinero = true;
			
		}else {
			System.out.println("Te falta dinero!!");
			
		}
		
		
		return cmdinero;

	}

	//comprobar si el usuario tiene la edad correcta

	public boolean comprobarEdad(Pelicula p,int edad) {
		
		boolean cmedad =  false;
		
		if(edad >= p.getEdadMinima() ) {
			System.out.println("Tienes la edad permitida para ver la pelicula!!");
			cmedad = true;
			
		}else {
			System.out.println("No tienes la edad necesaria!!");
			
		}

		
		
		return cmedad;

	}

}