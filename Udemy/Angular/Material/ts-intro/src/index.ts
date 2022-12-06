
// crear 
interface SuperHeroe {
    nombre: String;
    edad: number;
    direccion: String;
    
}



const superHeroe: SuperHeroe = {
    nombre: 'Spiderman',
    edad: 30,
    direccion: {
        calle: 'Main St',
        pais: 'USA',
        ciudad: 'NY'
    },
    mostrarDireccion(){
        return this.nombre + ', ' + this.direccion.ciudad + ' , ' + this.direccion.pais;
    }
}


const direccion = superHeroe.mostrarDireccion();
console.log(direccion);