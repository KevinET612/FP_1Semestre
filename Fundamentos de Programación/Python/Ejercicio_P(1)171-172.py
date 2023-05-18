while True:
    mes = int(input("Ingrese un número de mes (1-12): "))
    if mes >= 1 and mes <= 12:
        break
    else:
        print("Entrada inválida. Por favor, ingrese un número de mes válido.")

print("Mes válido ingresado:", mes)
