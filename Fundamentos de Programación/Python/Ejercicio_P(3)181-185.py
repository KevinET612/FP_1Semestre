def es_primo(numero):
    if numero < 2:
        return False
    for i in range(2, int(numero**0.5) + 1):
        if numero % i == 0:
            return False
    return True

print("Números primos entre 2 y 100:")
for num in range(2, 101):
    if es_primo(num):
        print(num)
