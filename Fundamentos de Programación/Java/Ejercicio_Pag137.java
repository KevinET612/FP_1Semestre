/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "CALCULARAREA.java."

import java.io.*;
import java.math.*;

public class calculararea {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double altura;
		double area;
		double base;
		double l1;
		double l2;
		double l3;
		double sem;
		System.out.println("Ingresar un digito para la Altura: ");
		altura = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingresar un digito para la Base: ");
		base = Double.parseDouble(bufEntrada.readLine());
		area = altura*base/2;
		System.out.println("El area calculada con los digitos ingresados de Base por Altura es: "+area+"Cm^2");
		System.out.println("Ingresar digito para el lado L1: ");
		l1 = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingresar digito para el lado L2: ");
		l2 = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Ingresar digito para el lado L3: ");
		l3 = Double.parseDouble(bufEntrada.readLine());
		if (l1+l2<=l3 || l2+l3<=l1 || l1+l3<=l2) {
			System.out.println("Ninguno de los lados conforma un triangulo");
		} else {
			sem = (l1+l2+l3)/2;
			area = Math.sqrt(sem*(sem-l1)*(sem-l2)*(sem-l3));
			System.out.println("El area del calculada conociendo sus lados es: "+area+"M^2");
		}
	}


}

