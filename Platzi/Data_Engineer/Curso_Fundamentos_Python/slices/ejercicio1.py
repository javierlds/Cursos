def run():
    nombre = input('ingrese texto:')
    slice1 = nombre[0:3]  #parametro 1-> de donde parto , parametro2: hasta donde quiero llegar
    slice2 = nombre[0:5:2] #parametro 3-> voy de pasos de 2 en 2
    slice3 = nombre[::-1]  #si no coloco nada el slice va desde el inicio al final, y el -1 va hacia atras
    slice4 = nombre[::-2]
    print('slice1: ' + slice1)
    print('slice2: ' + slice2)
    print('slice3: ' + slice3)
    print('slice4: ' + slice4)


if __name__ == '__main__':
    run()