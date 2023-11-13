
import math # Impportaos clase math
tupla = (13,1,8,3,2,5,8)
lista= []
for elemento  in tupla:
    if elemento < 5:
        lista.append(elemento)
print(lista)


numero = int(input('Digite núnero positivo'))
while numero < 0:
    print('Error -> debería ser un númerop positivo : ')
    numero = int(input('Digite un número positivo :'))
    print(f'\nSu raís cuadrada es : {math.sqrt(numero):.2f}')
