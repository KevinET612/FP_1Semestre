Algoritmo sin_titulo
	Definir a, b, c como reales
	Escribir "Digite un valor para a: "
	Leer a
	Escribir "Digite un valor para b: "
	Leer b
	Escribir "Digite un valor para c: "
	Leer c
	
	x<- b^2-4*a*c
	
	Si x>=0 Entonces
		x1<-(-b+raiz(x))/(2*a)
		x2<-(-b-raiz(x))/(2*a)
		Escribir "Las soluciones de x1 es: ", x1
		Escribir "Las soluciones de x2 es: ", x2
	SiNo
		Pr<--b/(2*a)
		Pim<-raiz(Abs(x))/(2*a)
		Escribir "La solucion de x1 es: ", Pr, "+", Pim, "i"
		Escribir "La solucion de x2 es: ", Pr, "-", Pim, "i"
	Fin Si
	
FinAlgoritmo
