filas = int(input("¿Cuántas filas? "))
columnas = int(input("¿Cuántas columnas? "))
elCar = input("¿Qué carácter? ")

for i in range(filas):
    for j in range(columnas):
        print(elCar, end="")
    print()

