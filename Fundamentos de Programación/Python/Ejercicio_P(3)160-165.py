contador = 0

numero = int(input("Ingrese un número entero positivo (ingrese 0 o un número negativo para terminar): "))

while numero > 0:
    contador += 1
    numero = int(input("Ingrese un número entero positivo (ingrese 0 o un número negativo para terminar): "))

print("Se ingresaron", contador, "números enteros positivos.")
