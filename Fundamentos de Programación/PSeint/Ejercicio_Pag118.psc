Algoritmo sin_titulo
	Definir Dcion, Costo Como Real
	
	Escribir "Introducir duracion de la llamada: "
	Leer Dcion
	
	Si Dcion<3 Entonces
		Costo<-10
	SiNo
		Costo<-10+(Dcion-3)*5
	Fin Si
	
	Escribir "La cantidad total de la llamada es: $", Costo
FinAlgoritmo
