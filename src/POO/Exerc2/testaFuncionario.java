package POO.Exerc2;

public class testaFuncionario {

	public static void main(String[] args) {

		Funcionario func1 = new Funcionario("Charles", 25, "email@gmail.com", "Rua do trabalho");
		func1.visualizar();
		
		Funcionario func2 = new Funcionario("João", 46, "email@gmail.com", "Rua do serviço");
		func2.visualizar();


	}

}
