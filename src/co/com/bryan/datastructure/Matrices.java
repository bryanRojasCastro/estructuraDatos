package co.com.bryan.datastructure;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Matrices {

	public static void main(String[] args) {
		
		//las matrices permiten almacenar muchos mas datos que los arreglos unidimensionales
		
		//matriz = arreglo bidimensional
		
		// 2 filas x 2 columnas 
		
		/*
		 *  {}{}
		 * 	{}{}
		 * 
		 */
		String bidimensional[][] = new String[2][2];
		
		bidimensional[0][0] = "brayan";
		bidimensional[0][1] = "rojas";

		bidimensional[1][0] = "brandon";
		bidimensional[1][1] = "baena";
		
		forArray(bidimensional);
		// 2 forma declaracuon arrayBidimencional
		
		int edades[][] = {
				{00,01},
				{10,11}
		};
		
		for (int i = 0; i < edades.length; i++) {
			for (int j = 0; j < edades.length; j++) {
				System.out.println(edades[i][j]);
			}
		}
		
		int edades2[][] = new int[3][5];
		/* {[][][][][]}
		 * {[][][][][]}
		 * {[][][][][]}
		 */
		String cadena = "Edades Ingresadas \n";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				edades2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad(es) fila"+i+"columna"+j));
				cadena+="posicion:"+"["+i+"]"+"["+j+"]"+":"+edades2[i][j];
				cadena+="\n";
			}
		}
		
		JOptionPane.showMessageDialog(null, cadena);
		
		
		
	}

	private static void forArray(String[][] n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length; j++) {
				System.out.println(n[i][j]);
			}
		}
		
	}

}
