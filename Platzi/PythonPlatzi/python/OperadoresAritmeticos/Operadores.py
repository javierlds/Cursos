import math

def evalua(opcion):
    match opcion:
        case 1:
            suma()
        case 2:
            resta()
        case 3:
            multiplica()
        case 4:
            division()
        case 5:
            potencia()
        case 6:
            precedencia()
        case _:
            return "Opcion invalida"

def suma():
    val1 = int(input("Ingrese numero1:"))
    val2 = int(input("Ingrese numero2:"))
    resultado =  val1 + val2
    print("La suma de " + str(val1) + " + " +str(val2) + " es igual a: " + str(resultado) )

def resta():
    val1 : int(input("Ingrese numero1:"))
    val2 : int(input("Ingrese numero2:"))
    resultado :  val1 - val2
    print("La resta de " + str(val1) + " - " +str(val2) + " es igual a: " + str(resultado) )

def multiplica():
    val1 = int(input("Ingrese numero1:"))
    val2 = int(input("Ingrese numero2:"))
    resultado =  val1 - val2
    print("La multiplicacion de " + str(val1) + " x " +str(val2) + " es igual a: " + str(resultado) )

def division():
    val1 = int(input("Ingrese numero1:"))
    val2 = int(input("Ingrese numero2:"))
    resultado =  val1 / val2
    print("La division de " + str(val1) + " / " +str(val2) + " es igual a: " + str(resultado) )
    resultado =  val1 // val2
    print("La division de " + str(val1) + " // " +str(val2) + " es igual al resultado entero: " + str(resultado) )
    resultado =  val1 % val2
    print("El sobrante de La division de " + str(val1) + " // " +str(val2) + " es igual:  " + str(resultado) )

def potencia():
    val1 = int(input("Ingrese numero1:"))
    val2 = int(input("Ingrese numero2:"))
    resultado =  val1 ** val2
    print("La potencia de " + str(val1) + " a la  " +str(val2) + " es igual a: " + str(resultado) )

def precedencia():  # primero parentesis, potencias y raices, multiplicaciones y divisiones y por ultimo la suma o resta
    val1 = 5
    val2 = 6
    val3 = 7
    val4 = 9   
    operacion = val1 + val2 * val3 / 9
    print("el resultado es: " + str(operacion))

def raizCuadrada():
    val1 = int(input("Ingrese numero para raiz cuadrada:"))
    resultado = math.sqrt(val1)
    print("La raiz cuadrada de + " + str(val1) + " es: " + str(resultado))

if __name__ == '__main__':
    opcion = int(input('Seleccione opcion:  1.Suma, 2.Resta, 3.Multiplicacion, 4.Division, 5. Potencia, 6. '))
    evalua(opcion)