class Vehiculo:
    """
    Definir una clase pader llamasa Vehiculo y dos clases hijas llamadas
    Auto y Bicicleta, las cuales heredan de la clase padre Vehiculo.
    La clase padre debe teber los siguients atributos y método:

    Vehiculo (clase padre)
    -Atrivutos(color, ruedas)
    Métodos(__init__(color, ruedas) y __str__())

    Auto(clase hija de vehiculo)
    -Atributos(velocidad(km/hr))
    -Métodos(__init__(color,ruedas,tipo) y __str__()

    Bicicleta(clase hija de Vehiculo)
    -Atributos(tipo(utbana/montaña/etc.)
    -Métodos(__init__(color,ruedas,tipo) y __str__()

    crear un objeto de cada clase
    """

    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas

    def __str__(self):
        return f'Vehiculo: Color: ' + self.color + ', Ruedas: ' + str(self.ruedas)


class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad

    def __str__(self):
        return super().__str__() + ', Velocidad(km/hr): ' + str(self.velocidad)

class Bicicleta(Vehiculo):
    def __init__(self, color , ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo

    def __str__(self):
        return super().__str__()+', Tipo: '+self.tipo


vehiculo = Vehiculo('Bordo', 4)
print(vehiculo)

auto = Auto('Negro', 4, 100)
print(auto)

bicicleta = Bicicleta('Verde', 2, 'Montabicke')
print(bicicleta)

