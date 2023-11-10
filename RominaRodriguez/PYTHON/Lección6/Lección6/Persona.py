class Persona:  # Creamos una clase

    def __init__(self, nombre, apellido, dni, edad,  *args, **kwargs):  # se lo llama método init Dunder
        self.nombre = nombre
        self.apellido = apellido # Encapsulado de manera sugerida
        self._dni = dni
        self.edad = edad
        self.args = args
        self.kwargs = kwargs

    def mostrar_detalle(self):# self es igual a this
        print(f"La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self._dni} {self.edad} , la dirección es: {self.args}, los datos importantes son: {self.kwargs}")


persona1 = Persona('Ariel', 'Betancud', 45678999,40)  # Necesitamos enviar argumentos
print(f'El objeto 1 de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es : {persona1.edad}')

persona2 = Persona('Osvaldo', 'Giordianini', 6999888,45)
print(f'El objeto 2 de la clase persona: {persona2.nombre} {persona2.apellido} Su edad es: {persona2.edad}')

persona1.nombre = 'Liliana'
persona1.apellido = 'Buccella'
persona1.edad = 40
print(f'El objeto 1 de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}')

#Los atributos son: características
#Los métodos son : el comportamiento que van a tener los objetos(acciones)
persona1.mostrar_detalle()# La referencia en este caso se pasa de manera automatica
persona2.mostrar_detalle()

Persona.mostrar_detalle(persona1)# Debemos pasarle una referencia para el self o dará error
persona1.telefono = '2644859677'
print(f'Este es el número de telefono de : {persona1.nombre} {persona1.telefono}')

#print(persona2.telefono) el objeto acual no tiene ningun atributo y marca error

persona3 = Persona('Rogelio', 'Romero',4356666,22, 'telefono', '2613498722', 'calle Lopez', 823, 'Manzana', 77, 'casa', 18, Altura=1.83, peso=105, cFavorito='Azul', Auto='Citroen', Modelo=2021)
persona3.mostrar_detalle()
#print(persona3._dni)# esto no se debe utilizar(esta encapsulado), esto dice que lo desconocemos en python

persona4 = Persona('Romina', 'Rodriguez', 33585052,35,'2617890045','Ruta 82', 'km23', 'Manzana', 1, 'casa', 5, Altura=1.69, Peso=60, CFavorito='Negro', Auto='Renault', Modelo=2005)
persona4.mostrar_detalle()
