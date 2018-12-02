package br.com.fiap.lca.bo;

public class AdvogadoBO {
	private int numOab;
	private int numCpf;
	private String strRg;
	private String strEmail;
	private String strSenha;
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
	public AdvogadoBO(int numOab, int numCpf, String strRg, String strEmail,
			String strSenha) {
		super();
		this.numOab = numOab;
		this.numCpf = numCpf;
		this.strRg = strRg;
		this.strEmail = strEmail;
		this.strSenha = strSenha;
	}
	

}
