// Cortar espacios en blacno de un STRING


const descripcion_01 = '                  Descripcion de producto 01                ' ;
console.log("04 apps -Longitud cadena: ",descripcion_01.length); // este lengh conto los espacios

//Eliminar del inicio 
console.log("Eliminar espacio al principio",descripcion_01.trimStart()); //Eliminar  del principio.
//Al final
console.log("Eliminar espacio al final ", descripcion_01.trimEnd()); //Eliminar al final
//Eliminar principio y fin
console.log("Eliminar espacio al principio y al final: ", descripcion_01.trimStart().trimEnd); // En javascript se pueden concatenar las funciones

//funcion anterior:
console.log("Eliminar espacios: ", descripcion_01.trim())


