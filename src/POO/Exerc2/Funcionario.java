package POO.Exerc2;

public class Funcionario {
	
	private String nomeFunc;
	private int idadeFun;
	private String emailFun;
	private String enderecoFun;
	
	//metodo constructor
	public Funcionario(String nomeFunc, int idadeFun, String emailFun, String enderecoFun) {
		super();
		this.nomeFunc = nomeFunc;
		this.idadeFun = idadeFun;
		this.emailFun = emailFun;
		this.enderecoFun = enderecoFun;
	}
	
	//metodos Getters e Setters
	public String getNomeFunc() {
		return nomeFunc;
	}

	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}

	public int getIdadeFun() {
		return idadeFun;
	}

	public void setIdadeFun(int idadeFun) {
		this.idadeFun = idadeFun;
	}

	public String getEmailFun() {
		return emailFun;
	}

	public void setEmailFun(String emailFun) {
		this.emailFun = emailFun;
	}

	public String getEnderecoFun() {
		return enderecoFun;
	}

	public void setEnderecoFun(String enderecoFun) {
		this.enderecoFun = enderecoFun;
	}
	
	
	public void visualizar() {
		System.out.println("\nNome do funcionario: "+nomeFunc);
		System.out.println("\nIdade do funcionario: "+idadeFun);
		System.out.println("\nE-mail do funcionario: "+emailFun);
		System.out.println("\nEndereço do funcionario: "+enderecoFun);
	}
	
}
