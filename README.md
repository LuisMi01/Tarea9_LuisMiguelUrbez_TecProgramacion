# Tarea9_LuisMiguelUrbez_TecProgramacion

## Repositorio de github: https://github.com/LuisMi01/Tarea9_LuisMiguelUrbez_TecProgramacion

## Ejercicios:
1. El alquiler de bicis
El objetivo es crear un programa que permita a una empresa de alquiler de bicicletas, mostrar los modelos que se ofrecen en alquiler y los precios.

Se pueden alquilar bicicletas, segways y giroscopios. Para todos, es necesario conocer su marca, modelo y fecha de compra. Las bicicletas están equipadas con un sistema de cambio de marchas. Algunas tienen más velocidades que otras. Los segways y los giroscopios tienen cierta autonomía en kilómetros. Debido a su manillar, el Segway requiere que su piloto tenga una altura mínima.

Puede suponer que dispone de una clase LocalDate que permite gestionar la fecha de compra.

a. Las clases y sus atributos
Definir las clases necesarias para representar los distintos ciclos ofrecidos para el alquiler. Indicar los diferentes atributos de estos últimos y el posible carácter abstracto de determinadas clases.

b. Los métodos
Es necesario conocer la tarifa de alquiler de todos los ciclos.

bici

tarifa horaria de alquiler

bicicleta

4,90 €

segway

18,90 €

giroscopios

29,90 €

Agregar a las clases anteriores los métodos abstractos y concretos, necesarios para ello. También agregue un constructor y un método que será útil para mostrar estas bicis en cada uno de ellos.

c. Las normas
Todos los ciclos que se ofrecen en alquiler se almacenan en una tabla.

A continuación, se mostrará una vista previa de la pantalla que se genera cuando se navega por la tabla que contiene las bicis:

Estos son los ciclos que ofrecemos en alquiler:

- Bicis Lapierre speed 400 (1 año) 27 velocidades                  4,90€/hora 
- Bicis Btwin riverside 900 (0 años) 10 velocidades                4,90€/hora 
- Giroscpio Segway Nine (0 años) 40 km de autonomía [1h50 min]     9,90€/hora 
- Giroscopio Weebot Echo (1 año) 35 km de autonomía [1h60 min]     9,90€/hora 
- Segways Immotion v8 (0 años) 40 km de autonomía                 18,90€/hora 
- Segways Segway Ninebot One E+ (0 años) 
  30 km de autonomía                                              18,90€/hora 
2. Velocidad media versión plurilingüe
Requisitos previos: ejercicio 4 del capítulo El pseudocódigo

Reanudar el ejercicio del cálculo de la velocidad media para hacerlo plurilingüe.

El algoritmo, primero pide al usuario el idioma y luego se comunica con él en ese idioma.

Para hacer esto, cree una interfaz Traduccion que contenga cuatro métodos abstractos, introducirDistancia(), introducirTiempo(), inicioRespuesta() y finRespuesta(). Cree una clase que implemente esta interfaz para cada idioma deseado. Finalmente modifique el algoritmo en consecuencia
