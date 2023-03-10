Algoritmo ProductoDeN
	Definir NumP, Producto Como real
    Escribir "Ingrese el valor de n:"
    Leer NumP
	
	Si NumP<=0 Entonces
		Escribir "El digito ingresado no corresponde a un valor entero positivo"
		Leer NumP
	Fin Si
	
    Producto <- 1
	
    Para v <- 1 Hasta NumP Con Paso 1 Hacer
        Producto <- Producto * v
    FinPara
	
    Escribir "El producto de los ", NumP, " primeros números naturales es: ", Producto
	
FinAlgoritmo
