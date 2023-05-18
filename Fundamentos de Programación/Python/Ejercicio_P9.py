contraseña = "contraseña"

while True:
    entrada = input("Ingrese la contraseña: ")

    if entrada == contraseña:
        print("Contraseña correcta. Acceso concedido.")
        break
    else:
        print("Contraseña incorrecta. Intente nuevamente.")
