package lacosDesicao;

import java.util.Scanner;

public class Exer6 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		String nome, cargo;
		int codigo;
		float salario, novoSalario, reajuste;
		
		
		
		System.out.println("Código do Cargo: "+"     Cargo     "+"  Percentual do Reajuste   ");
		System.out.println("\n          1        " +" Gerente "+"               10%          ");
		System.out.println("\n          2        " +"   Vendedor   "+"          7%           ");
		System.out.println("\n          3        " +"  Supervisor  "+"          9%           ");
		System.out.println("\n          4        " +"    Motorista   "+"        6%           ");
		System.out.println("\n          5        " +" Estoquista  "+"           5%           ");
		System.out.println("\n          6        " +" Técnico de TI   "+"       8%           ");
		
		System.out.println("Nome do colaborador: ");
		nome = leia.nextLine();
		System.out.println("Cargo: ");
		codigo = leia.nextInt();
		System.out.println("Salario: ");
		salario = leia.nextFloat();
		
		System.out.println(nome);
		System.out.println(codigo);
		System.out.println(salario);
		
		switch(codigo) {
		case 1:
			reajuste = 10/100;
			novoSalario = salario + (reajuste * salario);
			System.out.printf("\nNome do colaborador: ",nome);
			System.out.printf("\nCargo: Gerente");
			System.out.printf("\nSalario: %.2f",novoSalario);
			break;
		case 2:
			cargo = "Gerente";
			novoSalario = salario + ((10/100)*salario);
			System.out.printf("\nNome do colaborador: ",nome);
			System.out.printf("\nCargo: ", cargo);
			System.out.printf("\nSalario: %.2f",novoSalario);
			break;
			
		case 3:
			cargo = "Gerente";
			novoSalario = salario + ((10/100)*salario);
			System.out.printf("\nNome do colaborador: ",nome);
			System.out.printf("\nCargo: ", cargo);
			System.out.printf("\nSalario: %.2f",novoSalario);
			break;
			
		case 4:
			cargo = "Gerente";
			novoSalario = salario + ((10/100)*salario);
			System.out.printf("\nNome do colaborador: ",nome);
			System.out.printf("\nCargo: ", cargo);
			System.out.printf("\nSalario: %.2f",novoSalario);
			break;
		case 5:
			cargo = "Gerente";
			novoSalario = salario + ((10/100)*salario);
			System.out.printf("\nNome do colaborador: ",nome);
			System.out.printf("\nCargo: ", cargo);
			System.out.printf("\nSalario: %.2f",novoSalario);
			break;
		case 6:
			cargo = "Gerente";
			novoSalario = salario + ((10/100)*salario);
			System.out.printf("\nNome do colaborador: ",nome);
			System.out.printf("\nCargo: ", cargo);
			System.out.printf("\nSalario: %.2f",novoSalario);
			break;
		default:
			System.out.println("Opção invalida");
			break;
		
		}

	}

}
