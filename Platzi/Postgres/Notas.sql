*************** COMANDOS BASICOS
\l => se ven las bd
\dt => ver las tablas de una bd
\c => para cambiar a otra bd ej=> \c productos
\d => ver la descripcion de la tabla EJ => \d clientes
\h => ver los cmandos SQL
	\h ALTER => se toma cualquier funcion seguido de \h y postgres muestra como 
	            se utiliza
				
				
\dn Listar los esquemas de la base de datos actual
\df Listar las funciones disponibles de la base de datos actual
\dv Listar las vistas de la base de datos actual
\du Listar los usuarios y sus roles de la base de datos actual

Comandos de inspección y ejecución
\g Volver a ejecutar el comando ejecutando justo antes
\s Ver el historial de comandos ejecutados
\s <nombre_archivo> Si se quiere guardar la lista de comandos ejecutados en un archivo de texto plano
\i <nombre_archivo> Ejecutar los comandos desde un archivo
\e Permite abrir un editor de texto plano, escribir comandos y ejecutar en lote. \e abre el editor de texto, escribir allí todos los comandos, luego guardar los cambios y cerrar, al cerrar se ejecutarán todos los comandos guardados.
\ef Equivalente al comando anterior pero permite editar también funciones en PostgreSQL

Comandos para debug y optimización
\timing Activar / Desactivar el contador de tiempo por consulta
Comandos para cerrar la consola
\q Cerrar la consola				
				
select version(); => muestra la version de la base de datos			
\g => ejecuta la ultima consulta ejecutada
\timing => indica cuando se demoro una consulta

***********ARCHIVOS DE CONFIGURACION
para consultar los archivos SHOW config_file;

postgresql.conf => configuracion general de la bd
pg_hba.conf   => Configuracion de roles y metodo de acceso / quien se conecta o no si es remoto o local
pg_ident.conf  => que usuario local del sistema operativo corresponde a un usuario de la bd


********************* TIPOS DE DATOS
Serial => me sirve para autorincrementar cuando se haga un insert
Numericos
monetarios
texto
binarios
fechaHora
BOOLEAN

Especiales
geometricos
direccion de red
texto tipo
xml json
arreglos



