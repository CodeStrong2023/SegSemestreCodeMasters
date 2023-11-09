//Ejercicio para encontrar números pares
let par_impar = 10;
if(par_impar % 2 ==0){
    console.log("Es un número par");
}
else{
    console.log("Es un número impar");
}

//Ejercicio: es mayor de edad
let edad = 20, adulto = 18;
if(edad >= adulto){
    console.log("es una persona adulta");
}
else{
    console.log(" es menor de edad")
}

//Ejercicio: Dentro de un rango
let dentroRango = 10;//Aquí vamos ir cambiando el valor
let valMinimo = 0, valMaximo = 10;
if( dentroRango >= valMinimo && dentroRango <= valMaximo){
    console.log("Esta dentro del rango establecido")
}
else{
    console.log("Esta fuera del rango establecido")
}

//Ejercicio: Si el padre puede asistir al juego de su hijo
let vacaciones = true, diaDescanso = false;
if(vacaciones || diaDescanso){
    console.log("El padre puede asistir al juego de su hijo")
}
else{
    console.log("El padre No puede asistir al juego de su hijo")
}

//Operador ternario
let resultado2 = 3 > 2 ? "Verdadero":"Falso";
console.log(resultado2);
let numero = 12;
resultado2 = numero % 2 == 0 ? "El número es PAR": "Es un número IMPAR";
console.log(resultado2);

//Convertir String a Number
let miNumero = "21"; //Es una cadena
console.log(typeof miNumero);
let edad2 = Number(miNumero);//Esta es una función
console.log(typeof edad2);
//Función is NaN(sirve para verificar el valor de una variable que sea de tipo numerica)
if(isNaN(edad2)){//No es un número = is NOT a Number(devuelve un resultado booleano)

    console.log("Esta variable no contiene solo números");
}
else{
    if(edad2 >= 18){
        console.log("Puede votar")
    }
    else{
        console.log("Muy joven para votar");
    }
} 
//Operador ternario
let resultado3 = edad2 >= 18 ? "Puede votar" : "Muy joven para votar";
console.log(resultado3);



