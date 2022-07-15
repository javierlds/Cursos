import keyword

"""
Definicion de variables en python
python es un lenguaje debilmente tipado, porque no se pone el tipo de dato de la variable
"""
texto = "esto es una cadena"
texto = 1  #cambio el valor de la variable
numero = 5
decimal = 4.5
PI = 3.14 #Constante
print(texto)
print('Tipo de dato variable decimal: ' + str(type(decimal)))

"""
concatenar variables en python
"""
nombre = "javier"
apellido = "paez"
apellido2 = "cruz"
edad = 32

print(nombre + apellido + apellido2)
print(f"{nombre} {apellido} {apellido2} edad: {edad}")  #me permite mostrar cadenas de una manera mas limpia
print("Hola mi nombre es {} {} {} y vivo en bogota".format(nombre,apellido,apellido2))
print(nombre,apellido,apellido2,edad) #otra forma de concatenar


"""
para ver las palabras reservadas de python:
"""
print(keyword.kwlist)

''' 
Creacion de multiples variables en una sola linea
'''
nombre3, apellido3 = 'javier', 'paez'
print('El nombre2 es: ' + nombre3 + ' y apellido es: ' + apellido3)