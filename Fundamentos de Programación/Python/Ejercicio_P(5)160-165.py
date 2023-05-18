suma_notas = 0
contador_notas = 0

nota = float(input("Ingrese una nota (o -99 para finalizar): "))

while nota != -99:
    suma_notas += nota
    contador_notas += 1
    nota = float(input("Ingrese una nota (o -99 para finalizar): "))

if contador_notas == 0:
    print("No se ingresaron notas.")
else:
    media = suma_notas / contador_notas
    print("La media de las notas ingresadas es:", media)
