# Listas = Mateo, Maria Jose, Pablo, Joaquin, Emiliano

nombres = ['Mateo', 'Maria Jose', 'Pablo', 'Joaquin', 'Emiliano']
print(nombres)
print(nombres[0])
print(nombres[1])
print(nombres[2])
print(nombres[-1])
print(nombres[-2])

print(nombres[0:2]) # Solo muestra el indidce 0, 1 pero no el indice 2
# Ir del incio de la lista al indice (sin incluirlo)
print(nombres[ :3]) #Indices a mostrar 0, 1 y 2
# Desde el indice indicado hasta el final
print(nombres[1: ])
# Modificamos un valor

nombres[2] = 'Sergio'
nombres[4] = 'Emi'
print(nombres)

# Iterar una lista
for nombre in nombres: # Nombre es singular, la lista es plural
    print(nombre)
else:
    print('Se acabaron los elementos de la lista')

# Preguntamos cuantos elementos tiene
print(len(nombres)) # Le pasamos como parametro la lista

# Agregamos un elemento
nombres.append('Marcelo')
print(nombres)
