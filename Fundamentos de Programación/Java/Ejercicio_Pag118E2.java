/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SIN_TITULO.java."

import java.io.*;

public class sin_titulo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int r_sumane;
		int sumane;
		System.out.println("Ingrese un numero Entero: ");
		sumane = Integer.parseInt(bufEntrada.readLine());
		do {
			sumane = sumane+1;
			r_sumane = r_sumane+sumane;
			System.out.println("Los datos obtenidos a sumar son: "+sumane);
		} while (sumane!=50);
		System.out.println("La suma total de los numeros enteros son: "+r_sumane);
	}


}

