class Rectangulo:
    def __init__(self, altura, base):
        self.altura = altura
        self.base = base
    def calcular_area(self):
        return self.base * self.altura

base = int(input('Ingresed la base de dicha figura'))
altura = int(input('Ingresed la altura de dicha figura'))
rectangulo1 = Rectangulo(base, altura)
print(f'El áreas del rectangulo es : {rectangulo1.calcular_area()}')
