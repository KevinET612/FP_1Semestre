# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	nt = str()
	hs = float()
	hp = float()
	he = float()
	ho = float()
	sm = float()
	print("Ingresar el nombre del trabajador: ")
	nt = input()
	print("Ingresar horas trabajadas: ")
	hs = float(input())
	print("Ingresar el precio por hora")
	hp = float(input())
	if hs>=40:
		ho = 40
		he = hs-40
	else:
		ho = hs
		he = 0
	sm = (hp*ho)+(hp*he*1.5)
	print("El salario mensual es: $",sm)

