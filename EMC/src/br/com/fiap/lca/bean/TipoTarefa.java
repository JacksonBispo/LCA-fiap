package br.com.fiap.lca.bean;

public class TipoTarefa {
	private int cdTpTarefa;
	private String strTpTarefa;
	public TipoTarefa(int cdTpTarefa, String strTpTarefa) {
		super();
		this.cdTpTarefa = cdTpTarefa;
		this.strTpTarefa = strTpTarefa;
	}
	public TipoTarefa() {
	}
	public int getCdTpTarefa() {
		return cdTpTarefa;
	}
	public void setCdTpTarefa(int cdTpTarefa) {
		this.cdTpTarefa = cdTpTarefa;
	}
	public String getStrTpTarefa() {
		return strTpTarefa;
	}
	public void setStrTpTarefa(String strTpTarefa) {
		this.strTpTarefa = strTpTarefa;
	}
	

}
