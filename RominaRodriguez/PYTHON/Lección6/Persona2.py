class Persona2:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalle(self):
        print(f'Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}')

    @property  # Decorador
    def nombre(self):  # Método Getter
        print('Estamos utilizando el método get')
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):  # Método Setter
        print('Estamos utilizando el método set')
        self._nombre = nombre

    @property
    def apellido(self):
        print('Estamos utilizando el método get')
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):
        print('Estamos utilizando el método set')
        self._apellido = apellido

    @property
    def edad(self):
        print('Estamos utilizando el método get')
        return self._edad

    @edad.setter
    def edad(self, edad):
        print('Estamos utilizando el método set')
        self._edad = edad

    def __del__(self):
        print(f'Persona2: {self._nombre} {self._apellido} {self._edad}')
if __name__ == '__main__ ':
    persona1 = Persona2('Ariel', 'Betancud', 41)
    print(persona1.nombre)  # Llamamos al método getter
    persona1.nombre = 'Juan Pedro'  # Llamamos al método setter
    print(persona1.nombre)  # Otra ves con el método getter
    print(persona1.mostrar_detalle())  # Llamamos el método mostar detalle
# Atributo read-only (solo lectura sería la edad porque no tiene el método set)
# persona1.edad = 41
    print()
# tarea crear tres objetos más, utilizando los métodos getter and setter
# para modificar, y mostrar los cambios con el método mostrar_detalles
    persona2 = Persona2('Romina', 'Rodriguez', 35)
    print(persona2.mostrar_detalle())
    persona2.nombre = 'Maricel'
    print(persona2.nombre)
    persona2.apellido = 'Torres'
    print(persona2.apellido)
    persona2.edad = 36
    print(persona2.edad)
    print(persona2.mostrar_detalle())
    print()
    persona3 = Persona2('Lautaro', 'Torres', 12)
    print(persona3.mostrar_detalle())
    persona3.nombre = 'Fernando'
    print(persona3.nombre)
    persona3.apellido = 'Rodriguez'
    print(persona3.apellido)
    persona3.edad = 13
    print(persona3.edad)
    print(persona3.mostrar_detalle())
    print()
    persona4 = Persona2('Iris', 'Torres', 9)
    print(persona4.mostrar_detalle())
    persona4.nombre = 'Jazmin'
    print(persona4.nombre)
    persona4.apellido = 'Rodriguez'
    print(persona4.apellido)
    persona4.edad = 10
    print(persona4.edad)
    print(persona4.mostrar_detalle())

    print(__name__)