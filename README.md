# Explicación de Ejercicios De recursión con enteros para practicar

## 1 Devuelve la suma de todos los numeros entre 1 y n. 
(`public static int factorial(int number)`) :
Esta función suma el número que le pasamos más todos los números que tiene por debajo hasta llegar al 1.

Por ejemplo:Si llamamos a (`factorial(3)`), la función va a desarmar el problema en: 3 + 2 + 1. El resultado final que debe devolver es 6.

¿Por que ? 
Para que la función no se quede corriendo para siempre en un ciclo infinito, le ponemos una **condición de finalización**
(`if(number == 0){ return 0; }`)
Si el número llega a 0, la función se detiene y devuelve 0.

si no entra en esta codición , entonces:

(`factorial(3)`) guarda el 3 y lo suma a lo que me dé (`factorial(2)`)
Para saber cuánto es (`factorial(2)`), guarda el 2 y abre (`factorial(1)`)
Para saber cuánto es (`factorial(1)`), guarda el 1 y abre (`factorial(0)`)
Como (`factorial(0)`) choca con la **condición de finalización**, devuelve 0.

Ahora que llegó al final, la computadora vuelve hacia atrás sumando todo lo que dejó en espera:
(`3 + 2 + 1 + 0 = 6`)

## 2 Imprime por pantalla los números entre 1 y n (en orden ascendente).   
(`void imprimirDesde(int n) `)
¿Que hace? : usa recursividad para mostrar los números desde el 1 hasta el número que elijamos.

La función comienza con un **condición de finalización** para que no se converta en un bucle infinito.

(`if(n == 0){return;}`) 
está vez el retorno está vacío debido a que la función es **void** osea que no debe retornar nada.

si (`n`) no es 0 entonces **deja la impresión por consola para mas tarde** y vuelve a llamarse a si misma
restandole 1 a (`n`) , si empezamos con 3 , el proceso que sigue es el siguente : 

n = 3 : Deja en espera (`.print(n)`) y llama a (`imprimirDesde(2)`)
n = 2 : Deja en espera (`.print(n)`) y llama a (`imprimirDesde(1)`)
n = 1 : Deja en espera (`.print(n)`) y llama a (`imprimirDesde(0)`) (finaliza el proceso)

pero en n = 0 caso se topa con la **condición de finalización**,
finalizando el proceso.

Cuando llegó al final , vuelve hacia atrás e imprime todo lo que guardó en este orden : 
1 - 3 
2 - 2 
1 - 1 
de esta forma obtenemos una impresión ascendente desde 1 hasta (`n`)



## 3 Imprime por pantalla los números entre 1 y n (en orden descendente). 
Este ejercicio es igual al anterior , con la difrencia que se debe imprimir del más grande hasta el mas pequeño

Ejercicio anterior : 1 - 2 - 3
Ejercicio actual : 3 - 2 - 1 

lo único que se modifica es la posición de (`System.out.println(number);`) , en este ejercicio se coloca antes del
llamado a la función (`imprimirDesde(n-1)`)

de esta manera se imprime inmediatamente el valor inicial 3 
posteriormente se llama a la función (`imprimirDesde(2)`) 
Se imprime el valor 2 
se llama a la función (`imprimirDesde(1)`) 
Se imprime el valor 1 
se llama a la función (`imprimirDesde(0)`) 
finaliza el proceso.

## 4 Devuelve la suma de todos los numeros elevados al cuadrado entre 1 y n. 
Función (`public static int sumaDeCuadradosHasta(int n) `) suma  los números al cuadrado desde el 1 hasta 
el número que elijamos.

Comienza con una **condición de finalización** , si n=0 retorna 
(`if(n == 0) {return n;}`) para evitar que se forme un bucle infinito.

Si n no es 0 entonces incializa una variable de tipo entero 
(`int valor = n * n;`) con la finalidad de hacer un poco más legible el código .
la variable (`valor`) conteiene el cuadrado del valor incial , por ejemplo : 3²= 9 

y retorna la suma de (`valor + sumaDeCuadradosHasta(n-1)`) 

Como se gestióna esto ? 

Si le pasamos 3 como parametro :

Primera vuelta
1 - (`Valor = 9 // por que 3²=9 `) 
2 - (`Valor + sumaDeCuadradosHasta(2)`) 
para proseguir deja la suma para despúes y vuelve a ejecutar (`sumaDeCuadradosHasta(2)`) 

Segunda vuelta 
1 -(`Valor = 4 // por que 2²=4 `)
2 -(`Valor + sumaDeCuadradosHasta(1)`)

Tercera vuelta 
1 -(`Valor = 1 // por que 1²=1 `)
2 -(`Valor + sumaDeCuadradosHasta(0)`)

En la tercera vuelta finaliza el ciclo , ahora vuelve atrás y hace las cuentas que le quedaron pendientes :

**9 + 4 + 1 = 14**
como resultado final nos devuelve **14**

## 5 Función recursiva que replica la sucesión de Fibonacci 
(`public static int fibrec(int n)`) sucesión de Fibonacci expresa la siguiente formula :

funcion(numero -1) + funcion(numero-2) 

por ende se espera que el valor (`n`) de la función vaya disminuyendo , teniendo en cuenta esto establecemos
una **condición de finalización** obligatoria para evitar un bucle infinito  .
(`if (n <= 1) {return n;}`) si el numero es menor o igual a 1 entonces finaliza el proceso. 

si n es mayor a 1 entonces retorna (`return fibrec(n - 1) + fibrec(n - 2);`) 
llama 2 veces a la función en este retorno , siguiendo la formula de la sucesión 
**(funcion(numero -1) + funcion(numero-2) )**

por ende deja la cuenta para despues y llama nuevamente a **fibrec(n - 1)** y  **fibrec(n - 2)**
hasta que n <=1 

la función hace algo como esto por detras : 

1 - fibrec(3) se divide en calcular fibrec(2) + fibrec(1)
2 - La computadora empieza resolviendo la primera rama, fibrec(2)
    2.1- fibrec(2) a su vez se divide en calcular fibrec(1) + fibrec(0)
3 - Se llega a las puntas de las ramas donde aparece la **condición de finalización** 
    fibrec(1) devuelve 1
    fibrec(0) devuelve 0

4 - La computadora empieza a sumar los resultados que guardó de abajo hacia arriba
    4.1 Resuelve la rama de fibrec(2) haciendo: 1 + 0 = 1
    4.2 Ahora vuelve a la división del inicio y le suma el fibrec(1)
    4.3 Suma los dos caminos principales: 1 (del camino de la izquierda) + 1 (del camino de la derecha) = 2

**La función nos devuelve 2**