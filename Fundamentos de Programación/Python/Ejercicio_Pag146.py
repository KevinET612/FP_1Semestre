# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	a = float()
	b = float()
	c = float()
	print("Digite un valor para A: ")
	a = float(input())
	print("Digite un valor para B: ")
	b = float(input())
	print("Digite un valor para C: ")
	c = float(input())
	if a>b and a>c:
		print("El valor digitado mas alto es: ",a)
	else:
		if b>a and b>c:
			print("El valor digitado mas alto es: ",b)
		else:
			if c>a and c>b:
				print("El valor digitado mas alto es: ",c)
	if a==b and a==c and b==a and b==c and c==a and c==b:
		print("Los valores digitados son los mismos, por lo tanto no hay mayor")

