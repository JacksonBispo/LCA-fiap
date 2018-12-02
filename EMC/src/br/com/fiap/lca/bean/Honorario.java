package br.com.fiap.lca.bean;

import java.util.Calendar;

public class Honorario {
	private int cdLanca;
	private TipoTarefa tipoTarefa;
	private Processo processo;
	private int cdProc;
	private Calendar dtHono;
	private double qtHora;
	private String obsHono;
	public Honorario(TipoTarefa tipoTarefa, int cdProc, Calendar dtHono,
			double qtHora, String obsHono) {
		super();
		this.tipoTarefa = tipoTarefa;
		this.cdProc = cdProc;
		this.dtHono = dtHono;
		this.qtHora = qtHora;
		this.obsHono = obsHono;
	}
	public Honorario() {		
	}
	public int getCdLanca() {
		return cdLanca;
	}
	public void setCdLanca(int cdLanca) {
		this.cdLanca = cdLanca;
	}
	public TipoTarefa getTipoTarefa() {
		return tipoTarefa;
	}
	public void setTipoTarefa(TipoTarefa tipoTarefa) {
		this.tipoTarefa = tipoTarefa;
	}
	public Processo getProcesso() {
		return processo;
	}
	public void setProcesso(Processo processo) {
		this.processo = processo;
	}
	public int getCdProc() {
		return cdProc;
	}
	public void setCdProc(int cdProc) {
		this.cdProc = cdProc;
	}
	public Calendar getDtHono() {
		return dtHono;
	}
	public void setDtHono(Calendar dtHono) {
		this.dtHono = dtHono;
	}
	public double getQtHora() {
		return qtHora;
	}
	public void setQtHora(double qtHora) {
		this.qtHora = qtHora;
	}
	public String getObsHono() {
		return obsHono;
	}
	public void setObsHono(String obsHono) {
		this.obsHono = obsHono;
	}
		
}
