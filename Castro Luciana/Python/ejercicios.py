
class Persona: #creamos una clase :)

    def __init__(self, nombre, apellido, edad): # se llama inir Deunder
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad

    def mostrar_detalle(self):
        print(f'Persona: {self.nombre} {self.apellido} {self.edad}')


persona1 = Persona('Luciana', 'Castro', 22)
print(f'El objeto1 de la clase Persona: {persona1.nombre} {persona1.apellido}  ,edad: {persona1.edad}')

persona2 = Persona('Nacho', 'Jorquera', 23)
print(f'El objeto2 de la clase Persona: {persona2.nombre} {persona2.apellido} ,edad: {persona2.edad}')

persona1.nombre = 'Pablo'
persona1.apellido = 'Perez'
persona1.edad = 23
print(f'El objeto1 modificado de la clase Persona: {persona1.nombre} {persona1.apellido} ,edad: {persona1.edad}')

persona1.mostrar_detalle()
persona2.mostrar_detalle()