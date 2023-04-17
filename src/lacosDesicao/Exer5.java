package lacosDesicao;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		
		int codigo,qnt;
		float valorTotal;
		String produto;
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Código do produto: "+"     Produto     "+"  Preço Unitario   ");
		System.out.printf("\n          1        " +"Cachorro Quente "+"     R$ 10,00      ");
		System.out.printf("\n          2        " +"   X-Salada   "+"       R$ 15,00      ");
		System.out.printf("\n          3        " +"  X-Bacon  "+"          R$ 18,00      ");
		System.out.printf("\n          4        " +"    Bauru   "+"         R$ 12,00      ");
		System.out.printf("\n          5        " +" Refrigerante  "+"      R$ 8,00      ");
		System.out.printf("\n          6        " +" Suco de Laranja   "+"  R$ 13,00      ");
		
		System.out.println("\n\nDigite o código do produto");
		codigo = ler.nextInt();
		System.out.println("\n\nDigite a quantidade de produtos");
		qnt = ler.nextInt();
		
		switch(codigo) {
			case 1:
				produto = "Cachorro Quente";
				valorTotal = (qnt * 10);
				System.out.printf("\nProduto: "+produto);
				System.out.printf("\nValor total: R$ %.2f",valorTotal);
				break;
			case 2:
				produto = "X-Salada";
				valorTotal = qnt * 15;
				System.out.printf("\nProduto: "+produto);
				System.out.printf("\nValor total: R$ %.2f",valorTotal);
				break;
			case 3:
				produto = "X-Bacon";
				valorTotal = qnt * 18;
				System.out.printf("\nProduto: "+produto);
				System.out.printf("\nValor total: R$ %.2f",valorTotal);
				break;
			case 4:
				produto = "Bauru";
				valorTotal = qnt * 18;
				System.out.printf("\nProduto: "+produto);
				System.out.printf("\nValor total: R$ %.2f",valorTotal);
				break;
			case 5:
				produto = "Refrigerante";
				valorTotal = qnt * 8;
				System.out.printf("\nProduto: "+produto);
				System.out.printf("\nValor total: R$ %.2f",valorTotal);
				break;
			case 6:
				produto = "Suco de Laranja";
				valorTotal = qnt * 13;
				System.out.printf("\nProduto: "+produto);
				System.out.printf("\nValor total: R$ %.2f",valorTotal);
				break;
			default:
				System.out.printf("\nOpção Invalida");
		}
		
		
	}

		
}
