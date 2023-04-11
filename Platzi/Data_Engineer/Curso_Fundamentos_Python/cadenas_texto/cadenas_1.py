def seleccionOpcion(opcion, textoTransfor):
    nuevo_texto = ""

    match opcion:
      case 1:
        nuevo_texto = textoTransfor.upper() #texto en mayusculas
        print("La transformacion es: " + nuevo_texto)
      case 2:
        nuevo_texto = textoTransfor.lower() #texto en minusculas
        print("La transformacion es: " + nuevo_texto)
      case 3:
        nuevo_texto = textoTransfor.capitalize() #Transforma el texto primera letra en mayuscula
        print("La transformacion es: " + nuevo_texto)
      case 4:
        nuevo_texto = textoTransfor.strip() #Elimina los espacios del texto
        print("La transformacion es: " + nuevo_texto)
      case 5:
        letra_busqueda = input("Indique la letra a buscar:")
        letra_reemplazo = input("Indique la nueva letra:")
        nuevo_texto = textoTransfor.replace(letra_busqueda,letra_reemplazo)
        print("La transformacion es: " + nuevo_texto)
      case 6:
        usoSlices()
      case 7:
        nuevo_texto = textoTransfor[::-1]
        print("cadena: " +  textoTransfor + ", Invertida: " + nuevo_texto)
      case 8:
        nuevo_texto = textoTransfor * 5
        print("Cadena replicada 5 veces: " +  nuevo_texto8)
      case 9:
        verdadero = True
        falso     = False
        print("Verdadero: " + str(verdadero) )
        print("falso: " + str(falso) )

def usoSlices(texto):
    texto = texto[::2]
    return texto
    

if __name__ == '__main__':
   opcion = int(input('''
    menu = 
    Seleccionoe opcion:
    1-> Cambiar a mayuscula
    2-> Cambiar a minuscula
    3-> Primera letra en mayuscula
    4-> Eliminar espacios
    5-> Reemplazar letras de un texto
    6-> usoSlices
    7-> Cadena al reves
    8-> Operar cadenas de caracteres
    9-> Booleanos
    10-> Salir
    '''))

   if opcion == 9:
     texto = " "
     seleccionOpcion(opcion,texto)  
   else: 
     texto = input("Ingrese texto: ")
     seleccionOpcion(opcion,texto)  
   