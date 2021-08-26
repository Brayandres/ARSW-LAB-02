# ARSW-LAB-02

## Parte I
1. Revise el programa “primos concurrentes” (en la carpeta parte1), dispuesto en el paquete edu.eci.arsw.primefinder. Este es un programa que calcula los números primos entre dos intervalos, distribuyendo la búsqueda de los mismos entre hilos independientes. Por ahora, tiene un único hilo de ejecución que busca los primos entre 0 y 30.000.000. Ejecútelo, abra el administrador de procesos del sistema operativo, y verifique cuantos núcleos son usados por el mismo.

![](./img/img1.png)
![](./img/img2.png)

2. Modifique el programa para que, en lugar de resolver el problema con un solo hilo, lo haga con tres, donde cada uno de éstos hará la tarcera parte del problema original. Verifique nuevamente el funcionamiento, y nuevamente revise el uso de los núcleos del equipo.

![](./img/Parte1_1Threads.png)
![](./img/Parte1_3Threads.png)

## Parte III

2. Una vez corregido el problema inicial, corra la aplicación varias veces, e identifique las inconsistencias en los resultados de las mismas viendo el ‘ranking’ mostrado en consola (algunas veces podrían salir resultados válidos, pero en otros se pueden presentar dichas inconsistencias). A partir de esto, identifique las regiones críticas () del programa.

**ultimaPosicionAlcanzada**

3. Utilice un mecanismo de sincronización para garantizar que a dichas regiones críticas sólo acceda un hilo a la vez. Verifique los resultados.

![](./img/img3.png)