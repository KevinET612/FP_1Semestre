# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).

from math import sqrt

if __name__ == '__main__':
	altura = float()
	base = float()
	print("Ingresar un digito para la Altura: ")
	altura = float(input())
	print("Ingresar un digito para la Base: ")
	base = float(input())
	area = altura*base/2
	print("El area calculada con los digitos ingresados de Base por Altura es: ",area,"Cm^2")
	l1 = float()
	l2 = float()
	l3 = float()
	print("Ingresar digito para el lado L1: ")
	l1 = float(input())
	print("Ingresar digito para el lado L2: ")
	l2 = float(input())
	print("Ingresar digito para el lado L3: ")
	l3 = float(input())
	if l1+l2<=l3 or l2+l3<=l1 or l1+l3<=l2:
		print("Ninguno de los lados conforma un triangulo")
	else:
		sem = (l1+l2+l3)/2
		area = sqrt(sem*(sem-l1)*(sem-l2)*(sem-l3))
		print("El area del calculada conociendo sus lados es: ",area,"M^2")

