# TP-TSB-2018


*Listas de desborde
*Direccionamiento abierto para la resolucion de colisiones

implementar una clase TSB_OAHashtable

implementar interface Map<K, V> y desde ella los mismos metodos 
q se implementaron para TSBHashtable

Definir entro de TSB_OAHashtable la clase interna Entry q implemente la 
interface Map.Entry<K, V>

Dentro de TSB_OAHashtable 3 clases internas para gestionar las vistas 
stateless de claves, de valores y de pares de la tabla incluyendo en 
ellas las clases interas para representar a los iteradores asociados a cada vista

Redefinir en TSB_OAHashtable los metodos equals(), hashCode(), clone(), toString()

Definir en TSB_OAHashtable los metodos rehash() y contains(value)


MODELO FICHA 10

Luego, programa que procese un conj de archivs de textp y construya una tabla hash 
con todas las palabras diferentes descubiertas en esos archivos, determinar la frecuencia
de aparicion de cada palabra en esos archivos.
Key palabra detectada y value frecuencia de aparición.

REQUERIMIENTOS
-Interfaz Java FX
-Procesamiento de archivos eficiente
-Grabar en un archivo serializado la tabla hash una vez generada y permitir recuperarla desde ese archivo
Al terminar de crearla la fravo por serializacion de forma automatixa y cada vez q ejecuto el  programa 
levantar la tabla automaticamente desde el archivo serializado a menos q este no exista
-Mostrar en todo momento la cant total de palabras distintas q contiene la tabla. 
Permitir ingresar en un campo de texto una palabra en la tabla y mostrar su frecuencia de aparición.
-Permitir agregar documentos nuevos. Se debe ejecutar el programa, levantar la tabla serializada y debe 
permitir que se agreguen archivos y se actualice la tabla con las nuevas frecuencias y palabras nuevas.

CADA INTEGRANTE DEBE SUBIR SU COPIA DEL TRABAJO EN UN COMPRIMIDO CONTENIENDO EL PROYECTO Y EL ARCHIVO 
SERIALIZADO CON LA TABLA GRABADA.
NOMBRE DEL ARCHIVO: Apellido1-Apellido2-Apellido3-Apellido4.zip (o .rar)





