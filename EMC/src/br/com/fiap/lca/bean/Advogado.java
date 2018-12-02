package br.com.fiap.lca.bean;

public class Advogado {
	private int codAdv;
	private int numOab;
	private int numCpf;
	private String strRg;
	private String strEmail;
	private String strSenha;
	
	public Advogado(int codAdv, int numOab) {
		super();
		this.codAdv = codAdv;
		this.numOab = numOab;
	}

	public int getCodAdv() {
		return codAdv;
	}

	public void setCodAdv(int codAdv) {
		this.codAdv = codAdv;
	}

	public int getNumOab() {
		return numOab;
	}

	public void setNumOab(int numOab) {
		this.numOab = numOab;
	}

	public int getNumCpf() {
		return numCpf;
	}

	public void setNumCpf(int numCpf) {
		this.numCpf = numCpf;
	}

	public String getStrRg() {
		return strRg;
	}

	public void setStrRg(String strRg) {
		this.strRg = strRg;
	}

	public String getStrEmail() {
		return strEmail;
	}

	public void setStrEmail(String strEmail) {
		this.strEmail = strEmail;
	}

	public String getStrSenha() {
		return strSenha;
	}

	public void setStrSenha(String strSenha) {
		this.strSenha = strSenha;
	}

	public Advogado() {
	}
		
	
}
