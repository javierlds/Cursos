#Python es un lenguaje interpretado es decir necesita de un 3 programa

#TIPOS DE DATOS EN PYTHON

"""
Simple:
    Entero, int
    Real, float
    Booleano, bool
    Caracter, char

Compuesto:
    tablas, arrays, string
    estructura, record
    tupla, string, inmutable
    lista, diccionario, set(dinamico, mutable)

"""
def asignaValores():
    nada   = None
    cadena = "cadena de ejemplo"
    entero = 99
    entero2= 100
    evalua = True
    evalua2 = False
    #mostrar tipo de dato
    print(type(entero2))
    print(type(nada))
    print(type(cadena))
    print(type(entero))
    print(type(evalua))
    print(type(evalua2))

def recibeParametros(nombre, edad):
    saludo = 'hola {}, tienes {} años'.format(nombre,edad)  #concatena parametros a la cadena
    print(saludo)


if __name__ == '__main__':
    nombre = input("Ingrese nombre:")
    edad = input("Ingrese edad:")
    asignaValores()
    recibeParametros(nombre,edad)
