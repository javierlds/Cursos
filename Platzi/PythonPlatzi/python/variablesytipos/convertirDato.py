"""
int()   -> convierto a entero
str()   -> convierto a cadena
float() -> convierto a variable flotante
input -> puedo solicitar datos desde la consola
"""


def conviertoEntero():
    #Convierto a entero
    numero1 = input("Ingrese numero1: ")
    numero2 = input("Ingrese numero2: ")
    suma = int(numero1) + int(numero2)
    print(suma)

def conviertoCadena():
    #convierto a cadena
    numeroOpcional = int(input("Ingrese numero: "))
    print("el texto es: " + str(numeroOpcional))

def conviertoFlotante():
    #convierto a flotante
    numeroFlotante = "4.5"
    print(type(numeroFlotante))

def conviertoBoolean():
    #convierto a booleano
    print("Pendiente....")

if __name__ == "__main__":
    menu = """Seleccione opcion:
           [1] Convertir a entero
           [2] Convertir a cadena
           [3] Convertir a flotante
           """
    if menu == 1:
        conviertoEntero()
    elif menu ==2:
        conviertoCadena()
    elif menu ==3:
        conviertoFlotante()
    else:
        print("Opcion invalida..")


