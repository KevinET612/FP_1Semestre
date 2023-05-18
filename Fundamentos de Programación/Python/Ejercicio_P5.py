cantidad = float(input("Ingrese la cantidad a invertir: "))
interes_anual = float(input("Ingrese el interés anual (%): "))
num_anios = int(input("Ingrese el número de años de la inversión: "))

interes_decimal = interes_anual / 100

for i in range(1, num_anios + 1):
    capital = cantidad * (1 + interes_decimal)**i
    print("Año", i, ": Capital obtenido =", round(capital, 2))
