def run():
    numero = int(input("Ingrese numero: "))
    LIMITE = 1000 # Es una constante cuando lo dejo en mayuscula
    valorInicial = 1
    potencia = 1
    while potencia <= LIMITE:
        potencia = numero ** valorInicial
        print("Potencia de:" + str(numero) + " elevado a " + str(valorInicial) +" es:" + str(potencia))
        valorInicial += 1 #aumento en uno la variable inicial

if __name__ == '__main__':
    run()

