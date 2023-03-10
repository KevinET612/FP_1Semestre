/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SIN_TITULO.java."

import java.io.*;
import java.math.*;

public class sin_titulo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double b;
		double c;
		double pim;
		double pr;
		double x;
		double x1;
		double x2;
		System.out.println("Digite un valor para a: ");
		a = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Digite un valor para b: ");
		b = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Digite un valor para c: ");
		c = Double.parseDouble(bufEntrada.readLine());
		x = Math.pow(b,2)-4*a*c;
		if (x>=0) {
			x1 = (-b+Math.sqrt(x))/(2*a);
			x2 = (-b-Math.sqrt(x))/(2*a);
			System.out.println("Las soluciones de x1 es: "+x1);
			System.out.println("Las soluciones de x2 es: "+x2);
		} else {
			pr = -b/(2*a);
			pim = Math.sqrt(Math.abs(x))/(2*a);
			System.out.println("La solucion de x1 es: "+pr+"+"+pim+"i");
			System.out.println("La solucion de x2 es: "+pr+"-"+pim+"i");
		}
	}


}

