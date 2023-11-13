
class Persona:
    def __init__(self, nombre, apellido, edad, *args, **kwargs):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
        self.args = args
        self.kwargs = kwargs
    def mostrar_detalle(self):
        print(f'La clase persona tiene los siguientes datos: {self.nombre} {self.apellido} {self.edad}, la información adicional es: {self.info_adicional}')

persona1 = Persona('Ignacio', 'Bala', 18)
print(f'El objeto de la clase persona: {persona1.nombre} {persona1.apellido} su edad es: {persona1.edad}')

persona2 = Persona('Osvaldo', 'Giordanini', 40)
print(f'El objeto de la clase persona: {persona2.nombre} {persona2.apellido} su edad es: {persona2.edad}')

persona1.nombre = 'Raúl'
persona1.apellido = 'Spinetta'
persona1.edad = 90
print(f'El objeto modificado de la clase persona: {persona1.nombre} {persona1.apellido} su edad es: {persona1.edad}')

persona1.mostrar_detalle()
persona2.mostrar_detalle()

# Crear persona3 con información adicional
persona3 = Persona('Ignacio', 'Bala', 18, telefono='2613362602', direccion='Calle cerro leon negro', altura=1.84, peso=81, color_favorito='negro', auto='Chevrolet', modelo='Meriva')
persona3.mostrar_detalle()