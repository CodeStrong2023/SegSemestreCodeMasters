# Comenzamos con FUNCIONES
# mi_funcion() # NO se puede llamar a una función antes de ser creada
# Definimos una función
def mi_funcion(): # Para identificar una función lleva paréntesis
    print("Saludos a todos los alumnos de la Tecnicatura")

mi_funcion() # Estamos llamando a la función creada
mi_funcion() # Se puede llamar N veces a una función


# Desempaquetado de listas o list Unpacking
def show(name, lastName):
    print(name+ " "+lastName)
person = ["Ariel", "Betancud"]
show(person[0], person[1])# Pasamos uno por uno los datos de la lista a la función
show(*person)# Esto es lo mismo que lo anterior pero le pasamos todo junto
person2 = ("Osvaldo", "Giordanini")# Desempaquetamos a través de una tupla
show(*person2)
person3 = {"lastName": "Lucero", "name": "Natalia"} # Desempaquetando a través de diccionario
show(**person3)

# Repaso de for else
numbers = [1, 2, 3, 4, 5]
for n in numbers:
    print(n)
    if n == 3:
        break#Esta es la unica manera para que no se ejecute el else
else:
    print("Esto se termino")

# List comprehension, lista de comprensión
names = ["Paolo", "Rodrigo", "Lupe", "Pepe"]
alongP = [p for p in names if p[0] == "P"]# Esto regresa una nueva lista
print(alongP)

# Con diccionario
bottleC =[{"name": "Quilmes", "country": "Arg"},
          {"name": "Corona", "country": "Mx"},
          {"name": "Stella Artois", "country": "Bergium"},
          ]
Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)

# Paso de Argumento (funciones)
def mi_funcion2(name,lastName):
    print("Saludos a todos lo que ven a través del canal de youtube")
    print(f"Nombre: {name}, Apellido: {lastName}")
mi_funcion2("Jorge", "Lucero")
mi_funcion2("Romina", "Rodriguez")
mi_funcion2("Ariel", "Bentacud")

# La palabra return en funciones
# Creamos una función para sumar
def sumar(a, b):
    return a + b
#resultado = sumar(78, 22)
#print(f"El resultado de la suma es: {resultado}")
print(f"El resultado de la suma es: {sumar(55, 45)}")

# Valores por default
def sumar2(a= 0, b = 0):
    return a + b
resultado = sumar2()
print(f"Resultado de la suma es: {resultado}")
print(f"Resultado de la suma es : {sumar2(22, 66)}")

# Argumentos, variables en funciones
def lista_nombres(*nombres): #Normalmente se utiliza: *args
    for nombre in nombres: # se va a convertir en una tupla
        print(nombre)
lista_nombres("Lucas", "José", "Claudia", "Rosa", "Maria")
lista_nombres("Marcos", "Daniel", "Romina", "Fernando", "Marcela", "Carlos")
