altura = int(input("Ingrese la altura del triángulo: "))

for i in range(altura):
    for j in range(altura - i - 1):
        print(" ", end="")
    for j in range(2 * i + 1):
        print("*", end="")
    print()
