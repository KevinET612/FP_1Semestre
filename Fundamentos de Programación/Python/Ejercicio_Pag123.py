# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	n1 = int()
	n2 = int()
	n3 = int()
	print("Ingresa el primer digito: ")
	n1 = int(input())
	print("Ingrese el segundo digito: ")
	n2 = int(input())
	print("Ingrese el tercer digito: ")
	n3 = int(input())
	if n1>n2 and n1>n3:
		print("El digito ingresado mas alto es: ",n1)
	else:
		if n2>n1 and n2>n3:
			print("El digito ingresado mas alto es: ",n2)
		else:
			if n3>n1 and n3>n2:
				print("El digito ingresado mas alto es: ",n3)
			else:
				if n1==n2 and n1==n3 and n2==n1 and n2==n3 and n3==n1 and n3==n2:
					print("El digito ingresado es el mismo a los demas digitos ingresados")

