package POO.Exerc1;

public class PessoaFisica extends Cliente{
	
	private String cpf;
	private String rg;
	
	//constructor
	public PessoaFisica(String nomeCliente, int idadeCliente, String enderecoCliente, String emailCliente, String cpf,
			String rg) {
		super(nomeCliente, idadeCliente, enderecoCliente, emailCliente);
		this.cpf = cpf;
		this.rg = rg;
	}

	//Getters  Setters
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public void visualizar() {
		System.out.println("O "+getNomeCliente()+" com idade de "+getIdadeCliente()+" possui o CPF "+getCpf());
	}
	
	
	
}
