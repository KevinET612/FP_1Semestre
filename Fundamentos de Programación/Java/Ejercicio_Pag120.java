/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "PRODUCTODEN.java."

import java.io.*;

public class productoden {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double nump;
		double producto;
		double v;
		System.out.println("Ingrese el valor de n:");
		nump = Double.parseDouble(bufEntrada.readLine());
		if (nump<=0) {
			System.out.println("El digito ingresado no corresponde a un valor entero positivo");
			nump = Double.parseDouble(bufEntrada.readLine());
		}
		producto = 1;
		for (v=1;v<=nump;v++) {
			producto = producto*v;
		}
		System.out.println("El producto de los "+nump+" primeros números naturales es: "+producto);
	}


}

