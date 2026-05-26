package ava2_dad_project;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;


public class AloMundo extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// Define a codificação dos dados recebidos/enviados
		resp.setContentType("text/html; charset=UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		//Pega o stream de saída em que será gravado o resultado do processamento
		PrintWriter out = resp.getWriter();
		
		//Gera a saída em formato HTML para o cliente
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Alo mundo!</h1>");
		out.println("</body>");
		out.println("</html>");
		
		//Fecha o stream de saída
		out.close();
	}
}
