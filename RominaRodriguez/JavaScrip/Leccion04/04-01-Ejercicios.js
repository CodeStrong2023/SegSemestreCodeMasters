//Ejercicio 1: Calcular estación del año
let mes = 12;
let estacion;
if(mes == 1 || mes == 2 || mes == 12){
    estacion = "Verano"
}
else if(mes == 2 || mes == 4 || mes == 5){
    estacion = "Otoño"
}
else if(mes == 6 || mes == 7 || mes == 8){
    estacion = "Invierno"
}
else if(mes == 9 || mes == 10 || mes == 11){
    estacion = "Primavara"
}
else{
    estacion = "Valor incorrecto"
}
console.log("El valor corresponde a la estación de : "+estacion);


//Ejercicio 2: Hora del día

/*
de 7 a 9 desayuno
de 10 a 12 preparo el almuerzo
de 13 a 14 almmorzamos
de 15 a 17 descanzamos la siesta
de 18 a 20 hago ejercicio
de 21 a 22 cena libiana
de 23 a24 veo una serie
de 24 a 7 duermo
*/
let horaDia = 18;
let mensaje;
if(horaDia >= 7 && horaDia <=9){
    mensaje = "Me levanto y desayuno";
}
else if(horaDia >= 10 && horaDia <= 12){
    mensaje ="Preparo el almuerzo";
}
else if(horaDia >= 13 && horaDia <= 14){
    mensaje = "Hora de almorzar";
}
else if(horaDia >= 15 && horaDia <=17){
    mensaje = "Descanso la siesta";
}
else if(horaDia >= 18 && horaDia <= 20){
    mensaje = "Hago ejercicio y ducha";
}
else if(horaDia >= 21 && horaDia <= 22){
    mensaje = "Cena libiana";
}
else if(horaDia >= 23 && horaDia <= 24){
    mensaje= "Veo una serie";
}
else if(horaDia >= 24 && horaDia <= 7){
    mensaje = "Hora de dormir";
}
else{
    mensaje = "Opción no valida";
}
console.log("A esta hora del día: "+horaDia+"hs"+" " +mensaje)

//Estructura switch(la sintaxis es igual a java)
switch(mes){ //No solo se puede utilizar números, también cadenas
    case 1: case 2: case 12:
        estacion = "Verano";
        break;
    case 3: case 4: case 5:
        estacion = "Otoño";
        break;
    case 6: case 7: case 8:
        estacion = "Invierno";
        break;
    case 9: case 10: case 11:
        estacion = "Primavera";
        break
    default:
        estacion = "Vlor incorrecto";                    
}
console.log("Bienveidos a la estación de: "+estacion)

/*
conts se utiliza para valores constantes que no pueden ser reasignados
 */

const fechaDeNacimiento = 2006;
console.log(fechaDeNacimiento);
//fechasDeNacimiento = 2003;
//console.log(fechaDeNacimiento);//solo se ejecuta el console anterior

//Evitar repetir tu código
//dry don't repeat yourself

let days = 7;
switch (days){
    case 1:
        console.log('Hoy es Lunes');
        break;
    case 2:
        console.log('Hoy es Martes');
        break;
    case 3:
        console.log('Hoy es Miércoles');
        break;
    case 4:
        console.log('Hoy es Jueves');
        break;
    case 5:
        console.log('Hoy es Viernes');
        break;
    case 6:
        console.log('Hoy es Sabado');
        break;
    case 7:
        console.log('Hoy es Domingo');
        break;
    default:
        break;   
}
//Esta es la versión mejorada, para no repetir código
let days2 = ['Lunes','Martes','Miércoles','Jueves','Viernes','Sabado','Domingo'];
function getDay(n){
    if(n < 1 || n >7){
        throw new Error('out of range');
    }
    return days2[n-1];
}
console.log(getDay(4));

//Hacer un ejercicio similar al que esta hecho, pero ahora
//con los meses del año, debes hacerlo con la estructura switch y 
//luego con la función en la opción mejorada

let week = 7;
switch (week){
    case 1:
        console.log('Estamos en el mes de Enero');
        break;
    case 2:
        console.log('Estamos en el mes de Febrero');
        break;
    case 3:
        console.log('Estamos en el mes de Marzo');
        break;
    case 4:
        console.log('Estamos en el mes de Abril');
        break;
    case 5:
        console.log('Estamos en el mes de Mayo');
        break;
    case 6:
        console.log('Estamos en el mes de Junio');
        break;
    case 7:
        console.log('Estamos en el mes de Julio');
        break;
    case 8:
        console.log('Estamos en el mes de Agosto');
        break;
    case 9:
        console.log('Estamos en el mes de Septiembre');
        break;
    case 10:
        console.log('Estamos en el mes de Octubre');
        break;
    case 11:
        console.log('Estamos en el mes de Noviembre');
        break;
    case 12:
        console.log('Estamos en el mes de Diciembre');
        break                 
    default:
        break;   
}
//Versión mejorada es:
let week2 = ['Enero','Febrero','Marzo','Abril','Mayo','Junio','Julio','Agosto','Septiembre','Octubre','Noviembre','Diciembre'];
function getWeek2(n){
    if(n < 1 || n >12){
        throw new Error('out of range');
    }
    return week2[n-1];
}
console.log(getWeek2(4));
