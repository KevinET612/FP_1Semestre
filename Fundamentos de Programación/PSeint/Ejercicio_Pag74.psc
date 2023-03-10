Algoritmo CalcularLaMediaDeNumerosPositivos
	Definir NP, SNP, V Como real
	
	NP<-0
	SNP<-0
	
	Repetir
		Escribir "Ingrese un numero positivo: "
		Leer V
		Si V<=0 Entonces
			Escribir "Introdujo un numero no positivo"
			Si SNP>0 Entonces
				M<-NP/SNP
				Escribir "La media es: ", M
			SiNo
				Escribir "Introdujo un numero no positivo"
		FinSi
		FinSi
		NP<- NP+V
		SNP<- SNP+1
	Hasta Que Falso
	
FinAlgoritmo
