
//Uso de if 

if(edad === 18){
    console.log("puedes votar")
}else if(edad <= 18){
    console.log("edad invalida")
}

let valor = prompt("Ingrese su edad: ")
if(valor >= 18){
    console.log("Mayor de edad")
}else if(valor <= 18){
    console.log("Usted es menor de edad")
}else{
    console.log("no agrego los datos correctos")
}

// operador ternario
var numero = numero >5 ? (5 +1) :  (5+9)