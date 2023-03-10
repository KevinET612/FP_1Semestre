# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	sn = float()
	ph = float()
	ht = float()
	im = float()
	tf = float()
	nt = str()
	print("Ingresar el nombre del trabajador: ")
	nt = input()
	print("Ingresar el numero de horas trabajadas: ")
	ht = float(input())
	print("Ingresar pago por hora: ")
	ph = float(input())
	if ht<=35:
		tf = ht*ph
	else:
		tf = 35*ph+(ht-35)*ph*1.5
	if tf<=2.000:
		im = 0
	else:
		im = 0.1*(tf-2000)
	sn = tf-im
	print("Los impuestos son de: ",im," euros")
	print("El salario neto de ",nt," es de: ",sn," euros")

