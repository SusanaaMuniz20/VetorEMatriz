package Principal;

import java.util.Scanner;

public class Atividade_MAtriz_AlunoseNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		String[][] alunos = new String[4][5];

		/* alunos[0][0] = "Pablo";
		alunos[0][1] = "8,5";
		alunos[0][2] = "6,4";
		alunos[0][3] = "10";
		alunos[0][4] = "7,7";

		alunos[1][0] = "Ana";
		alunos[1][1] = "2,8";
		alunos[1][2] = "8,5";
		alunos[1][3] = "10";
		alunos[1][4] = "7";

		alunos[2][0] = "Zoe";
		alunos[2][1] = "9,8";
		alunos[2][2] = "6,4";
		alunos[2][3] = "4,5";
		alunos[2][4] = "8,3";

		alunos[3][0] = "Paulo";
		alunos[3][1] = "10";
		alunos[3][2] = "6,6";
		alunos[3][3] = "10";
		alunos[3][4] = "4,5"; */



		for (int i = 0; i < alunos.length; i++) {
			for (int j = 0; j < alunos[i].length; j++) {
			if(j == 0) {
				System.out.print("Entre com o nome do aluno: ");
				alunos[i][j] = sc.nextLine();
			}else {
				System.out.printf("entre com a %d nota: ", (j));
				alunos[i][j] = sc.nextLine();
			}
			}
			System.out.println();
		}

		for(int i = 0; i < alunos.length; i++) {
			for(int j = 0; j < alunos[i].length; j++) {
				System.out.print(alunos[i][j] + "\t");
			}
		System.out.println();
		}
		
		
		
		
		
		
	}

}
