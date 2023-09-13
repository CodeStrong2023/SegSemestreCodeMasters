#lista = Ariel, Liliana, Natalia, osvaldo

nombres = ['Naty', 'osvaldo ', 'Lily', 'Ariel']
print(nombres)
print(nombres[0:2]) #solo muestra el indice 0, 1 pero no el indice 2
#ir del inicio de la lista al indice (sin incluirlo)
print(nombres[:3]) #Indices a mostrar 0, 1, 2
#Desde el indice hasta el final
print(nombres[1: ])
#Modificamos un valor
nombres[2] = 'Liliana'
nombres[0] = 'Natalia'
print(nombres)
# Iterar una lista
for nombre in nombres: #nombre es singular, la lista es plural
    print(nombre)
else:
    print('Se acabaron los elementos de la lista')

#Preguntamos cuantos elementos tiene
print(len(nombres)) # le pasamos como parametro la lista

#Agregamos un elemento
nombres.append('Marcelo')

#Insertar un elemento en un indice especifico
nombres.insert(1,'Alberto')
print(nombres)
nombres.insert(1,'Debora')
print(nombres)

#Eliminamos un elemento
nombres.remove('Alberto')
print(nombres)

# Eliminar el ultimo elemento
nombres.pop()
print(nombres)

# Eliminar un indice especifico
del nombres[2] #del significado delate (eliminar)
print(nombres)

# Borar lista
nombres.clear()
print(nombres)

#Eliminar la lista
#del nombres
print(nombres)

#Definimos una tupla
cocina = ('cuchara', 'cuchillo', 'tenedor')
print(len(cocina))

# Acceder a un elemento, para esto utilizamos corchetes no parentesis
print(cocina[0])
# mostar de manera inversa
print(cocina[-1])

#Acceder a un rango
print(cocina[0:1])
#ejemplo
verduras = ('papa,') #una tupla necesita aunque sea de un elemento: la coma
#de lo contrario solo seria un tipo str cadena

#Recorremos los elemntos de la tupla
for cocinar in cocina: #Print enta usando \n para saltos de lineas
    print(cocinar, end= ' ') # usamos end= para eliminar los saltos de linea

cocinaLista = list(cocina)
cocinaLista[0] = 'plato'
cocina = tuple(cocinaLista)
print('\n', cocina)

#del cocina #esto es para eliminar una tupla


#Tipo set
planetas = {'Martes', 'Júpiter', 'Venus'}
print(len(planetas)) #usamos la funcion len = length significa largo

#Revisar si un elemento existe dentro de set
print('Júpiter' in planetas)

#Agregar un elemento
planetas.add('Tierra') #Add es una funcion
print(planetas)

#Eliminar elementos, puede arrojar un erro si el elemneto no existe
planetas.remove('Júpiter') #esta funcion ante un mal ingreso u inexistencia del elemento da error
print(planetas)
planetas.discard('Tierra') #esta funcion no nos presenta un error
print(planetas)

# Limpiar set
planetas.clear()
print(planetas)

#Eliminar set
#del planetas
print(planetas) #al eliminar nos muestra error

# 'Maradona':10 un diccionario esta compuesto por dos elementos
# Una llave y un valor
# dict(key, value)
diccionario = {
    'IDE': 'Integrated Development Environment',
    'POO': 'Programacion Orientada a Objetos',
    'SABD': 'Sistema de Administracion de Base de Datos'

}
#verificar la cantidad de elementos del diccionario
print(len(diccionario))
print(diccionario)

#Acceder a un diccionario con la llave(key)
print(diccionario['IDE'])

#Otra forma de recuperar un elemento
print(diccionario.get('POO'))
print(diccionario.get('SABD'))

# Modificammos elementos
diccionario['IDE'] = 'Entornos de desaroolo Integrado'
print(diccionario)

# Como recorrer elementos
for termino in diccionario:
    print(termino)

for termino, valor in diccionario:
    print(termino, valor)

# Otras maneras de acceder a un diccionario
for termino in diccionario.keys(): #estamos usando una funcion
    print(termino) # Muestra solo las llaves

for valor in diccionario.values():
    print(valor)

# Comprobar la existencia de algun elemento
print('IDE' in diccionario) #devuelve un booleano

# Agregar un elemento
diccionario['PK'] = 'Primary key'
print(diccionario)

# Elimainar un elemento
diccionario.pop('SABD')
print(diccionario)
