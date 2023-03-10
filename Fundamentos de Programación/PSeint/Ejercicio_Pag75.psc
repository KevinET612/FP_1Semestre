Algoritmo SumadeNumerosPositivos
	Definir SNP, R_SNP Como Entero
	SNP<-0
	R_SNP<- 0
	Repetir
		SNP<-SNP+2 
		R_SNP= SNP+R_SNP
		Escribir "Tomaste los siguientes numeros pares: ",SNP
	Hasta Que SNP=98
	Escribir "La suma de los numeros pares es: ",R_SNP
FinAlgoritmo
