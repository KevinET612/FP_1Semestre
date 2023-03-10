Algoritmo SalariosMensuales
	Definir NT Como Caracter
	Definir HS, HP, HE, HO, SM como real
	Escribir "Ingresar el nombre del trabajador: "
	Leer NT
	
	Escribir "Ingresar horas trabajadas: " 
	Leer HS
	
	Escribir "Ingresar el precio por hora"
	Leer HP
	
	Si HS>=40 Entonces
		HO<-40
		HE<-HS - 40
	SiNo
		HO<-HS
		HE<-0
	Fin Si
	
	SM <- (HP * HO) + (HP * HE * 1.5)
	
	Escribir "El salario mensual es: $", SM
FinAlgoritmo
