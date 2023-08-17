package Principal;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//uma matriz é um vetor multidimencional
		//geralmente trabalhamos com 2 dimensões
		// linha e coluna, parece uma tabela
		
		
		
		//os dois ultimos fecha colchetes são para indicar coluna e linha
		//Ex: abaixo temos uma matriz 3 x 3
		// Sendo o primeiro colchete a linha e o segundo colchete a coluna
		
		int [][] numeros = new int [3] [3];

		int contador = 10;
		
		for(int i = 0; i < numeros.length; i ++) {
			for(int j =0; j < numeros.length; j++) {
				numeros[i][j] = contador;
				System.out.print(numeros[i][j] + "\t");
				contador++;
			}
			System.out.println();
		}
		
		
		/* 
		System.out.print((numeros[0][0] = 10) +"\t");
		System.out.print((numeros[0][0] = 11) +"\t");
		System.out.print((numeros[0][0] = 12) +"\t");
		System.out.println();
		System.out.print((numeros[0][1] = 13) +"\t");
		System.out.print((numeros[0][1] = 14) +"\t");
		System.out.print((numeros[0][1] = 15) +"\t");
		System.out.println();
		System.out.print((numeros[0][2] = 16) +"\t");
		System.out.print((numeros[0][2] = 17) +"\t");
		System.out.print((numeros[0][2] = 18) +"\t"); */
		
		
		
		
		
		
		
	}

}
