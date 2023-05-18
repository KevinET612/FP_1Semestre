Xultimo = 10
Yultimo = 10

print("Tabla de multiplicación:")
for x in range(1, Xultimo + 1):
    for y in range(1, Yultimo + 1):
        producto = x * y
        print(x, "*", y, "=", producto)
    print()
