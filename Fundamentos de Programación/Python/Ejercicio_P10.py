numero = int(input("Ingrese un número entero: "))

es_primo = True

if numero <= 1:
    es_primo = False
else:
    for i in range(2, numero):
        if numero % i == 0:
            es_primo = False
            break

if es_primo:
    print(numero, "es un número primo.")
else:
    print(numero, "no es un número primo.")
