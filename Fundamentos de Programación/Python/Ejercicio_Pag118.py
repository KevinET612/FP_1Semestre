# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	dcion = float()
	costo = float()
	print("Introducir duracion de la llamada: ")
	dcion = float(input())
	if dcion<3:
		costo = 10
	else:
		costo = 10+(dcion-3)*5
	print("La cantidad total de la llamada es: $",costo)

