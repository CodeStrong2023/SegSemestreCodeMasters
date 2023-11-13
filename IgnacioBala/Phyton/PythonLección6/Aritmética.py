class Aritmetica:
    """
    El nombre de tipo de comentario es ]: DocString
    documentación en clase de python.

    Haremos unas operaciones matemáticas

    """
    def __init__(self, operandoA , operandoB):
        self.operandoA =  operandoA
        self.operandoB = operandoB

    def sumar(self):
        return self.operandoA + self.operandoB
    def resta(self):
        return self.operandoA - self.operandoB

    def multiplicar(self):
        return self.operandoA * self.operandoB

    def dividir(self):
        return self.operandoA / self.operandoB

aritmetica1 = Aritmetica(7,9)
print(aritmetica1.sumar())
print(f'La resta de los números es: {aritmetica1.resta()}')
print(f'La multiplicación de los números es: {aritmetica1.multiplicar()}')
print(f'La división de los numeros es: {aritmetica1.dividir():.2f}')
