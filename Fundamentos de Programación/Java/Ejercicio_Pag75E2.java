/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SALARIOSMENSUALES.java."

import java.io.*;

public class salariosmensuales {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double he;
		double ho;
		double hp;
		double hs;
		String nt;
		double sm;
		System.out.println("Ingresar el nombre del trabajador: ");
		nt = bufEntrada.readLine();
		System.out.println("Ingresar horas trabajadas: ");
		hs = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingresar el precio por hora");
		hp = Double.parseDouble(bufEntrada.readLine());
		if (hs>=40) {
			ho = 40;
			he = hs-40;
		} else {
			ho = hs;
			he = 0;
		}
		sm = (hp*ho)+(hp*he*1.5);
		System.out.println("El salario mensual es: $"+sm);
	}


}

