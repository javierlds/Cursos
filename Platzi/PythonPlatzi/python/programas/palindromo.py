
def palindromo(palabra):
    palabra = palabra.lower().replace(' ','') #elimino los espacios
    palinvertida = palabra[::-1]
    if palabra== palinvertida:
        return True
    else:
        return False

def run():
    palabra = input("Escribe una palabra:  ")
    valPalindromo = palindromo(palabra)
    if valPalindromo:
        print("Es palindromo....")
    else:
        print("No es palindromo....")

if __name__ == '__main__': #punto de entrada del programa
    run()
    
    


