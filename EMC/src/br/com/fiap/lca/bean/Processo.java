package br.com.fiap.lca.bean;

import java.util.Calendar;

public class Processo {
	private int numProc;
	private Cliente cliente;
	private Advogado advogado;
	private Forum forum;
	private Causa causa;
	private String processo;
	private Calendar dtAbertura;
	private Calendar dtFechamento;
	private Calendar dtDiaVence;
	private int numResul;
	private String StrObservacao;
	private boolean BolSituacao;

	public Processo(int numProc, Cliente cliente, Advogado advogado,
			Forum forum, Causa causa, String processo, Calendar dtAbertura,
			Calendar dtFechamento, Calendar dtDiaVence, int numResul,
			String strObservacao, boolean bolSituacao) {
		super();
		this.numProc = numProc;
		this.cliente = cliente;
		this.advogado = advogado;
		this.forum = forum;
		this.causa = causa;
		this.processo = processo;
		this.dtAbertura = dtAbertura;
		this.dtFechamento = dtFechamento;
		this.dtDiaVence = dtDiaVence;
		this.numResul = numResul;
		StrObservacao = strObservacao;
		BolSituacao = bolSituacao;
	}

	public Processo() {
	}

	public int getNumProc() {
		return numProc;
	}

	public void setNumProc(int numProc) {
		this.numProc = numProc;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Advogado getAdvogado() {
		return advogado;
	}

	public void setAdvogado(Advogado advogado) {
		this.advogado = advogado;
	}

	public Forum getForum() {
		return forum;
	}

	public void setForum(Forum forum) {
		this.forum = forum;
	}

	public Causa getCausa() {
		return causa;
	}

	public void setCausa(Causa causa) {
		this.causa = causa;
	}

	public String getProcesso() {
		return processo;
	}

	public void setProcesso(String processo) {
		this.processo = processo;
	}

	public Calendar getDtAbertura() {
		return dtAbertura;
	}

	public void setDtAbertura(Calendar dtAbertura) {
		this.dtAbertura = dtAbertura;
	}

	public Calendar getDtFechamento() {
		return dtFechamento;
	}

	public void setDtFechamento(Calendar dtFechamento) {
		this.dtFechamento = dtFechamento;
	}

	public Calendar getDtDiaVence() {
		return dtDiaVence;
	}

	public void setDtDiaVence(Calendar dtDiaVence) {
		this.dtDiaVence = dtDiaVence;
	}

	public int getNumResul() {
		return numResul;
	}

	public void setNumResul(int numResul) {
		this.numResul = numResul;
	}

	public String getStrObservacao() {
		return StrObservacao;
	}

	public void setStrObservacao(String strObservacao) {
		StrObservacao = strObservacao;
	}

	public boolean isBolSituacao() {
		return BolSituacao;
	}

	public void setBolSituacao(boolean bolSituacao) {
		BolSituacao = bolSituacao;
	}

}
