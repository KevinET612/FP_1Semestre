n = int(input("Ingrese la cantidad de números a calcular el factorial: "))

for i in range(n):
    numero = int(input("Ingrese un número entero: "))
    factorial = 1

    if numero < 0:
        print("El factorial no está definido para números negativos.")
    elif numero == 0:
        print("El factorial de 0 es 1.")
    else:
        for j in range(1, numero + 1):
            factorial *= j
        print("El factorial de", numero, "es", factorial)
