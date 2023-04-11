// Declarativas
function miFuncion(){
    return 3;
}

//Funcion de expresion:
var miFuncion = function(a,b){
    return a + b;
}

miFuncion(5,3);


// uso de funcion recibiendo el parametro dentro de una cadena de texto
function saludarEstudiantes(estudiante){
    console.log(`Hola ${estudiante}`);
}

//funcion de expresion:
//Funcion para calculo de iva.
var miFuncion = function validarValorProducto(producto, valor){
                    var calculaIva;
                    if(valor < 5000){
                        calculaIva = (valor *0.19) + valor;
                        console.log(`el valor iva a pagar del producto ${producto} es de ${valor} `)
                    } else{
                        calculaIva = valor;
                    }
                    return calculaIva;
                }


