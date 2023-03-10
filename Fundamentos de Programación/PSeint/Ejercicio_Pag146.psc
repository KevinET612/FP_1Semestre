Algoritmo ValorMasAlto
	Definir A, B, C Como Real
	
	Escribir "Digite un valor para A: "
	Leer A
	Escribir "Digite un valor para B: "
	Leer B
	Escribir "Digite un valor para C: "
	Leer C
	
	Si A>B y A>C Entonces
		Escribir "El valor digitado mas alto es: ", A
	SiNo Si B>A y B>C Entonces
			Escribir "El valor digitado mas alto es: ", B
		Sino Si C>A y C>B Entonces
				Escribir "El valor digitado mas alto es: ", C
			FinSi
		FinSi
	Fin Si
	
	Si A=B y A=C y B=A Y B=C Y C=A y C=B Entonces
		Escribir "Los valores digitados son los mismos, por lo tanto no hay mayor"
	Fin Si
	
FinAlgoritmo
