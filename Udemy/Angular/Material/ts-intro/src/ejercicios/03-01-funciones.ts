

console.log('Hola Mundo !!!!');

/*
    ===== Código de TypeScript =====
*/

interface Persona{ // un objeto luzca como nosotros queremos
    nombre: String;
    edad: number;
    direccion: string;
    habilidades2: string[];
    puebloNatal?: string;  // esta es una propiedad 
}

const persona2 : Persona = { // objeto va a ser de tipo Persona
    nombre: 'Javier',
    edad: 34,
    direccion: 'DIAG 5A # 37B - 60',
    habilidades2: ['escritura','lectura','comprension']
}

console.table([persona2]);


function sumar(a: number,b: number): number{
    //return (a + b).toString();
    return a+b;
}

const sumerFlecha = (a : number,b:number):number =>{
    return a+b;
}

function multiplicar(numero: number, otroNumero?: number, base: number = 2){ //argumentos obligatorios se recomienda poner tipo de dato / ? indica que es opcional
    return numero * base;
}

interface PersonajeLOR{
    nombre: string;
    puntosVida:number;
    numeroDerrotas?: number;
    mostrarPuntosVida: () => void; // forma de declarar funciones en typescript
}

function curar(persona2 : PersonajeLOR, curarX):void{ // si no retorno nada pongo void por tanto no se pone el return 
    persona2.puntosVida += curarX;
}

const nuevoPersonaje: PersonajeLOR = {
    nombre: 'Javier',
    puntosVida: 60,
    mostrarPuntosVida(){
        console.log('Puntos de vida',this);
    }
}

const resultado = multiplicar(5,0,10);
console.log(resultado);

let elementos = ["mesa", "patines"];
console.log(elementos);

let usuario= {
    codigo:  100,
    nombre: "javier"
}
console.log([usuario])

nuevoPersonaje.mostrarPuntosVida();

