# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	np = float()
	snp = float()
	v = float()
	np = 0
	snp = 0
	while True:# no hay 'repetir' en python
		print("Ingrese un numero positivo: ")
		v = float(input())
		if v<=0:
			print("Introdujo un numero no positivo")
			if snp>0:
				m = np/snp
				print("La media es: ",m)
			else:
				print("Introdujo un numero no positivo")
		np = np+v
		snp = snp+1
		if False: break

