cantidad_numeros = int(input("Ingrese la cantidad de números a sumar: "))
suma = 0

for _ in range(cantidad_numeros):
    numero = float(input("Ingrese un número: "))
    suma += numero

print("La suma de los números ingresados es:", suma)
