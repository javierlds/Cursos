
// Creando menu en javascript
var num01form = parseInt(document.getElementById("num01").value);
var num02form = parseInt(document.getElementById("num02").value);

function realizaOperacion(operador){
    let resultado = 0;
    //if(operador === 1){ // === es una validacion de tipo y dato, == hace la conversion para la validacion
    if(operador != 'o'){
        resultado = eval(num01form + operador + num02form); // eval permite ejecutar una expresion tipo string como expresion matematica
        document.getElementById("resultado").value = resultado;
    }
}

function redondeo(){
    let numred=0;
    let nuevorendondeo;
    opcion = parseInt(prompt("Cual numero quiere redondear el 1 o el 2"));
    resultado = opcion ===1 ?resultado = Math.round(num01form) :resultado = Math.round(num02form);
    document.getElementById("resultado").value = resultado;
    opcion = parseInt(prompt("Desea redondear hacia arriba (1) o hacia abajo(2)"))
    if(opcion ===1){
        numred = parseInt(prompt("Digite numero a redondear:"))
        nuevorendondeo = Math.ceil(numred);
        alert(`El numero ${numred} redondeado es: ${nuevorendondeo}`)
    }else{
        nuevorendondeo = Math.floor(numred);
        alert(`El numero ${numred} redondeado es: ${nuevorendondeo}`)
    }
    
}

// valor maximo:
Math.max()// digitar serie de valores
 // valor minimo:
 Math.min()   // digitar serie de valores.
 // potencia
 Math.pow(2,4)  // 2 a la 4
 // aleatorio
 Math.random()*20
 //aleatorio dentro dentro de un rango
 Math.floor(Math.random()*30)



function operador(){
    const operacionMat = document.querySelectorAll('input[type="radio"][name="radiooper"]')
    const opciones = document.querySelectorAll('input[name="radiooper"]'); // la seleccion
    const signos =[];
    let seleccion;

    // se
    opciones.forEach((opcion) => {
        if(opcion.checked){
            seleccion = opcion.value;
            console.log("Seleccionado:", seleccion);
        }
    });


    

    /*
    if(operacionMat.includes(opciones)){ // llama la funcion de solo operaciones matematicas
        opciones.forEach((opcion)=>{   // de esta forma se recorre el radio buton y se almacena en opcion.
            if(opcion.checked){ // opcion esta chequeado aplica la operacion matematica
                seleccion = opcion.value;
                realizaOperacion(seleccion);  /// vanesa
            }
        });
    }else{
        redondeo();
    }*/
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