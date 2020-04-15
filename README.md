# Sistema-Productor---Consumidor
Sistema de Productor - Consumidor, simulación de cervecería con hilos.

-------------------------------------------------------------------------------------------------------------------------------------------

1) ¿Cuántos consumidores se necesitan para que el stock llegue a 0?

En mi caso cree un solo consumidor que puede consumir cuantas veces quiera la cantidad de cervezas que quiera, es un número generado de manera aleatoria. Por lo que, la cantidad de veces que debe consumir cerveza el consumidor para que el stock llegue a 0, es relativo a cada vez que se ejecuta el sistema.

2) Los bloques synchronized, ¿por qué deben serlos?

Para asegurar la exclusión mutua, y que el consumidor y el productor (hilos), no puedan acceder a la cervecería (recurso compartido) al mismo tiempo.

3) Explicar el recurso compartido.

El recurso compartido en este sistema producto - consumidor es la cervecería (BeerHouse), el BeerConsumer (consumidor) y el BeerProducter (productor) realizan cambios en dicho recurso compartido, reabasteciendo el stock de la cervecería en el caso del productor y consumiendo dicho stock en el caso del consumidor. El sentido de que la cervecería sea compartida, es para que ambos realicen acciones sobre una única cervecería y no crear una para cada uno haciendo que realicen dichas acciones en dos distintas.

4) Explicar las 3 formas de instanciar un Thread.

Las tres formas de instanciar un Thread son:

* Haciendo un new, poniendo en el constructor como parámetro el new de un objeto que implemente Runnable y extienda de otra clase o que bien extienda de Thread, para poder utilizar el método start() e iniciar su ejecución.

* Implementándolo, que una clase implemente la interfaz Runnable, dejando así libre la opción de que dicha clase herede de otra, para poder utilizar el método start() e iniciar su ejecución.

* Extendiéndolo, que una clase extienda de Thread para poder utilizar el método start() e iniciar su ejecución.
