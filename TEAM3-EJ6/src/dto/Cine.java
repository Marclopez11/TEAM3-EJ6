package dto;

public class Cine {

	private int precioEntrada = 7;
	
	private int[] filas = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	private String[] columnas ={ "A-", "B-", "C-", "D-", "E-", "F-", "G-", "H-", "I-" };

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
		
		
		
		for (int i = 0; i < filas.length; i++) {
			for (int j = 0; j < columnas.length; j++) {
				if (columnas[j] == "A-") {
					System.out.println("");

				}
				System.out.print(filas[i] + columnas[j] + " ");
			}
		}

	}
	
	
	
	
	//comprobarDinero
	//comprobarEdad
	

	

}