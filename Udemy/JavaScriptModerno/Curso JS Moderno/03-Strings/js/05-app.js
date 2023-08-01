// REEMPLAZANDO TEXTOS

const descripcion_03 = "Nueva descripcion de ejemplo, monitor 50 pulgadas";
console.log(descripcion_03);
console.log(descripcion_03.replace('pulgadas', '"')) // para reemplazar el texto

// Metodo slice para cortar
console.log("Extraer texto Slice: ",descripcion_03.slice(2,6)); // extrae desde la posicion0 a 10

// Metodo substring para cortar
console.log("Extrae texto substring: ", descripcion_03.substring(0,5));
console.log("Extrae texto2 substring: ", descripcion_03.substring(6,2)); // aca no importa si el primer valor es mayor se acomoda y arrancaria a partir de la posicion 2 a la6


// Diferencia SLICE vs SUBSTRING => Substring no le importa si el primer parametro es mayor al segundo, lo acomoda para tomar como val minimo el valor mas grande

//para tomar el primer caracter
const usuario = 'JAVIER PAEZ';
console.log(usuario.charAt(0));  // tomar el caracter de la posicion 0
console.log(usuario.charAt(5)); // tomar el caracter de la posicion 5

const usuario_3 = 'JAVIER AUGUSTO PAEZ CRUZ';
console.log(usuario_3.charAt(8));


