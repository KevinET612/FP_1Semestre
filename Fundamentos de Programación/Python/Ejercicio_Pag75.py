# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	snp = int()
	r_snp = int()
	snp = 0
	r_snp = 0
	while True:# no hay 'repetir' en python
		snp = snp+2
		r_snp = snp+r_snp
		print("Tomaste los siguientes numeros pares: ",snp)
		if snp==98: break
	print("La suma de los numeros pares es: ",r_snp)

