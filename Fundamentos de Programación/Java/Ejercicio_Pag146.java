/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "VALORMASALTO.java."

import java.io.*;

public class valormasalto {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double b;
		double c;
		System.out.println("Digite un valor para A: ");
		a = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Digite un valor para B: ");
		b = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Digite un valor para C: ");
		c = Double.parseDouble(bufEntrada.readLine());
		if (a>b && a>c) {
			System.out.println("El valor digitado mas alto es: "+a);
		} else {
			if (b>a && b>c) {
				System.out.println("El valor digitado mas alto es: "+b);
			} else {
				if (c>a && c>b) {
					System.out.println("El valor digitado mas alto es: "+c);
				}
			}
		}
		if (a==b && a==c && b==a && b==c && c==a && c==b) {
			System.out.println("Los valores digitados son los mismos, por lo tanto no hay mayor");
		}
	}


}

