#Numero primo: solo se puede dividir entre1 y el mismo si tiene mas de 2 divisores se le llama compuesto

def run():
    listadoPrimos()


def listadoPrimos():
    divisor = 6
    conteo = 0
    primo  = []
    for i in reversed(range(divisor)):
        for b in reversed(range(divisor)):
        
            print('i: '+ str(i) + '% i:' + str(b))
            if i == 1:
                break
            else:
                if divisor%i== 0:
                    conteo +=1
                if conteo == 2:
                    primo.append(i)
    resultado =primo
    for b in resultado:
        print('Numeros primos: ' + str(b))


if __name__ == '__main__':
    run()


#
#1- Sacar el rango de 1 a100
#2- Tomar el rango y dividirlo por cada numero menor a el
#3- Contar el modulo = 0 sea igual o menor a 2