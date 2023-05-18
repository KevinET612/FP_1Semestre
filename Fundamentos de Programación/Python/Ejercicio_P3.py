numero = int(input("Ingrese un número entero positivo: "))

impares = [str(i) for i in range(1, numero + 1) if i % 2 != 0]
resultado = ", ".join(impares)

print("Números impares:", resultado)
