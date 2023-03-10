# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).

from math import sqrt

if __name__ == '__main__':
	a = float()
	b = float()
	c = float()
	print("Digite un valor para a: ")
	a = float(input())
	print("Digite un valor para b: ")
	b = float(input())
	print("Digite un valor para c: ")
	c = float(input())
	x = b**2-4*a*c
	if x>=0:
		x1 = (-b+sqrt(x))/(2*a)
		x2 = (-b-sqrt(x))/(2*a)
		print("Las soluciones de x1 es: ",x1)
		print("Las soluciones de x2 es: ",x2)
	else:
		pr = -b/(2*a)
		pim = sqrt(abs(x))/(2*a)
		print("La solucion de x1 es: ",pr,"+",pim,"i")
		print("La solucion de x2 es: ",pr,"-",pim,"i")

