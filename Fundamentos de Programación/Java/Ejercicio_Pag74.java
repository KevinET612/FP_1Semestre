/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "CALCULARLAMEDIADENUMEROSPOSITIVOS.java."

import java.io.*;

public class calcularlamediadenumerospositivos {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double m;
		double np;
		double snp;
		double v;
		np = 0;
		snp = 0;
		do {
			System.out.println("Ingrese un numero positivo: ");
			v = Double.parseDouble(bufEntrada.readLine());
			if (v<=0) {
				System.out.println("Introdujo un numero no positivo");
				if (snp>0) {
					m = np/snp;
					System.out.println("La media es: "+m);
				} else {
					System.out.println("Introdujo un numero no positivo");
				}
			}
			np = np+v;
			snp = snp+1;
		} while (!(false));
	}


}

