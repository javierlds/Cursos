def seleccionOpcion(opcion, textoTransfor):
    nuevo_texto = ""
    if opcion == 1:
        nuevo_texto = textoTransfor.upper() #texto en mayusculas
    elif opcion ==2:
        nuevo_texto = textoTransfor.lower() #texto en minusculas
    elif opcion ==3:
        nuevo_texto = textoTransfor.capitalize() #Transforma el texto primera letra en mayuscula
    elif opcion ==4:
        nuevo_texto = textoTransfor.strip() #Elimina los espacios del texto
    elif opcion ==5:
        letra_busqueda = input("Indique la letra a buscar:")
        letra_reemplazo = input("Indique la nueva letra:")
        nuevo_texto = textoTransfor.replace(letra_busqueda,letra_reemplazo)
    elif opcion == 6:
      usoSlices()
def usoSlices(texto):
    texto = texto[::2]
    return texto
    

if __name__ == '__main__':
    '''
    menu = """
    Seleccionoe opcion:
    1-> Cambiar a mayuscula
    2-> Cambiar a minuscula
    3-> Primera letra en mayuscula
    4-> Eliminar espacios
    5-> Reemplazar letras de un texto
    6-> usoSlices
    7-> Cadena al reves
    7-> Salir
    """
    
    texto = "Ingrese texto: "
    print(seleccionOpcion(int(menu), texto))
    """ '''
    print(usoSlices(input("Ingrese texto: ")))