# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	nt = str()
	sbt_h = float()
	snt_h = float()
	sph = float()
	nht = float()
	iap = float()
	print("Ingresar el nombre del trabajador: ")
	nt = input()
	print("Ingresar el salario por hora: ")
	sph = float(input())
	print("Ingresar el numero de horas trabajadas: ")
	nht = float(input())
	sbt_h = sph*nht
	print("Ingresar el numero de impuestos: ")
	iap = float(input())
	snt_h = sbt_h-iap
	print("El Salario Bruto de",nt,"es: $",sbt_h)
	print("El Salario Neto de",nt,"es: $",snt_h)

