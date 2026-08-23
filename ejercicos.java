package test2;

public class ejercicios {
	
	public static void main(String[]args) {
	
		System.out.println(fibrec(3));
	}
	
	// suma entre 1 y n 
	public static int factorial(int number){
		// return(number == 1) ? 1 : number + factorial(number-1);

        if(number == 0){ 
            return 0;
        }
        System.out.println(number);
        return  number + factorial(number-1);
	}
	
    //Imprime por pantalla los números entre 1 y n (en orden ascendente). 
    public static  void imprimirHasta(int n){
        if(n == 0){
            return; 
        }
        
        imprimirHasta(n-1);
        System.out.println(n);
    }

	// orden ascendente entre 1 y n (en orden descendente). 
	public static void imprimirDesde(int n) {
		
		if(n == 0) {
			return;
		}
		System.out.println(n);
		imprimirDesde(n-1);
	} 

	
	//Devuelve la suma de todos los numeros elevados al cuadrado entre 1 y n. 
	public static int sumaDeCuadradosHasta(int n)  {
		
		if(n == 0) {
			return n;
		}

        int valor = n * n;
		return  valor + sumaDeCuadradosHasta(n-1);
	}

	//  sucesión de Fibonacci 
	public static int fibrec(int n) {
		if (n <= 1) {
	        return n;
	    }
		return fibrec(n - 1) + fibrec(n - 2);
	}

	
	// elimina el primer caracter de un string
	public static String resto(String s) {
		String str = ""; 
		for (int i = 1; i < s.length(); i++) {
			str += s.charAt(i);
		}
		
		return str;
	}
	
	// imprime espaciado "jaun" => "j u a n"
	public static String imprimirEspaciado (String str) {
		
		if(str.length() == 0) {
			return str;
		}	
	
		System.out.print(str.charAt(0)+" ");
		
		return imprimirEspaciado(resto(str));
		
	}

	// imprime la longitud de la cadena
	public static int longitud(String s) {
		
		int counter = 0;
	
		while(!s.equals("")) {
			counter++;
			s = s.substring(1);
		}
		
		return counter;
	}

	// funcion recursiva que invierte una cadena ABC=>CBA
	public static void inverso(String s) {
		if(s.length() == 0) { return; }
		
		
		int lengthStr = s.length()-1;
		char lastLetter = s.charAt(lengthStr);
		System.out.print(lastLetter);
		
		inverso( s.substring(0 , lengthStr));
	}
	
}