Algoritmo sin_titulo
	Definir dia, mes, año Como Entero
	Escribir "Ingresar digito para DD/MM/AA "
	Leer dia,mes,año
	
	Escribir "La fecha que has ingresado es: ", dia "/", mes "/", año
	
	Si dia<1 o dia>31 Entonces
		Escribir "El digito ingresado no corresponde a ningun dia del mes"
	FinSi
	Si dia=1 o dia=8 o dia=15 o dia=22 o dia=29 Entonces
		Escribir "El dia de la semana del mes es un Lunes"
	SiNo Si dia=2 o dia=9 o dia=16 o dia=23 o dia=30 Entonces
			Escribir "El dia de la semana del mes es un Martes"
		Sino Si dia=3 o dia=10 o dia=17 o dia=24 o dia=31 Entonces
				Escribir "El dia de la semana del mes es un Miercoles"
			Sino Si dia=4 o dia=11 o dia=18 o dia=25 Entonces
					Escribir "El dia de la semana del mes es un Jueves"
				Sino Si dia=5 o dia=12 o dia=19 o dia=26 Entonces
						Escribir "El dia de la semana del mes es un Viernes"
					Sino Si dia=6 o dia=13 o dia=20 o dia=27 Entonces
							Escribir "El dia de la semana del mes es un Sabado"
						Sino Si dia=7 o dia=14 o dia=21 o dia=28 Entonces
								Escribir "El dia de la semana del mes es un Domingo"
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
	Si mes>13 o mes<01 Entonces
		Escribir "El digito ingresado no corresponde a ningun mes del año"
	Sino Si mes=01 Entonces
			Escribir "Enero"
		SiNo Si mes=02 Entonces
				Escribir "Febrero"
				Si mes=03 Entonces
					Escribir "Marzo"
				SiNo Si mes=04 Entonces
						Escribir "Abril"
						Si mes=05 Entonces
							Escribir "Mayo"
						SiNo Si mes=06 Entonces
								Escribir "Junio"
								Si mes=07 Entonces
									Escribir "Julio"
								SiNo Si mes=08 Entonces
										Escribir "Agosto"
										Si mes=09 Entonces
											Escribir "Septiembre"
										SiNo Si mes=10 Entonces
												Escribir "Octubre"
												Si mes=11 Entonces
													Escribir "Noviembre"
												SiNo Si mes=12 Entonces
														Escribir "Diciembre"
													FinSi
												FinSi
											FinSi
										FinSi
									FinSi
								FinSi
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
