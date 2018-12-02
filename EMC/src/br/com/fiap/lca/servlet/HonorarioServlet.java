package br.com.fiap.lca.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.lca.bean.Honorario;
import br.com.fiap.lca.bo.HonorarioBO;
import br.com.fiap.lca.conexao.ConexaoFactory;

@WebServlet("/honorarioServlet")
public class HonorarioServlet extends HttpServlet {
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
			retorno = "listar-honorario.jsp";
			break;
		case "carregar":
			carregar(req);
			retorno = "listar-honorario.jsp";

		default:
			break;
		}
	}

	private void carregar(HttpServletRequest req) {
		HonorarioBO bo = new HonorarioBO();
		Connection c = ConexaoFactory.getConnection();
		try {
			List<Honorario> listaHono = bo.listarLanHono(c);
			req.setAttribute("honorario", listaHono);
		} catch (Exception e) {
			req.setAttribute("erro", e.getMessage());
			e.printStackTrace();
		}
	}

	private void listar(HttpServletRequest req) {
		HonorarioBO bo = new HonorarioBO();

	}
}
