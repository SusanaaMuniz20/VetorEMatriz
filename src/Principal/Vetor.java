package Principal;

public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Vetor � uma sequencia n�o ordenada de dados do mesmo tipo a contagem do Vetor
		// � por indice e inicia do incice 0
		// Vetor n�o pode conter dados de tipo diferentes
		// Vetor tbm � conhecido como Array
		// Vetor � unidimencional, uma dire��o
		// os dados do Array s�o armazenados em um tipo de mem�ria
		
		/* (xpto123) = 10, 20, 30, 40
		 */
		int array = 5;
		String nome = "Susana Muniz";
		
		int [] numeros = new int [array];
		numeros [0] = 10;
		numeros [1] = 20;
		numeros [2] = 30;
		numeros [3] = 40;
		numeros [4] = 50;
		
		//numeros [5] = 10;
		System.out.println("fora do for:" + numeros[0]);
		
		for(int contador = 0; contador < nome.length(); contador++) {
			System.out.println("Dentro do for: " + numeros [contador]);
		}
		
	}

}
