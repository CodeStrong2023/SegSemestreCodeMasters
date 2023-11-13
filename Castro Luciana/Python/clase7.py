'''

Ejercicio 2:
Crear una función para multiplicar los valores recibidos de tipo númerico, utilizando argumentos variables *args como parámetro de la función y regresar como resultado
la multiplicación de todos los valores pasados como argumento

'''
print(' ')
print('Función con *args para multiplicar.')
print('EJERCICIO N°2')

#Definimos la función

def multiplicar_valor(*numeros): # El mas utilizado *args
    resultado = 1
    for numero in numeros:
        resultado *= numero
    return resultado

#Llamamos a la función
print(multiplicar_valor(3, 5, 15, 3))

'''

Ejercicio 3: 
Imprimir números de 5 a 1 de manera descendente usando funciones recursivas. Puede ser cualquier valor positivo, por ejemplo, si pasamos el valor de 5, debe imprimir:
5,4,3,2,1
En caso de ser el número 3 debe imprimir:
3,2,1
Si se ingresa números negativos no imprime nada.

'''

print(' ')
print('Función Recursiva')
print('EJERCICIO N°3')

def recursivos(numero):
    if numero >= 1: #caso base
        print(numero)
        recursivos(numero-1) #caso recursivo
    elif numero == 0:
        return
    elif numero <= 0:
        print("Valor incorrecto :(")
numero_recursivo = int(input("Ingrese un número: "))
resultado = recursivos(numero_recursivo)

'''

Ejercicio 4:
Crear una función para calcular el total de un pago incluyendo un impuesto aplicado. (IVA)
Formula: pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
Proporcione el pago sin impuesto: 1000
Proporcione el monto del impuesto: 21%
Pago con impuesto: xxxx

'''

print(' ')
print('Calculadora de Impuestos')
print('EJERCICIO N°4')

# Crear la función que calcula el total incliyendo el impuesto

def calcular_total_pago(pago_sin_impuesto, impuesto):
    pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
    return pago_total

pago_sin_impuesto = float(input("Ingrese el pago sin impuesto: "))

impuesto = float(input("Impuesto a aplicar: "))

pago_con_impuesto = calcular_total_pago(pago_sin_impuesto, impuesto)

print(f"El pago con impuestos es: {pago_con_impuesto}")

'''
Ejercicio 5: 
Realizar dos funciones para convertir de grados a celsius a fahrenheit y viseversa. Investigar las formulas

'''

print(' ')
print('Convertidor de temperaturas')
print('EJERCICIO N°5')

# Celsius a fahrenheit
def celsius_fahrenheit(celsius):
    return celsius * 9 / 5 + 32 # Presedencia: multiplicación, división y suma

# Fahrenheit a celsius
def fahrenheit_celsius(fahrenheit):
    return (fahrenheit - 32) * 5 / 9 # Usar siempre parentesis

celsius = float(input("Ingrese el valor de celsius: "))
resultado = celsius_fahrenheit(celsius)
print(f"{celsius} C a F = {resultado:.2f}")

fahrenheit = float(input("Ingrese el valor de fahrenheit: "))
resultado =fahrenheit_celsius(fahrenheit)
print(f"{fahrenheit} F a C = {resultado:.2f}")