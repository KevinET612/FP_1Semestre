/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "SIN_TITULO.java."

import java.io.*;

public class sin_titulo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double costo;
		double dcion;
		System.out.println("Introducir duracion de la llamada: ");
		dcion = Double.parseDouble(bufEntrada.readLine());
		if (dcion<3) {
			costo = 10;
		} else {
			costo = 10+(dcion-3)*5;
		}
		System.out.println("La cantidad total de la llamada es: $"+costo);
	}


}

