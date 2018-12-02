package br.com.fiap.lca.bean;

import java.util.Calendar;

public class Despesa {
	private int codLanD;
	private TipoDesp tipoDesp;
	private Processo processo;
	private int codProc;
	private Calendar dtDesp;
	private double vlDesp;
	private String obsDesp;
	
	public Despesa(TipoDesp tipoDesp, int codProc,Calendar dtDesp,
			 double vlDesp, String obsDesp) {
		super();
		//this.codLanD = codLanD;
		this.tipoDesp = tipoDesp;
		this.codProc = codProc;
		this.dtDesp = dtDesp;
		this.vlDesp = vlDesp;
		this.obsDesp = obsDesp;
	}

	public int getCodLanD() {
		return codLanD;
	}

	public void setCodLanD(int codLanD) {
		this.codLanD = codLanD;
	}

	public TipoDesp getTipoDesp() {
		return tipoDesp;
	}

	public void setTipoDesp(TipoDesp tipoDesp) {
		this.tipoDesp = tipoDesp;
	}

	public Processo getProcesso() {
		return processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
	}

	public Calendar getDtDesp() {
		return dtDesp;
	}

	public void setDtDesp(Calendar dtDesp) {
		this.dtDesp = dtDesp;
	}

	public double getVlDesp() {
		return vlDesp;
	}

	public void setVlDesp(double vlDesp) {
		this.vlDesp = vlDesp;
	}

	public String getObsDesp() {
		return obsDesp;
	}

	public void setObsDesp(String obsDesp) {
		this.obsDesp = obsDesp;
	}

	public Despesa() {
	}

	public int getCodProc() {
		return codProc;
	}

	public void setCodProc(int codProc) {
		this.codProc = codProc;
	}
	
	
	
}
