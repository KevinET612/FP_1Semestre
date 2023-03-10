# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).

from math import sqrt

if __name__ == '__main__':
	n1 = float()
	n2 = float()
	n3 = float()
	x = float()
	print("Ingresar valor para n1:")
	n1 = float(input())
	print("Ingresar valor para n2:")
	n2 = float(input())
	print("Ingresar valor para n3:")
	n3 = float(input())
	x = n2**2-4*n1*n3
	if x>0:
		x1 = (-n2+sqrt(x))/(2*n1)
		x2 = (-n2-sqrt(x))/(2*n1)
		print("Las soluciones son: X1=",x1," y X2=",x2)
	else:
		if x==0:
			x1 = (-n2)/(2*n1)
			print("La solución doble es: X1=",x1)
		else:
			print("La ecuación no tiene soluciones reales.")

