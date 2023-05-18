numero = int(input("Ingrese un número entero positivo: "))

cuenta_atras = [str(i) for i in range(numero, -1, -1)]
resultado = ", ".join(cuenta_atras)

print("Cuenta atrás:", resultado)
