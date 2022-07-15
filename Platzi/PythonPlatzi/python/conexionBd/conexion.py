import cx_Oracle
import pandas as pd

def lecturaArchivos():
    data = pd.read_excel(r'D:\Stefanini\Proyectos\DEPOSITOS_JUDICIALES\CARGUE_HU\CargueIntereses.xls')
    df = pd.DataFrame(data)
    print(df)

    


def conexionOracle():
    connection = cx_Oracle.connect(
    user="SCH_ORCL_DEPJUD_CORE",
    password="SCH_ORCL_DEPJUD_CORE",
    dsn="172.16.11.82/ORCL_DEPJUD_CORE")

    print("Successfully connected to Oracle Database")

    cursor = connection.cursor()
    for row in cursor.execute('select * from HISTORICO_PERIODO'):
        print(str(row[0]) + ' ' + str(row[1]))
    

if __name__ == "__main__":
#    conexionOracle()
    lecturaArchivos()