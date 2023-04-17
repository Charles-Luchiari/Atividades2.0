package lacosDesicao;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		int a, b;
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um número: ");
		a = ler.nextInt();
		b = (a%2);
		
		if (b==0 && a<0) {
			System.out.println("O numero é par e negativo");
		} else if (b==0 && a>=0) {
			System.out.println("O numero é par e positivo");
		} else if (b!=0 && a<0) {
			System.out.println("O numero é ímpar e negativo");
		} else if (b!=0 && a>= 0) {
			System.out.println("O numero é ímpar e positivo");
		}

	}

}
