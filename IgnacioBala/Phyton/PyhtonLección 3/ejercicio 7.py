#i, horas, tarifa, salarios, suma

i = 1

suma = 0

while i <= 5:
    print(f'Salario del empleado: {i}')
    horas = int(input('Ingrese las horas trabajadas: '))
    tarifa = float(input('Ingrese cuanto cobras por hora: '))

    sueldo = float(horas * tarifa)

    suma += sueldo

    i += 1

print(f'El total de la sumatoria es : {suma}')
