def mayusculas(cadena):
    nuevaCadena = cadena.upper()
    return nuevaCadena
    
def minusculas(cadena):
    nuevaCadena = cadena.lower()
    return nuevaCadena




if __name__ == "__main__":
    texto = input("Ingrese texto a transformar")
    print("El texto " + texto + "en mayusculas: " + mayusculas(texto))
    print("El texto " + texto + "en minusculas: " + minusculas(texto))
    
    