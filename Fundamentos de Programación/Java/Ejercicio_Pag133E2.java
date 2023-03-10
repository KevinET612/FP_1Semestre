/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SALARIONETO.java."

import java.io.*;

public class salarioneto {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double ht;
		double im;
		String nt;
		double ph;
		double sn;
		double tf;
		System.out.println("Ingresar el nombre del trabajador: ");
		nt = bufEntrada.readLine();
		System.out.println("Ingresar el numero de horas trabajadas: ");
		ht = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingresar pago por hora: ");
		ph = Double.parseDouble(bufEntrada.readLine());
		if (ht<=35) {
			tf = ht*ph;
		} else {
			tf = 35*ph+(ht-35)*ph*1.5;
		}
		if (tf<=2.000) {
			im = 0;
		} else {
			im = 0.1*(tf-2000);
		}
		sn = tf-im;
		System.out.println("Los impuestos son de: "+im+" euros");
		System.out.println("El salario neto de "+nt+" es de: "+sn+" euros");
	}


}

