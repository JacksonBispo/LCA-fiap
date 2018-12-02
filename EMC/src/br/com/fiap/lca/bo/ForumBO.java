package br.com.fiap.lca.bo;

public class ForumBO {
	private int numCodForum;
	private String strDescricao;
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
	public ForumBO(String strDescricao) {
		super();
		this.strDescricao = strDescricao;
	}
	public ForumBO() {


	}
	

}
