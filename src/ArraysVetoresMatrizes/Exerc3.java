package ArraysVetoresMatrizes;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		
		final int COL = 3;
		final int LIN = 3;
		int dp=0, ds=0;
		
		Scanner leia = new Scanner(System.in);
		int mat[][] = new int[LIN][COL];
		
		for (int i=0; i<LIN; i++) {
			for(int j=0; j<COL; j++) {
				System.out.println("Digite os numeros da matriz: ");
				mat[i][j] = leia.nextInt();
			}
		}
		
		
		for (int i=0; i<LIN; i++) {
			for(int j=0; j<COL; j++) {
				System.out.println("["+mat[i][j]+"]");
			}
			System.out.println("\n");
		}
		
		for (int i=0; i<LIN; i++) {
			for(int j=0; j<COL; j++) {
			 if(i == j) {
				 dp = dp + mat[i][j];
				 System.out.println("Diagonal primaria: "+dp);
			 }
			}
		}
		
		for (int i=0; i<LIN; i++) {
			for(int j=0; j<COL; j++) {
			 if(i + j == 2) {
				 ds = ds + mat[i][j];
				 System.out.println("Diagonal secundaria: "+ds);
			 }
			}
		}

	}

}
