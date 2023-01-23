package entities;

/**
 * Classe resposável pelos dados do cliente
 * 
 * @author Richard Alexandrino
 *
 */
public class Cliente {
	
	private String cpf;
	private String nome;
	private String userName;
	private Integer idade;

	public Cliente() {
	}
	
	public Cliente(String cpf, String nome, String userName, Integer idade) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.userName = userName;
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Cliente " + nome + " (CPF: "+ cpf + "), de " + idade + 
				" anos de idade, está cadastrado como: " + userName + ".";
	}
	
}
