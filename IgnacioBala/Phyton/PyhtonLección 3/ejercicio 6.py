def calcular_suma_pares(lista):
    suma = 0
    contador_pares = 0
    suma_impares = 0
    contador_impares = 0

    for num in lista:
        if num % 2 == 0:
            suma += num
            contador_pares += 1
        else:
            suma_impares += num
            contador_impares += 1

    promedio_impares = suma_impares / contador_impares if contador_impares > 0 else 0

    return suma, contador_pares, promedio_impares

# Ingresar la cantidad de números a evaluar
n = int(input("Ingrese la cantidad de números a evaluar: "))

numeros = []
for i in range(n):
    numero = int(input("Ingrese un número: "))
    numeros.append(numero)

suma_pares, cantidad_pares, promedio_impares = calcular_suma_pares(numeros)

print("Suma de los números pares:", suma_pares)
print("Cantidad de números pares:", cantidad_pares)
print("Promedio de los números impares:", promedio_impares)