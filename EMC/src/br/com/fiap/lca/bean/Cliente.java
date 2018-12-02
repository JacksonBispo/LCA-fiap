package br.com.fiap.lca.bean;

public class Cliente {
	private int cdCliente;
	private String razao;
	private int cnpj;
	private int inscricao;
	private String email;
	private String senha;
	
	public Cliente(int cdCliente, String razao, int cnpj) {
		super();
		this.cdCliente = cdCliente;
		this.razao = razao;
		this.cnpj = cnpj;
	}

	public Cliente() {
	}

	public int getCdCliente() {
		return cdCliente;
	}

	public void setCdCliente(int cdCliente) {
		this.cdCliente = cdCliente;
	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public int getInscricao() {
		return inscricao;
	}

	public void setInscricao(int inscricao) {
		this.inscricao = inscricao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
