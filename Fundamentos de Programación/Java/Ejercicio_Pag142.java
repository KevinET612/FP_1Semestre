/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "SIN_TITULO.java."

import java.io.*;

public class sin_titulo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int ano;
		int año;
		int dia;
		int mes;
		System.out.println("Ingresar digito para DD/MM/AA ");
		dia = Integer.parseInt(bufEntrada.readLine());
		mes = Integer.parseInt(bufEntrada.readLine());
		ano = Integer.parseInt(bufEntrada.readLine());
		System.out.println("La fecha que has ingresado es: "+dia+"/"+mes+"/"+ano);
		if (dia<1 || dia>31) {
			System.out.println("El digito ingresado no corresponde a ningun dia del mes");
		}
		if (dia==1 || dia==8 || dia==15 || dia==22 || dia==29) {
			System.out.println("El dia de la semana del mes es un Lunes");
		} else {
			if (dia==2 || dia==9 || dia==16 || dia==23 || dia==30) {
				System.out.println("El dia de la semana del mes es un Martes");
			} else {
				if (dia==3 || dia==10 || dia==17 || dia==24 || dia==31) {
					System.out.println("El dia de la semana del mes es un Miercoles");
				} else {
					if (dia==4 || dia==11 || dia==18 || dia==25) {
						System.out.println("El dia de la semana del mes es un Jueves");
					} else {
						if (dia==5 || dia==12 || dia==19 || dia==26) {
							System.out.println("El dia de la semana del mes es un Viernes");
						} else {
							if (dia==6 || dia==13 || dia==20 || dia==27) {
								System.out.println("El dia de la semana del mes es un Sabado");
							} else {
								if (dia==7 || dia==14 || dia==21 || dia==28) {
									System.out.println("El dia de la semana del mes es un Domingo");
								}
							}
						}
					}
				}
			}
		}
		if (mes>13 || mes<01) {
			System.out.println("El digito ingresado no corresponde a ningun mes del año");
		} else {
			if (mes==01) {
				System.out.println("Enero");
			} else {
				if (mes==02) {
					System.out.println("Febrero");
					if (mes==03) {
						System.out.println("Marzo");
					} else {
						if (mes==04) {
							System.out.println("Abril");
							if (mes==05) {
								System.out.println("Mayo");
							} else {
								if (mes==06) {
									System.out.println("Junio");
									if (mes==07) {
										System.out.println("Julio");
									} else {
										if (mes==08) {
											System.out.println("Agosto");
											if (mes==09) {
												System.out.println("Septiembre");
											} else {
												if (mes==10) {
													System.out.println("Octubre");
													if (mes==11) {
														System.out.println("Noviembre");
													} else {
														if (mes==12) {
															System.out.println("Diciembre");
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}


}

