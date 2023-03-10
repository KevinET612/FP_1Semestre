/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "DIGITOMASALTO.java."

import java.io.*;

public class digitomasalto {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int n1;
		int n2;
		int n3;
		System.out.println("Ingresa el primer digito: ");
		n1 = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese el segundo digito: ");
		n2 = Integer.parseInt(bufEntrada.readLine());
		System.out.println("Ingrese el tercer digito: ");
		n3 = Integer.parseInt(bufEntrada.readLine());
		if (n1>n2 && n1>n3) {
			System.out.println("El digito ingresado mas alto es: "+n1);
		} else {
			if (n2>n1 && n2>n3) {
				System.out.println("El digito ingresado mas alto es: "+n2);
			} else {
				if (n3>n1 && n3>n2) {
					System.out.println("El digito ingresado mas alto es: "+n3);
				} else {
					if (n1==n2 && n1==n3 && n2==n1 && n2==n3 && n3==n1 && n3==n2) {
						System.out.println("El digito ingresado es el mismo a los demas digitos ingresados");
					}
				}
			}
		}
	}


}

