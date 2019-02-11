package co.com.bryan.datastructure;
import java.util.HashMap;
import java.util.Iterator;

public class HashMap1 {

	public static void main(String[] args) {
		/*
		 * se maneja estructura clave - valor permitiendo null en cualquiera de ellos
		 * 
		 * los codigos se almacenan sin un orden definido, usando como identidficador
		 * su codigo hash
		 * 
		 * HashMap no es sincronizado, permitiendo el acceso de mas de una tarea al mismo
		 * tiempo
		 * 
		 * Al no ser sincronizado se tienen mejoras de rendimiento a nivel de tiempo
		 * de acceso
		 * 
		 * 
		 * tambein puede implementar de la interfaaz map
		 * recorremos con la interfaz iterator
		 */
		HashMap<Integer, String> mapaNombres =new HashMap<Integer, String>();
		mapaNombres.put(null, "estoy");
		mapaNombres.put(133, "Test");
		mapaNombres.put(543, "tiando");
		
		/*
			System.out.println(mapaNombres.values());
			System.out.println(mapaNombres.keySet());
			System.out.println(mapaNombres);
			mapaNombres.put(123, null);
			System.out.println(mapaNombres);
		*/
		//remove() by key
		// get( ) consultar by key
		// containsValue()  by values
		imprimirMapa(mapaNombres);
		
	}

	private static void imprimirMapa(HashMap<Integer, String> mapaNombres) {
		Iterator<Integer> recorreLlave = mapaNombres.keySet().iterator();
		
		while (recorreLlave.hasNext()) {
			Integer llave = recorreLlave.next();
			System.out.println(llave + " "+ mapaNombres.get(llave));
		}	
	}

}
