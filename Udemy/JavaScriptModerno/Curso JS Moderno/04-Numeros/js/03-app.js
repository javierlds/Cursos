
// Creando menu en javascript

function realizaOperacion(operador){
    let resultado = 0;
    var num01form = parseInt(document.getElementById("num_01").value);
    var num02form = parseInt(document.getElementById("num_02").value);

    //if(operador === 1){ // === es una validacion de tipo y dato, == hace la conversion para la validacion
    resultado = eval(num01form + operador + num02form);
    document.getElementById("resultado").value = resultado;
}

function operador(){
    const opciones = document.querySelectorAll('input[name="operador"]');
    let seleccion;
    opciones.forEach((opcion)=>{
        if(opcion.checked){
            seleccion = opcion.value;
        }
    });
    debugger
    realizaOperacion(document.getElementById("operador").value);
}

/*
// USO DE MATH 
let res01;

//PI
res01 = Math.PI;
console.log(`Valor de PI es ${res01}`)

//REDONDEAR
let res02 = Math.round(2.7); // redondea mas cerca arriba
let res03 = Math.round(2.8);
let res04 = Math.round(2.3);// redondea mas cerca hacia abajo

console.log(`Valor de redondeo2 es igual a ${res02}`);
console.log(`Valor de redondeo4 es igual a ${res04}`);

//REDONDEA HACIA ARRIBA
let res05 = Math.ceil(prompt("Ingrese numero a redondear"));
console.log(`El redondeo hacia arriba del numero ${res05}`)

//REDONDEA HACIA ABAJO*/