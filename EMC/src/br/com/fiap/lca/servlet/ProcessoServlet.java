package br.com.fiap.lca.servlet;

import java.io.IOException;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.lca.bean.Processo;
import br.com.fiap.lca.bean.TipoDesp;
import br.com.fiap.lca.bo.DespesaBO;
import br.com.fiap.lca.bo.ProcessoBO;
import br.com.fiap.lca.conexao.ConexaoFactory;


@WebServlet("/processoServlet")
public class ProcessoServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String acao = req.getParameter("acao");
		String retorno = "";
		switch (acao) {
		case "listar":
			listar(req);
			String ac = req.getParameter("ac");
			System.out.println("ac"+ac);
			req.setAttribute("ac", ac);
			retorno = "listar-processo.jsp";
			break;
		case "buscar":
			buscar(req);
			retorno = "listar-processo.jsp";
			break;
		case "carregar":
			carregar(req);	
			break;
		case "despesas":
			retorno = "listar-processo";
			break;
		case "honorarios":
			retorno = "listar-honorario";
		}
		req.getRequestDispatcher(retorno).forward(req, resp);
	}
	
	private void carregar(HttpServletRequest req) {
		ProcessoBO bo = new ProcessoBO();
		Connection c = ConexaoFactory.getConnection();
		try {
			List<Processo> listProcesso = bo.listarProc(c);
			req.setAttribute("processo", listProcesso);
		} catch (Exception e) {
			req.setAttribute("erro", e.getMessage());
			e.printStackTrace();
		}
	}

	private void buscar(HttpServletRequest req) {
		int numero = Integer.parseInt(req.getParameter("numeroProcesso"));
		ProcessoBO bo = new ProcessoBO();
		Connection c = ConexaoFactory.getConnection();
		try {
			req.setAttribute("processo", bo.buscarPorNumero(numero, c));
		} catch (Exception e) {
			req.setAttribute("erro", "processo não existe");
		}
		ConexaoFactory.fechar(c);
	}

	private void listar(HttpServletRequest req) {
		Connection c = ConexaoFactory.getConnection();
		ProcessoBO bo = new ProcessoBO();
		try {
			req.setAttribute("processo", bo.listarProc(c));
		} catch (Exception e) {
			req.setAttribute("erro", e.getMessage());
		}
		ConexaoFactory.fechar(c);
	}



}
