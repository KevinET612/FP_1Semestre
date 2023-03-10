Algoritmo CalcularArea
	Definir Altura, Base como real
	Escribir "Ingresar un digito para la Altura: "
	Leer Altura
	
	Escribir "Ingresar un digito para la Base: "
	Leer Base
	
	Area<-Altura*Base/2
	
	Escribir "El area calculada con los digitos ingresados de Base por Altura es: ", Area "Cm^2"
	
	Definir L1, L2, L3 como real
	
	Escribir "Ingresar digito para el lado L1: "
	Leer L1
	
	Escribir "Ingresar digito para el lado L2: "
	Leer L2
	
	Escribir "Ingresar digito para el lado L3: "
	Leer L3
	
	Si L1 + L2 <= L3 o L2 + L3 <= L1 o L1 + L3 <= L2 Entonces
		Escribir "Ninguno de los lados conforma un triangulo"
	SiNo
		Sem<-(L1+L2+L3)/2
		Area<-raiz(Sem*(Sem-L1)*(Sem-L2)*(Sem-L3))
		
		Escribir "El area del calculada conociendo sus lados es: ", Area, "M^2"
	Fin Si
	
FinAlgoritmo
