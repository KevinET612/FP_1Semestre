Algoritmo DigitoMasAlto
	Definir N1, N2, N3 como entero
	
	Escribir "Ingresa el primer digito: "
	Leer N1
	Escribir "Ingrese el segundo digito: "
	Leer N2
	Escribir "Ingrese el tercer digito: "
	Leer N3
	
	Si N1>N2 y N1>N3 Entonces
		Escribir "El digito ingresado mas alto es: ", N1
	SiNo Si N2>N1 y N2>N3
			Escribir "El digito ingresado mas alto es: ", N2
		Sino Si N3>N1 y N3>N2
				Escribir "El digito ingresado mas alto es: ", N3
			Sino Si N1=N2 y N1=N3 y N2=N1 y N2=N3 y N3=N1 y N3=N2 Entonces
					Escribir "El digito ingresado es el mismo a los demas digitos ingresados"
			FinSi
	FinSi
FinSi
Finsi
FinAlgoritmo