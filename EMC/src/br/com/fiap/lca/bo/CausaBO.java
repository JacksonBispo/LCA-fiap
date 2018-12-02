package br.com.fiap.lca.bo;

public class CausaBO {
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
	public CausaBO() {
		super();
		
	}
	public CausaBO(String strCausa) {
		super();
		this.strCausa = strCausa;
	}
	public CausaBO(int numCodCausa, String strCausa) {
		super();
		this.numCodCausa = numCodCausa;
		this.strCausa = strCausa;
	}
	
	
}
