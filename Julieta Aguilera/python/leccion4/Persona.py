class Persona: #creamps una clase
    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs): # se lo llama inir Deunder
        self.__nombre = nombre
        self.apellido = apellido
        self._dni = dni #este atributo esta encapsulado de una manera sugerida
        self.edad = edad
        self.args = args
        self.kwargs = kwargs
    def mostrar_detalle(self): # self es igual a this
        print(f'Persona:{self.nombre} apellido:{self.apellido} dni:{self.dni} edad:{self.edad} direccion{self.args} datos importantes:{self.kwargs}')


persona1 = Persona('Julieta', 'Aguilera',45142384, 20)
print(f'El objeto1 de la clase Persona: {persona1.nombre} {persona1.apellido} y su esas es: {persona1.edad}')

persona2 = Persona('Eica', 'Murie',45142384, 19)
print(f'El objeto2 de la clase Persona: {persona2.nombre} {persona2.apellido} y su esas es: {persona2.edad}')

persona1.nombre = 'Rosalia'
persona1.apellido = 'Albaro'
persona1.edad = 22
print(f'El objeto1 modificado de la clase Persona: {persona1.nombre} {persona1.apellido} y su esas es: {persona1.edad}')

# Los atributos son: caracteristicas
# Los metodos son el comportamiendo que van tener los objetos (acciones)

persona1.mostrar_detalle()
persona2.mostrar_detalle()


#Persona.mostrar_detalle(persona1) #Debemos pasarle una reffferencia paea el self o dara error
persona1.telefono = 2625451281
print(f'Este es el telefono de: {persona1.nombre} {persona1.telefono}') #hemos creado un atributo en un objeto

#print(persona2.telefono) el objeto persona2 no tiene atributo, da error
persona3 = Persona('Antonia', 'Murie',45142384, 42, 'Telefono' '2604308681', 'Malvinas', 'casa', 18, Altura=1.60, Peso=75, CFavorito='rosado', Auto='Citroen')
persona3.mostrar_detalle()
#print(persona3._dni) esto no se debe utilizar en python, esto dice que lo conocemos
#persona3.__nombreEsta totalmente encapsulado

