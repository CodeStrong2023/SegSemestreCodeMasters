// Aplicamos el uso de var let y const 
/*
Con var puedes reasignar el cualquier momento
este forma parte del ambito global
Un error es que se sobreescribe
 */

var nombre = 'Julieta';
nombre = 'Erica';
console.log(nombre);

function saludar(){
    var nombre3 = 'Rosalia';
    console.log(nombre3); //Aqui no lee el dato en la funcion
}
//console.log(nombre);

if(true){
    var edad = 34;
    console.log(edad);
}
console.log(edad);//En esta funcion correctamente, en la estructuraa if fallo

/*
let: esta puede ser reasignaada en cualquier momento
la diferencia es que su ambito es de bloques,
solo disponible dentro de un bloque de llaves
o dentro de una funcion 
*/

function saludar2(){
    let nombre2 = 'Julieta';
    console.log(nombre2);
}
//console.log(nombre2);

if(true){
    let edad = 33;
    console.log(edad);
}
console.log(edad);

/*
const se utiliza para valores constantes que no pueden ser reasignados 
*/

const fechaNacimiento = 2006;
console.log(fechaNacimiento);
//fechaNacimiento = 2003;
//console.log(fechaNacimiento); //solo se ejecuta el console anterior 
