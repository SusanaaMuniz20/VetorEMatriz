package Principal;

public class Atividade_matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] numeros = new int[4][4];

		int contador = 10;

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {
				if (i == j) {
					System.out.println((contador));
				} else {
					System.out.print("\t");
				}
				contador++;
			}
			System.out.println();
		}

	}

}
