function validaEdad(){
    const fechaNacimiento = document.getElementById("fechaNac").value;
    const anioNac = new Date(fechaNacimiento).getFullYear();
    const anioAct = new Date(Date.now()).getFullYear();
    const diferencia = anioAct - anioNac;
    alert(`Usted tiene ${diferencia} años`)
    const validaEdad = diferencia>=18 ?alert('Puede ingresar al sistema'):alert('No puede ingresar al sistema');
}