class Rectangulo:
    """"
    Crear una clase llamada Rectangulo, debe tener 2 atributos: altura y base
    el nombre del metodo sera calcilar area utilizando la formula:
    el usiario y los objetos deben ser tres
    """
    def __init__(self, altura, base):
        self.altura = altura
        self.base = base

    def calcular_area(self):
        return self.altura * self.altura

base = int(input('Digite el numro para la base del rectangulo: '))
altura = int(input('Digite el numero para la altura del rectangulo: '))
rectangulo = Rectangulo(base, altura)
print(f'El area del rectangulo es: {rectangulo.calcular_area()}')