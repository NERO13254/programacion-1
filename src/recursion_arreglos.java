
public class  recursion_arreglos{

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        imprimir(array);
    }

    //1 : Imprime por pantalla los elementos del arreglo.
	public static void imprimir(int[] a){
		imprimir_auxiliar(a , 0);
	}
    // 1.1 Función auxiliar de imprimir
    public static  void  imprimir_auxiliar(int[] a , int i ){
        if(a.length <= i){
            return;
        }

        System.out.println(a[i]);
        imprimir_auxiliar(a, i+1);
    }

	// 2:  Hacer una función recursiva que sume los elementos de un arreglo.
	public static int suma(int[] a){
		return suma_auxiliar(a , 0 );
	}
    // 2.1 Funcion auxiliar 
    public static int suma_auxiliar(int[]a , int i){
        if(a.length == i){
            return  0;
        }

        return a[i] + suma_auxiliar(a, i+1);
    } 


	// 3: dado un arreglo de enteros, devuelve verdadero si el arreglo 
	// está ordenado crecientemente de menor a mayor, y falso en caso contrario.
	public static boolean estaOrdenado(int[] a){
		return  estaOrdenado_auxiliar(a , 0);
	}

	// 3.1 funcion auxiliar para estaOrdenado
	public static boolean  estaOrdenado_auxiliar(int[]a , int i){
		
		if(i+1 >= a.length){
			return  true;
		}

		// {1 , 2 , 3}
		if(a[i] > a[i+1]){
			return false;
		}

		return  estaOrdenado_auxiliar(a, i+1);	
	}


	// 4 : dado un arreglo de enteros y un entero, cuenta la cantidad de veces que aparece n en a.
	public static int cantidadApariciones(int[] a, int n){
		return  cantidadApariciones_busqueda(a , n , 0 , 0);
	}
	// 4.1 funcion auxiliar recursiva que busca si n aparece en el array
	public static  int  cantidadApariciones_busqueda(int[]a , int n , int i , int contador ){
		if(i +1> a.length) { return contador; }

		if( i > a.length || a[i] == n ){
			
			contador++;
			return  cantidadApariciones_busqueda(a, n, i+1, contador);
		}
		return cantidadApariciones_busqueda(a, n, i+1, contador);

	}


	// 5 : Dado un arreglo, hacer una función que devuelva si un número está en el arreglo o no
	public static boolean pertenece(int[] a, int n){
		int encontrado = buscarEntero(a , n , 0);

		if(encontrado >0) {
			return  true;
		}

		return  false;
	}

	// 5.1 función auxiliar recursiva que recorre el array para buscar si n existe 
	public  static  int buscarEntero(int[]a , int n , int i){
		
		if( i+1 > a.length ){ 
			return 0; 
		}

		if(( a[i] )== n ){
			return  n;
		}

		return buscarEntero(a, n, i+1);
	}

}