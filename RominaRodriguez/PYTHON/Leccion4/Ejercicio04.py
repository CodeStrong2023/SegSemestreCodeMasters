# Ejercicio 4: Sumar pares dentro de un rango
#Hacer un programa para sumar números pares dentro de
#un rango, por ejemplo:
#                       suma de números pares de 2 al 30
#                       suma=240
a = int(input("Digite de donde va a comenzar la suma: "))
b = int(input("Diigite hasta donde quiere llegar a sumar: "))
suma = 0
for i in range(a,b+1):
    if i % 2 ==0:#Esto es si el número es par
        suma += i
print(f"\nLa suma de los números pares dentro del rango es: {suma}")