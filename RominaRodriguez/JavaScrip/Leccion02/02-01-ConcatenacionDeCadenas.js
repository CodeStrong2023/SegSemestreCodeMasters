var nombre = "Romina";
var apellido = "Rodriguez";
var nombreCompleto = nombre+" "+apellido;//Primera concatenación
console.log(nombreCompleto);
var nombreCompleto2 = "Ariel"+" "+"Betancud";//Segunda concatenación
console.log(nombreCompleto2);
var juntos = nombre + 219;
console.log(juntos)
juntos + 78 + 17;
console.log(juntos);
juntos = 78 + 17 + nombre;
console.log(juntos);

nombre += apellido;//Tercera concatenación usando el operador simplificado
console.log(nombre);

// Hoy ya no se usa var, se utiliza let y const
let nombre2 = "Pedro";
console.log(nombre2);

const apellido2 = "Lepes";
//apellido2 = "Peres";una costante no puede ser modificada
console.log(apellido2);

let x, y; //Se pueden crear varias variables dentro de una misma línea
x = 17, y = 21; //Se puede hacer asignación de varias variables dentro de la misma
let z = x +y;//Se le asigna el valor de la operación
console.log(z);

let _1num = 31;//No utilizar numeros para el inicio de una variable
let rompiendo = "rompe";//No se pueden utilizar palabras reservadas para inicializar una variable
console.log(_1num);
console.log(rompiendo);

//Ampliamos el uso de var let y const
/*
Con var puedes reasignar en cualquier momento
este forma parte del ambito global
Un error es que se sobreescriba
*/

var nombre = "Ariel";
nombre = "Osvaldo";
console.log(nombre);

function saludar(){
    var nombre3 = "Natalia";
    console.log(nombre3);
}
//console.log(nombre3); //Aquí no lee el dato en la función

if(true){
    var edad = 34;
    console.log(edad);
}
console.log(edad);//En la función funciono correctamente, en la estructura if fallo

/*
let: esta puede ser reasignada en cualquier momento
la diferencia es que su ambito es de bloque,
solo disponible dentro de un bloque de llaves
o dentro de una función
*/

function saludar2(){
    let nombre2 = "Ariel";
    console.log(nombre2);
}
//console.log(nombre2);

if(true){
    let edad2 = 33;
    console.log(edad2);
}
//console.log(edad2);

/*
const se utiliza para valores constantes que no pueden ser reasignadas
*/

const fechaNacimiento = 2006;
console.log(fechaNacimiento);
//fechaNacimiento = 2003;
//console.log(fechaNacimiento);//solo se ejecuta en console anterior
