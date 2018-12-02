package br.com.fiap.lca.bean;

public class Causa {
	private int numCodCausa;
	private String strCausa;
	public int getNumCodCausa() {
		return numCodCausa;
	}
	public void setNumCodCausa(int numCodCausa) {
		this.numCodCausa = numCodCausa;
	}
	public String getStrCausa() {
		return strCausa;
	}
	public void setStrCausa(String strCausa) {
		this.strCausa = strCausa;
	}
	public Causa() {
		super();
		
	}
	public Causa(String strCausa) {
		super();
		this.strCausa = strCausa;
	}
	public Causa(int numCodCausa, String strCausa) {
		super();
		this.numCodCausa = numCodCausa;
		this.strCausa = strCausa;
	}
	
	
}
