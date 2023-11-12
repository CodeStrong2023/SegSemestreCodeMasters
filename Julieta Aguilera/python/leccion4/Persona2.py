class Persona2:
    def __int__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f'Los datos son los siguientes: {self._nombre} {self._apellido} {self._edad}')

    @property #decorador
    def nombre(self):#Metodo Getter
        print('Estamos usando metodo get')
        return self._nombre()

    @nombre.setter
    def nombre(self, nombre):
        print('Estamos usando metodo set')
        self._nombre = nombre

    @property
    def apellido(self):
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad

#persona1 = Persona2('Julieta', 'Aguilera', 20)
#print(persona1.nombre())
