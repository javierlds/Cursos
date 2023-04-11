import email
from unicodedata import name
from xml.dom.minidom import Document


class Account:
    id = int
    name      = int
    document  = str
    email     = str
    password  = str

    def __init__(self,name): # se debe poner self y luego todos los atributos
        self.name = name

        
