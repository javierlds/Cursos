"""
Equals: a==b
Not Equals: a != b
Less than a < b
Less than or equal to: a <= b
Greater than: a > b
Greater than or equal to: a >= b
"""

def mayorDosNumeros():
    numero1 = int(input("Indique numero1: "))
    numero2 = int(input("Indique numero2: "))
    if numero1 > numero2:
        texto = "El numero " + str(numero1) + " es Mayor al numero: " + str(numero2)
    else:
        texto = "El numero " + str(numero2) + " es Mayor al numero: " + str(numero1)
    return texto

if __name__ == '__main__':
    print(mayorDosNumeros())
