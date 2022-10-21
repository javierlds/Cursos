def run():
    valCiclo = int(input('Ingrese valor del ciclo: '))
    num      = int(input('Ingrese numero a aplicar potencia: '))
    imprime(valCiclo,num)
    
    
def imprime(valorCiclo,numero):
    for x in range(valorCiclo):  #con range indico el rango del ciclo que necesito
        incremento = numero ** x  #potencia de un numero
        print("Numero " + str(numero) + " Elevado a la: " + str(x) +" =" + str(incremento))


def imprimeRango():
    for x in range(1,6):  #range puede tener dos parametros
        print(x)

def imprimeLista():
    valor = int(input('ingrese rango de lista: '))        
    valor2 = list(range(valor))  #esta linea me imprime el listado de ese rango
    print(valor2)
    
def recorreString():
    nombre = input('Ingrese nombre:')
    valorLetra = 0
    for x in nombre:
        if x in('a','e','i','o','u'):
            valorLetra += 1
        print("Letra " + x + "=" + str(valorLetra))

def pruebaFor():
    for i in range(3):
      print(i)
    
        

if __name__ == '__main__':
  #  recorreString()
    pruebaFor()
    #imprimeRango()
    #imprimeLista()
    #run()