contador = 0

while True:
    numero = int(input("Ingrese un número entero positivo (ingrese 0 o un número negativo para terminar): "))
    
    if numero <= 0:
        break
    
    contador += 1

print("Se ingresaron", contador, "números enteros positivos.")
