package co.com.bryan.datastructure;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* implementa la interfaz map
		 * existe desde la vr 1.1 de java
		 * tiene sus metodos sincronizadoa
		 * permite getionar la data mediante una estructura clave=>valor
		 * no admite clave ni valores null
		 * internamente maneja un codigo basado en hash
		 * 
		 * No se puede recorrer con un ciclo for ya que hash table no esta basado en 
		 * indices
		 * 
		 * Hay que usar la interfaz Enumeration
		 * 
		 * no permite el ingreso de muchas tareas o hilos solo uno por uno
		 */
		
		Hashtable<Integer, String> idCedulas =new Hashtable<Integer,String>();
		idCedulas.put(0, "Brayan Rojas");
		idCedulas.put(1, " BRANDON BAENA");
		
		System.out.println(idCedulas);
		System.out.println(idCedulas.get(1));
		System.out.println(idCedulas.size());
		
		//idCedulas.remove(1);
		System.out.println(idCedulas);
		System.out.println(idCedulas.containsKey(1));
		
		recorrerTableHash(idCedulas);
	}

	private static void recorrerTableHash(Hashtable<Integer, String> tbName) {
		
		// tipo de dato que nos va a returnar la clase
		//elements = todos los elementos de la tabla
		
		// Elementos == Values of keys
		//Keys == Id Values
		Enumeration<String> enumeration = tbName.elements();
		
		// hasta cuando no hayan mas elementos por mostrar para el ciclo
		while (enumeration.hasMoreElements()) {
			System.out.println("***"+enumeration.nextElement());
		}
		
		Enumeration<Integer> enumerationK = tbName.keys();
		while (enumerationK.hasMoreElements()) {
			System.out.println("***"+enumerationK.nextElement());
		}
		
	}
	

}
