Algoritmo SalarioNeto
	Definir Sn, Ph, Ht, Im, Tf como real
	Definir Nt Como Caracter
	
	Escribir "Ingresar el nombre del trabajador: "
	Leer Nt
	
	Escribir "Ingresar el numero de horas trabajadas: "
	Leer Ht
	
	Escribir "Ingresar pago por hora: "
	Leer Ph
	
	Si Ht<=35 Entonces
		Tf<-Ht*Ph
	SiNo
		Tf<-35*Ph+(Ht-35)*Ph*1.5
	Fin Si
	
	Si Tf<=2.000 Entonces
		Im<-0
	SiNo
		Im<-0.1*(Tf-2000)
	Fin Si
	
	Sn<-Tf-Im
	
	Escribir "Los impuestos son de: ", Im, " euros"
	Escribir "El salario neto de ", Nt, " es de: ", Sn, " euros"
	
FinAlgoritmo
