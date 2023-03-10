# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	dia = int()
	mes = int()
	ano = int()
	print("Ingresar digito para DD/MM/AA ")
	dia = int(input())
	mes = int(input())
	ano = int(input())
	print("La fecha que has ingresado es: ",dia,"/",mes,"/",ano)
	if dia<1 or dia>31:
		print("El digito ingresado no corresponde a ningun dia del mes")
	if dia==1 or dia==8 or dia==15 or dia==22 or dia==29:
		print("El dia de la semana del mes es un Lunes")
	else:
		if dia==2 or dia==9 or dia==16 or dia==23 or dia==30:
			print("El dia de la semana del mes es un Martes")
		else:
			if dia==3 or dia==10 or dia==17 or dia==24 or dia==31:
				print("El dia de la semana del mes es un Miercoles")
			else:
				if dia==4 or dia==11 or dia==18 or dia==25:
					print("El dia de la semana del mes es un Jueves")
				else:
					if dia==5 or dia==12 or dia==19 or dia==26:
						print("El dia de la semana del mes es un Viernes")
					else:
						if dia==6 or dia==13 or dia==20 or dia==27:
							print("El dia de la semana del mes es un Sabado")
						else:
							if dia==7 or dia==14 or dia==21 or dia==28:
								print("El dia de la semana del mes es un Domingo")
	if mes>13 or mes<01:
		print("El digito ingresado no corresponde a ningun mes del año")
	else:
		if mes==01:
			print("Enero")
		else:
			if mes==02:
				print("Febrero")
				if mes==03:
					print("Marzo")
				else:
					if mes==04:
						print("Abril")
						if mes==05:
							print("Mayo")
						else:
							if mes==06:
								print("Junio")
								if mes==07:
									print("Julio")
								else:
									if mes==08:
										print("Agosto")
										if mes==09:
											print("Septiembre")
										else:
											if mes==10:
												print("Octubre")
												if mes==11:
													print("Noviembre")
												else:
													if mes==12:
														print("Diciembre")

