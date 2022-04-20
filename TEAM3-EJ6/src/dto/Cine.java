package dto;

public class Cine {
	
	private int precioEntrada = 7;
		
	
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


	public void mostrarAsientos() {

	int[] filas = {1, 2, 3, 4, 5, 6, 7, 8};
	String[] columnas = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
	
		for(int i=0; i<filas.length; i++) {
			for (int j=0; j<columnas.length; j++) {
				if(columnas[j] == "I") {
					System.out.println("");
				}
			System.out.print(filas[i]+columnas[j]+" ");
			}
		}
	}
}