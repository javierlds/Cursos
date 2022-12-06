interface Persona{ // un objeto luzca como nosotros queremos
    nombre: String;
    edad: number;
    direccion: string;
    habilidades2: string[];
    puebloNatal?: string;  // esta es una propiedad 
}

const persona : Persona = { // objeto va a ser de tipo Persona
    nombre: 'Javier',
    edad: 34,
    direccion: 'DIAG 5A # 37B - 60',
    habilidades2: ['escritura','lectura','comprension']
}

persona.puebloNatal = 'Cundinamarca';
console.table([persona]); // se debe colocar entre llaves la clase para que muestre la tabla