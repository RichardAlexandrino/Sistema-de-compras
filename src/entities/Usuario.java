package entities;

/**
 * Classe resposável pelos dados do usuário
 * 
 * @author Richard Alexandrino
 *
 */
public class Usuario {

	private String userName;
	private String senha;
	private Cliente cliente;
	private Empresa empresa;

	public Usuario() {
		super();
	}

	public Usuario(String userName, String senha, Cliente cliente, Empresa empresa) {
		super();
		this.userName = userName;
		this.senha = senha;
		this.cliente = cliente;
		this.empresa = empresa;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	
	/**
	 * Identifica se o usuário é o administrador do sistema
	 */
	public boolean IsAdmin() {
		return this.empresa == null && this.cliente == null;
	}

	/**
	 * Identifica se o usuário é uma empresa
	 */
	public boolean IsEmpresa() {
		return this.empresa != null;
	}

	/**
	 * Identifica se o usuário é um cliente
	 */
	public boolean IsCliente() {
		return this.cliente != null;
	}

}
