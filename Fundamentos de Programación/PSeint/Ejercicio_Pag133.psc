Algoritmo EcuacionDePrimerGrado
	Definir a, b, c Como Real
	
	Escribir "Ingresar un digito para a"
	Leer a
	
	Escribir "Ingresar un digito para b"
	Leer b
	
	Escribir "Ingresar un digito para c"
	Leer c
	
	Si a<>0 Entonces
		x<- (c-b)/a
		
		Escribir "El resultado de x es: ", x
		
	SiNo
		Escribir "La ecuacion de primer grado no tiene solucion"
	Fin Si
	
FinAlgoritmo
