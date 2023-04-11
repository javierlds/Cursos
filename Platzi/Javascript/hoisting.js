/*es mencionar una variable o funcion antes de inicializarla, esto cambia con EMSCRP 6
El hoisting en JavaScript es un comportamiento que ocurre cuando las declaraciones de variables y funciones se “mueven” 
al comienzo del ámbito en el que están definidas, sin importar dónde se haya realizado la declaración en el código.
En otras palabras, el hoisting es un comportamiento en el que las declaraciones de variables y funciones se elevan
 (se “mueven”) al comienzo del ámbito en el que están definidas, independientemente de dónde se hayan realizado en el código.

*/

console.log(miNombre); // utilizao una variable sin haberla inicializado o creado
var apellido = "paez";

hola();

function hola(){
    console.log("hola: " + miNombre);
}
var miNombre= "Javier";

var miNombre= "Javier";
hola2();

function hola2(){
    console.log("hola funcion ");
}

// con esta funcion Javascript pone al inicio del ambito la funcion hola2() a pesar de que se llamo primero, antes de crearla

