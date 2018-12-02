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

import br.com.fiap.lca.bean.Despesa;
import br.com.fiap.lca.bean.TipoDesp;
import br.com.fiap.lca.bo.DespesaBO;
import br.com.fiap.lca.conexao.ConexaoFactory;

/**
 * Servlet implementation class DespesaServlet
 */
@WebServlet("/DespesaServlet")
public class DespesaServlet extends HttpServlet {
/*	public DespesaServlet() {
		super();
	}
*/
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String acao = req.getParameter("acao");
		String retorno = "";
		switch (acao) {
		case "listar":
			listar(req);
			retorno = "listar-despesa.jsp";
			break;
		case "carregar":
			carregar(req);
			retorno = "listar-despesa.jsp";
			break;
		case "addDesp":
			addDesp(req);
			retorno = "lancar-despesa.jsp";
			break;
		case "lanDesp":
			try {
				listarTipoDespesa(req);
			} catch (SQLException e) {				
				e.printStackTrace();
			}
			retorno = "lancar-despesa.jsp";
			break;
		}
		req.getRequestDispatcher(retorno).forward(req, resp);
	}

	private void addDesp(HttpServletRequest req) {
		int numProc = Integer.parseInt(req.getParameter("numeroProcesso"));
		Calendar dt = Calendar.getInstance();
		int desp = Integer.parseInt(req.getParameter("despesa"));
		TipoDesp tipoDesp = new TipoDesp();
		tipoDesp.setCodTpDesp(desp);
		double valor = Double.parseDouble(req.getParameter("valor"));
		String obs = req.getParameter("obs");
		Despesa despesa = new Despesa(tipoDesp, numProc, dt, valor, obs);
		DespesaBO bo = new DespesaBO();
		Connection c = ConexaoFactory.getConnection();
		System.out.println("aqui");
		try {
			bo.cadastrarDesp(despesa, c);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		ConexaoFactory.fechar(c);
	}

	private void listar(HttpServletRequest req) {
		DespesaBO bo = new DespesaBO();
		Connection c = ConexaoFactory.getConnection();
		//Calendar cal = Calendar.getInstance();
		try {
			req.setAttribute("despesa", bo.listarLanDesp(c));
		} catch (Exception e) {
			req.setAttribute("erro", e.getMessage());
		}
		ConexaoFactory.fechar(c);
	}

	private void carregar(HttpServletRequest req) {
		DespesaBO bo = new DespesaBO();
		Connection c = ConexaoFactory.getConnection();
		try {
			List<Despesa> listaDesp = bo.listarLanDesp(c);
			req.setAttribute("despesa", listaDesp);
		} catch (Exception e) {
			req.setAttribute("erro", e.getMessage());
			e.printStackTrace();
		}
	}

	private void listarTipoDespesa(HttpServletRequest req) throws SQLException {
		DespesaBO bo = new DespesaBO();
		Connection c = ConexaoFactory.getConnection();
		List<TipoDesp> listaTipoDespesa = bo.listarDespesas(c);
		String numProc = req.getParameter("numProc");
		String cliente = req.getParameter("cli");
		req.setAttribute("despesas", listaTipoDespesa);
		req.setAttribute("numPC", numProc);
		req.setAttribute("cliRazao", cliente);
	}

}
