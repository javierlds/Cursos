//alert('hola mundo');
const nombre = prompt('Cual es tu nombre?')
console.log("ELEMENTO:",document.querySelector('.contenido').innerHTML);
document.querySelector('.contenido').innerHTML = `${nombre} esta aprendido javascript` // esto sirve para escoger cualquier elemento del html

const texto2= prompt('cual es su apellido')
console.log("ELEMENTO2:",document.querySelector('.contenido2').innerHTML);
document.querySelector('.contenido2').innerHTML = `${texto2} tambien aprende javascript`;
