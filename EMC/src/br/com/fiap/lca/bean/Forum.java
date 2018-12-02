package br.com.fiap.lca.bean;

public class Forum {
	private int numCodForum;
	private String strDescricao;
	
	public Forum(int numCodForum, String strDescricao) {
		super();
		this.numCodForum = numCodForum;
		this.strDescricao = strDescricao;
	}
	
	public int getNumCodForum() {
		return numCodForum;
	}
	public void setNumCodForum(int numCodForum) {
		this.numCodForum = numCodForum;
	}
	public String getStrDescricao() {
		return strDescricao;
	}
	public void setStrDescricao(String strDescricao) {
		this.strDescricao = strDescricao;
	}
	public Forum(String strDescricao) {
		super();
		this.strDescricao = strDescricao;
	}
	public Forum() {


	}
	

}
