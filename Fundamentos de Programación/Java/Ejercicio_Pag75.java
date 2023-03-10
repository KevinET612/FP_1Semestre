/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SUMADENUMEROSPOSITIVOS.java."

import java.io.*;

public class sumadenumerospositivos {

	public static void main(String args[]) {
		int r_snp;
		int snp;
		snp = 0;
		r_snp = 0;
		do {
			snp = snp+2;
			r_snp = snp+r_snp;
			System.out.println("Tomaste los siguientes numeros pares: "+snp);
		} while (snp!=98);
		System.out.println("La suma de los numeros pares es: "+r_snp);
	}


}

