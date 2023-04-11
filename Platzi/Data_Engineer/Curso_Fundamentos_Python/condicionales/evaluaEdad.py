
import datetime

def solicitaDatos():
    ano = input("Año de nacimiento: ")
    mes = input("Mes de nacimiento: ")
    dia = input("dia de nacimiento: ")
    fecha = datetime.datetime(int(ano),int(mes),int(dia))
    print("Fecha nacimiento:" + fecha)

def contarCaracteres(evaluaTexto):
    totletras = len(evaluaTexto)
    print("El texto tiene " + str(totletras))
        
def contarVocales(textoVocal):
    texto = textoVocal.lower()
    listaVocales = {} #declaracion de lista vacia
    for vocal in "aeiou":
       conteo  = texto.count(vocal)   #count -> required to parameter. Required. Any type (string, number, list, tuple, etc.). The value to search for.
       listaVocales[vocal] = conteo
    print(listaVocales)
    
def eliminarVocales(textoElimina):
    texto = textoElimina.lower()
    for vocal in "aeiou":
        print(vocal)
        texto = texto.replace(vocal,'')
    print(texto)

# para relleno colocar pass -> signfica cualquier cosa


if __name__ == '__main__':
    opcion = int(input("""
                       1 - Calcular fecha nacimiento
                       2 - Contar caracteres de un texto
                       3 - Contar las vocales de una palabra
                       4 - eliminar las vocales
                       5 - Salir  
                       """))
    if opcion == 1:
        solicitaDatos()
    elif opcion == 2:
        texto = input('Ingrese texto: ')
        contarCaracteres(texto)
    elif opcion == 3:
        texto =input('Ingrese texto: ')        
        contarVocales(texto)
    elif opcion == 4:
        texto = input('Ingrese texto: ')
        eliminarVocales(texto)
        
        

