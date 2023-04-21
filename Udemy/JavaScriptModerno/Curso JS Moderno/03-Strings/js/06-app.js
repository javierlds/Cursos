// USO DE REPEAT => Permite repetir una cadena de texto
const cadena01 = 'Monitor de 20 pulgadas ';
const texto01 = 'en promocion'.repeat(2.9)  // si pongo decimal javascript lo redondea al menor
console.log(`${cadena01} ${texto01}`);

//USO DE SPLIT dividir un string
const actividad = "Estoy aprendiendo javascript moderno";
console.log(actividad.split(" "))

const hobbies = "leer,escribir, jugar futbol, jugar baloncesto";
console.log("Hobbies: ", hobbies);
const arrayHobbies = hobbies.split(",");

// recorriendo el array con FOR
for(let i = 0; i< arrayHobbies.length; i++){
    console.log("Elemento: " + i + "=>"+ arrayHobbies[i]);
}



