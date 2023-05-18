provincias = ["Almería", "Cádiz", "Córdoba", "Granada", "Huelva", "Jaén", "Málaga", "Sevilla"]
ciudades = [
    [100000, 150000, 120000, 90000, 110000],    # Población de ciudades en Almería
    [200000, 180000, 250000, 220000, 190000],    # Población de ciudades en Cádiz
    [300000, 280000, 320000, 270000, 290000],    # Población de ciudades en Córdoba
    [400000, 380000, 420000, 360000, 390000],    # Población de ciudades en Granada
    [500000, 520000, 480000, 540000, 510000],    # Población de ciudades en Huelva
    [600000, 640000, 610000, 630000, 620000],    # Población de ciudades en Jaén
    [700000, 730000, 710000, 680000, 720000],    # Población de ciudades en Málaga
    [800000, 840000, 820000, 850000, 830000]     # Población de ciudades en Sevilla
]

for i in range(len(provincias)):
    provincia = provincias[i]
    poblacion_ciudades = ciudades[i]
    
    mayor_poblacion = max(poblacion_ciudades)
    
    indice_ciudad_mayor = poblacion_ciudades.index(mayor_poblacion)
    
    ciudad_mayor = "Ciudad " + str(indice_ciudad_mayor + 1)
    
    print("La ciudad más grande de", provincia, "es", ciudad_mayor, "con una población de", mayor_poblacion)
