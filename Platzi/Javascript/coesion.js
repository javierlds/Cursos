//////////////////////////////////////// COESION IMPLICITA

// Es cuando el lenguaje interpreta el tipo de operacion, por ejemplo :
var b = 5 * "8"
// el resultado es numero, lo interprega javascript


//////////////////////////////////////// COESION EXPLICITA
var a = 20;
var c = a + "";

var d = String(a);  // convirtiendo variable a otro valor
console.log(d);
typeof d;

var e = Number(c);
console.log(e);
typeof e;