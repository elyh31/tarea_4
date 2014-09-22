
public class Ejercicios {
	
	//Devuelve el valor almacenado en el indice posicion
	static int obtenerValor(int arreglo[], int posicion)
	{
		//me devuelve el arreglo segun la posicion
		return arreglo[posicion];
	}
	
	//Devuelve el valor almacenado en el indice posicion
	static String obtenerValor(String arreglo[], int posicion)
	{
		//me devuelve el arreglo segun la posicion
		return arreglo[posicion];
	}
	
	//Devuelve la suma de todos los elementos del arreglo
	static int obtenerSuma(int arreglo[])
	{
		int suma = 0;
		//el ciclo corre todo el arreglo
		for (int x=0; x<arreglo.length; x++)
		{
			//este es para ir sumando el valor de cada arreglo
			suma = suma + arreglo[x];
		}
		//devuelve la suma total de todo el arreglo
		return suma;
	}
	
	//Devuelve el promedio de todos los elementos del arreglo
	static int obtenerPromedio(int arreglo[])
	{
		int suma = 0;
		//el ciclo corre todo el arreglo
		for (int x=0; x<arreglo.length; x++)
		{
			//este es para ir sumando el valor de cada arreglo
			suma = suma + arreglo[x];
		}
		//divide la suma de los valores de todos los arreglos por la cantidad de arreglos existentes
		return suma / arreglo.length;
	}
	
	//Devuelve true si valor esta 
	static boolean existe(char arreglo[], char valor)
	{
		//el ciclo corre todo el arreglo
		for (int x=0; x<arreglo.length; x++)
		{
			// me dici verdadero si el valos existe en algun arreglo
			if (arreglo[x] == valor)
			{
				return true;
			}
		}
		// me dici falso si el valos no existe en algun arreglo
		return false;
	}
		
	//Devuelve true si valor esta 
	static boolean existe(String arreglo[], String valor)
	{
		//el ciclo corre todo el arreglo
		for (int x=0; x<arreglo.length; x++)
		{
			// me dici verdadero si el valos existe en algun arreglo
			if (arreglo[x].equals(valor))
			{
				return true;
			}
		}
		// me dici falso si el valos no existe en algun arreglo
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       	
		
	}

}
