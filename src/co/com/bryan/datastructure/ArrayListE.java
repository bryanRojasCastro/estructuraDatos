
package co.com.bryan.datastructure;
import java.util.ArrayList;

/*
 * Cuando de error al importar una clase descripcion:
 * conflicts with a type defined in the same file
 * es porque el nombre de la clase que estamos importando
 * es igaul al nombre de la clase del archivo
 */

public class ArrayListE {

	public static void main(String[] args) {
		// ArrayList hace parte de la api collection de java
		
		//tamaño dinamico		
		// datos no primitvos   ** RECIBE OBJETOS
		// size()  get-set() contains() idexOf()  clear();
										//fuertemente tipado
		
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		listaNumeros.add(2);
		listaNumeros.add(2);
		listaNumeros.add(2);
		System.out.println(listaNumeros);
		
		listaNumeros.add(1, 3);
		System.out.println(listaNumeros);
		listaNumeros.remove(3);
		System.out.println(listaNumeros);
		
	}

}
