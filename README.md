## Conocimientos SQL (20 Puntos)

- Explique brevemente para que sirve una vista. (2 Puntos)

Es el resultado de una consulta SELECT

- Cuál es el objetivo de un JOB? (2 Puntos)

Automatizar tareas rutinarias en la base de datos



- Explique cuál es la característica y en qué se diferencia: TRUNCATE, DELETE, DROP (2 Puntos)



> TRUNCATE: su función es eliminar todos los registros o elementos de una tabla

> DELETE: Elimina registros o elementos basándose en una condición dada

> DROP: Elimina una tabla o cualquier objeto de la base de datos y todos los registros

La diferencia entre estas sentencias SQL son las siguientes TRUNCATE solo borra los elementos de la tabla y no genera logs que permiten revertir la operación realizada, DELETE solo borra elementos de la tabla y genera logs que permiten revertir la operación, DROP borra la tabla y los elementos y la operación es irreversible



- Si se tiene una lista de números desordenada { 8,1,7,2,0,3,6,4,5,9} y se desea obtener como único resultado el dato con mayor valor, ¿Cuál de las funciones de SQL se debe utilizar? (2 Puntos)

Se puede utilizar la función MAX() devuelve el valor máximo  de un conjunto de valores


- Para qué se utiliza la cláusula Having (2 Puntos)

Se utiliza junto con GROUP BY para filtrar grupos de datos junto con condiciones aplicadas con funciones de agregacion, pero se puede utilizar sin GROUP BY para consultas que no agrupan datos



Utilice las siguientes tablas, construir las consultas que se solicitan a en los ítems 6 y 7.

Construir el Query que permita obtener los siguientes datos:

6. De la tabla PRUEBAESTUDIANTE se desea saber el nombre de las especialidades registradas y la cantidad de veces que existe en la tabla. (5 Puntos)


SELECT
especialidad,
COUNT(*) AS cantidad
FROM pruebaestudiante
GROUP BY especialidad;


7. Se requiere consultar cuales son las inscripciones que tienen horario M-F9. (5Puntos)












## Ejercicio HTML y CSS3 (10 Puntos)



Página principal

Diagrama una página principal index.html tomando en cuenta las siguientes especificaciones y utilizando estilos que permitan identificar las fortalezas en maquetado y hojas de estilos:



1. Título te sugerimos coloques el título de tu documento, "Hoja de Vida" o "Curriculum Vitae" o "Resumen Curricular". utilizando la etiqueta h1. (1 Puntos)



2. Datos Personales indica tus nombres, apellidos, fecha y lugar de nacimiento utilizando las etiquetas h2 y h3. (1 Puntos)



3. Enlaces de menú básico para enlazar las tres páginas que tiene tu proyecto: Inicio (index.html), educación (educacion.html). (2 Puntos)



4. Incorpora un título en h2 Información Personal y agrega una Foto de tu preferencia acorde con tu hoja de vida. (2 Puntos)



5. Perfil redacta un parráfo y describe habilidades y destrezas que te definen como un exitoso profesional en tu área de conocimiento y agrega una lista no numerada (viñetas) con los idiomas que comprendes, hablas y escribes. (2 Puntos)



Pie de Página en esta sección debes colocar información de contacto como: correo electrónico, teléfono, redes sociales o dirección. (2 Puntos) 


## Ejercicio de .Net Core, Java o Javascript (10 Puntos)



- Construir dos funciones en el lenguaje de programación seleccionado:
- Función para calcular el área de un triángulo teniendo las variables Base y Altura (5 pts):
- Función para calcular el área de un círculo, se envía como parámetro el radio del círculo (5 pts): 



## Ejercicio de Back (60 Puntos)



Construir Microservicio de gestión realizando CRUD con la tabla PRUEBAESTUDIANTE, del punto 5  en Java Sprint boot, .Net o Phyton...etc teniendo en cuenta las diferentes capas de persistencia, de datos y lógica de negocio. 

 
 
