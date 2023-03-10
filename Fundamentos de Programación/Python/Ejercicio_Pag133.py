# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	a = float()
	b = float()
	c = float()
	print("Ingresar un digito para a")
	a = float(input())
	print("Ingresar un digito para b")
	b = float(input())
	print("Ingresar un digito para c")
	c = float(input())
	if a!=0:
		x = (c-b)/a
		print("El resultado de x es: ",x)
	else:
		print("La ecuacion de primer grado no tiene solucion")

