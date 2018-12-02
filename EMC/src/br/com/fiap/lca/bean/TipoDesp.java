package br.com.fiap.lca.bean;

public class TipoDesp {
	private int codTpDesp;
	private String strTpDesp;
	
	public TipoDesp(int codTpDesp, String strTpDesp) {
		super();
		this.codTpDesp = codTpDesp;
		this.strTpDesp = strTpDesp;
	}

	public TipoDesp() {
	}

	public int getCodTpDesp() {
		return codTpDesp;
	}

	public void setCodTpDesp(int codTpDesp) {
		this.codTpDesp = codTpDesp;
	}

	public String getStrTpDesp() {
		return strTpDesp;
	}

	public void setStrTpDesp(String strTpDesp) {
		this.strTpDesp = strTpDesp;
	}
	
	
}
