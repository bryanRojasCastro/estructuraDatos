package co.com.bryan.datastructure;

import javax.swing.JOptionPane;

public class Arreglo {
	// arreglo =  varios datos de un tipo
	public static void main(String[] args) {
		
		Arreglo ar = new Arreglo();
		//ar.iniciar();
		//ar.inputGUI();
		//ar.validarVacio();
	}

	private  void iniciar() {
		
		
		int arrayNumeros[] = {1,2,3,4};
		//	int[] arrayNumeros; 2manera de declarar un array
		for (int i : arrayNumeros) {
			System.out.println(i);
		}
		
		//definir longitud del array  N-1
		String letras[] = new String[3];
		letras[0] = "A";
		letras[1] = "B";
		letras[2] = "C";
		System.out.println(letras[0]);
	}
	
	private void inputGUI(){
		
		int arrayNumeros[] = new int[5];
		
		for (int i = 0; i < arrayNumeros.length; i++) {
			
			arrayNumeros[i] = Integer.parseInt(JOptionPane.showInputDialog("iNGRESA NUMERO PARA LA POS:"+i));
			
		}
		String cadena = "Valores del arreglo\n";
		for (int i = 0; i < arrayNumeros.length; i++) {
			cadena+=arrayNumeros[i];
			cadena+="\n";
		}
		JOptionPane.showMessageDialog(null, cadena);
	}
	
	private void validarVacio(){
		int value = Integer.parseInt(JOptionPane.showInputDialog("iN:"));
		System.out.println(value);
	}
}
