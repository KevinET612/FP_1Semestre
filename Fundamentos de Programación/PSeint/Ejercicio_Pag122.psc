Algoritmo ResolverAx2tBxtC
	Definir n1, n2, n3, X como real
	Escribir "Ingresar valor para n1:"
	Leer n1
	Escribir "Ingresar valor para n2:"
	Leer n2
	Escribir "Ingresar valor para n3:"
	Leer n3

	X<- n2^2 - 4*n1*n3

    Si X > 0 Entonces
		X1 <- (-n2 + Raiz(X))/(2*n1)
		X2 <- (-n2 - Raiz(X))/(2*n1)
	    Escribir "Las soluciones son: X1=", X1, " y X2=", X2
    Sino
	    Si X = 0 Entonces
		X1 <- (-n2)/(2*n1)
		Escribir "La solución doble es: X1=", X1
	Sino
		Escribir "La ecuación no tiene soluciones reales."
	FinSi
FinSi
	
FinAlgoritmo
