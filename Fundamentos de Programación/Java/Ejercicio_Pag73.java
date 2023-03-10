/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "CALCULARSALARIO.java."

import java.io.*;

public class calcularsalario {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double iap;
		double nht;
		String nt;
		double sbt_h;
		double snt_h;
		double sph;
		System.out.println("Ingresar el nombre del trabajador: ");
		nt = bufEntrada.readLine();
		System.out.println("Ingresar el salario por hora: ");
		sph = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingresar el numero de horas trabajadas: ");
		nht = Double.parseDouble(bufEntrada.readLine());
		sbt_h = sph*nht;
		System.out.println("Ingresar el numero de impuestos: ");
		iap = Double.parseDouble(bufEntrada.readLine());
		snt_h = sbt_h-iap;
		System.out.println("El Salario Bruto de"+nt+"es: $"+sbt_h);
		System.out.println("El Salario Neto de"+nt+"es: $"+snt_h);
	}


}

