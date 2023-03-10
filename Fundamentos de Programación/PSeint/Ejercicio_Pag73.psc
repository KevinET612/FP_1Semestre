Algoritmo CalcularSalario
	Definir NT Como Caracter
	Definir SBT_H, SNT_H, SPH, NHT, IAP como real
	
	Escribir "Ingresar el nombre del trabajador: "
	Leer NT
	Escribir "Ingresar el salario por hora: "
	Leer SPH
	Escribir "Ingresar el numero de horas trabajadas: "
	Leer NHT
	
	SBT_H<-SPH*NHT
	
	Escribir "Ingresar el numero de impuestos: "
	Leer IAP
	
	SNT_H<-SBT_H-IAP
	
	Escribir "El Salario Bruto de" ,NT, "es: $",SBT_H
	Escribir "El Salario Neto de" ,NT, "es: $",SNT_H
	
FinAlgoritmo
