def run():
    seleccion = int(input('seleccione opcion: 1-> uso continue 2-> uso break rango 3-> uso break cadena: '))
    if seleccion == 1:
        usoContinue()
    elif seleccion == 2:
        usoBreak()
    else:
            print('Opcion invalida')

def usoContinue():
    for contador in range(1000):
        if contador %2 != 0:  #unicamente imprime los pares
            continue # lo que esta despues de continue no se va a ejecutar y continua en la siguiente es decir cada vez que encuentre un impar
        print(contador)

def usoBreak():
    for i in range(1000):
        print(i)
        if i == 475:
            break

def controlaCadena(texto):
    contador = 0
    for letra in texto:
        if letra == 'o':
            contador += 1
            
if __name__ == '__main__':
    run()