/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "RESOLVERAX2TBXTC.java."

import java.io.*;
import java.math.*;

public class resolverax2tbxtc {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double n1;
		double n2;
		double n3;
		double x;
		double x1;
		double x2;
		System.out.println("Ingresar valor para n1:");
		n1 = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingresar valor para n2:");
		n2 = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingresar valor para n3:");
		n3 = Double.parseDouble(bufEntrada.readLine());
		x = Math.pow(n2,2)-4*n1*n3;
		if (x>0) {
			x1 = (-n2+Math.sqrt(x))/(2*n1);
			x2 = (-n2-Math.sqrt(x))/(2*n1);
			System.out.println("Las soluciones son: X1="+x1+" y X2="+x2);
		} else {
			if (x==0) {
				x1 = (-n2)/(2*n1);
				System.out.println("La solución doble es: X1="+x1);
			} else {
				System.out.println("La ecuación no tiene soluciones reales.");
			}
		}
	}


}

