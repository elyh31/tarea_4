
public class Ejercicios {
	
	//Devuelve el valor almacenado en el indice posicion
	static int obtenerValor(int arreglo[], int posicion)
	{
		return arreglo[posicion];
	}
	
	//Devuelve el valor almacenado en el indice posicion
	static String obtenerValor(String arreglo[], int posicion)
	{
		return arreglo[posicion];
	}
	
	//Devuelve la suma de todos los elementos del arreglo
	static int obtenerSuma(int arreglo[])
	{
		int suma = 0;
		for (int x=0; x<arreglo.length; x++)
		{
			suma = suma + arreglo[x];
		}
		return suma;
	}
	
	//Devuelve el promedio de todos los elementos del arreglo
	static int obtenerPromedio(int arreglo[])
	{
		int suma = 0;
		for (int x=0; x<arreglo.length; x++)
		{
			suma = suma + arreglo[x];
		}
		return suma / arreglo.length;
	}
	
	//Devuelve true si valor esta 
	static boolean existe(char arreglo[], char valor)
	{
		for (int x=0; x<arreglo.length; x++)
		{
			if (arreglo[x] == valor)
			{
				return true;
			}
		}
		return false;
	}
		
	//Devuelve true si valor esta 
	static boolean existe(String arreglo[], String valor)
	{
		for (int x=0; x<arreglo.length; x++)
		{
			if (arreglo[x].equals(valor))
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       	
		
	}

}
