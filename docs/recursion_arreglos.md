# Ejercicios con arrays para practicar

En esta tanda de ejercicos se utilizan funciones auxiliares , ya que los ejercicios nos piden desarrollar funciones con
parametros fijos (no podemos cambiar los enunciados) y para evitar utilizar herramientas más complejas hacemos uso 
de las funciones auxiliares , las cuales podemos crear a nuestro antojo , es decir , podemos pasarle los parametros que 
"faltan" para cumplir el objetivo del enunciado sin modificar la función principal. 
Como por ejemplo : 
* contadores de vueltas (`i`) 
* Acumuladores 
* etc . . .


### 1. Imprime por pantalla los elementos del arreglo.
* **Metodo :** `public static void imprimir(int[] a)`
* **Descripción:** La función debe imprimir por consola todos los elementos de un array (lista).

La función recibe un parametro
* **parametro esperado:** Arreglo numerico por ejemplo : {1,2,3}

solo se limita a llamar a la función auxiliar `imprimir_auxiliar(a , 0)` 

#### ¿Como funciona `void imprimir_auxiliar(int[] a , int i )`?
Recibe dos parametros 
* **Primer parametro `a` :** Array numerico : {1,2,3} (el mismo que la función principal)
* **Segundo parametro `i`:** Entero : 0

Comienza con una **condición de retorno (caso base)** obligatoria para evitar un ciclo infinito el cual no retorna nada
ya que es una función `void` (es decir no retorna nada) 

```java
if(a.length <= i){ // si el segundo parametro es mayor o igual al largo del array entonces finaliza
    return;
}
```
En caso que no se cumpla el **Caso Base** la función imprime por consola `a[i]` por ejemplo :

si `a` es un arreglo que contiene : `{1,2,3}` y por otro lado `i=0` entonces :
`a[i] = 1` => `a[0] = 1` 
Por ende imrpime el primer elemento , para posteriormente llamar nuevamente a `imprimir_auxiliar(a , i+1)` 

* **Primer llamado :** `imprimir_auxiliar({1,2,3} , 0)` => imprime 1 
* **Segundo llamado :** `imprimir_auxiliar({1,2,3} , 1)` => imprime 2 
* **Tercer llamado :** `imprimir_auxiliar({1,2,3} , 2)` => imprime 3 (En el tercer llamado entra en el **caso base**)

Al entrar en el **caso base** la función termina dejandonos por consola la siguiente impresión  : 

1
2
3

### 2. Suma los elementos de un arreglo.
* **Metodo :** `public static int suma(int[] a)`
* **Descripción:** La función retorna la suma de los elementos del arreglo ej : {1,2,3} => 1+2+3 = 6

La función recibe un parametro
* **parametro esperado:** Arreglo numerico por ejemplo : {1,2,3}
Solo se limita a llamar y retornar a `suma_auxiliar(a , 0);`

#### ¿Cómo funciona `public static int suma_auxiliar(int[] a , int i )`?
Recibe dos parametros 
* **Primer parametro `a` :** Array numerico : {1,2,3} (el mismo que la función principal)
* **Segundo parametro `i`:** Entero : 0

Comienza con una **condición de retorno (caso base)** obligatoria para evitar un ciclo infinito.
Esta condición retorna 0 debido a que la función debe retornar un entero
```java
if(a.length == i){
    return  0;
}
```
Si no entra en el caso base entonces la función retorna `a[i] + suma_auxiliar(a, i+1);` aplicando la recursividad

si el arreglo recibido es el siguiente : `a= {1,2,3}`  y  `i=0` entonces `a[i]` es igual a 1

* **Primera vuelta :** `suma_auxiliar(a , i=0 )`=> a[0]=1 entonces :   Deja la suma 1+ **lo que de el resultado de `suma_auxiliar`** para despúes
* **Segunda vuelta :** `2 + suma_auxiliar(a , i=1)` Deja la suma 2+  **lo que de el resultado de `suma_auxiliar`** para después 
* **Tercer vuelta :** `3 + suma_auxiliar(a , i=2) ` Deja la suma 3+  **lo que de el resultado de `suma_auxiliar`** para después
* **Cuarta vuelta :** `suma_auxiliar(a , i=3) ` Entra en el **caso base** entonces retorna 0 

Al entrar al **caso base** donde i=3 entonces comienza a hacer las sumas de la ultima hacia la primera por ejemplo : 
3+0 = 3
3+2 = 5 
5+1 = 6  

resultado final 6 (la suma de todos los elementos del arreglo )

### 3. Retorna True si el arreglo está ordenado sino false 
* **Metodo :** `public static boolean estaOrdenado(int[] a)`
* **Descripción:**  dado un arreglo de enteros, devuelve verdadero si el arreglo está ordenado crecientemente de menor a mayor, y falso en caso contrario.


La función `estaOrdenado` recibe un parametro
* **parametro esperado:** Arreglo numerico por ejemplo : {1,2,3}

Solo se limita a llamar y retornar a `estaOrdenado_auxiliar(a , 0)`

#### ¿Como funciona public static boolean  estaOrdenado_auxiliar(int[]a , int i)?
Comienza con una **condición de retorno (caso base)** obligatoria para evitar un ciclo infinito , la cual retorna `true` o `false`


```java
if(i+1 >= a.length){ // si el contador i es mayor o igual a el largo de la lista entonces retorna verdadero
    return  true; 
}
```
Retorna `true` porque significa que el arreglo/array está ordenado de menor a mayor => 1 , 2 , 5 

Luego se establece otro **caso base / condición de retorno** la cual expresa : 
```java
if(a[i] > a[i+1]){
    return false;
}
```
supongamos que `a[0]=2` , `a[1]=1` y son los primeros elementos del arreglo por ejemplo => {2,1,3}
este retorno corrobora que el primer elemento (2) sea mayor al segundo (1) en caso de que se cumpla esta condición retorna `false`
porque significa que el arreglo no está en orden. 

en caso que no entre en ninguna de las dos **condiciones de retorno** entonces se retorna `estaOrdenado_auxiliar`
pero esta vez a i se le suma 1 : `return  estaOrdenado_auxiliar(a, i+1)` 
con la finalidad de buscar los siguientes elementos en el arreglo 

suponiendo que nos dan el siguiente arreglo : {1,2,3}

Suponiendo que el arreglo recibido es `{1, 2, 3}` (cuyo largo `a.length` es 3):

* **Primera vuelta (`i = 0`):** Revisa `a[0]` (1) y `a[1]` (2).
  * ¿`0 + 1 >= 3`? Falso.
  * ¿`1 > 2`? Falso.
  * *No entra en ningún caso base:* Pasa a la siguiente posición sumando `i + 1` => Llama a `estaOrdenado_auxiliar(a, 1)`.

* **Segunda vuelta (`i = 1`):** Revisa `a[1]` (2) y `a[2]` (3).
  * ¿`1 + 1 >= 3`? Falso.
  * ¿`2 > 3`? Falso.
  * *No entra en ningún caso base:* Pasa a la siguiente posición sumando `i + 1`=> Llama a `estaOrdenado_auxiliar(a, 2)`.

* **Tercera vuelta (`i = 2`):** 
  * Aquí se evalúa el primer caso base: ¿`2 + 1 >= 3`? ($3 \ge 3$) **¡Verdadero!**
  * Como se cumple la condición de éxito, la función se detiene y devuelve `true`. El programa nunca llega a buscar una posición `a[3]` (lo cual daría un error porque esa posición no existe).

**Resultado final:** `true` (el arreglo está perfectamente ordenado).
