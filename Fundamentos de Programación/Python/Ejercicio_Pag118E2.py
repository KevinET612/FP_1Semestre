# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	sumane = int()
	r_sumane = int()
	print("Ingrese un numero Entero: ")
	sumane = int(input())
	while True:# no hay 'repetir' en python
		sumane = sumane+1
		r_sumane = r_sumane+sumane
		print("Los datos obtenidos a sumar son: ",sumane)
		if sumane==50: break
	print("La suma total de los numeros enteros son: ",r_sumane)

