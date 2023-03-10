/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "ECUACIONDEPRIMERGRADO.java."

import java.io.*;

public class ecuaciondeprimergrado {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double b;
		double c;
		double x;
		System.out.println("Ingresar un digito para a");
		a = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingresar un digito para b");
		b = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingresar un digito para c");
		c = Double.parseDouble(bufEntrada.readLine());
		if (a!=0) {
			x = (c-b)/a;
			System.out.println("El resultado de x es: "+x);
		} else {
			System.out.println("La ecuacion de primer grado no tiene solucion");
		}
	}


}

