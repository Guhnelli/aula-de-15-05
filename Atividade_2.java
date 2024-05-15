package Aula_15_05;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int m[][] = new int [4][4];
		int valor=1;

		for (int i=0; i<4; i++) {
			m[i][i] = valor++;
			valor = (int)Math.round(Math.random()*10);
		}
		for(int i=0; i<4; i++) {

			for(int j=0; j<4; j++) {

				System.out.print(" | " + m[i][j] + " | ");

			}

			System.out.println();

		}

	}

}