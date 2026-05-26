package ava2_dad_project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculo extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Resgatando valores da Calculadora
		String val1 = req.getParameter("valor1");
		String val2 = req.getParameter("valor2");
		String oper = req.getParameter("operacao");
		
		//Convertendo val1 e val2 de String para Float
		Float fval1 = null;
		Float fval2 = null;
		boolean temErro = false;
		
		try {
			fval1 = Float.parseFloat(val1);
		} catch (NumberFormatException | NullPointerException erro ) {
			req.setAttribute("erroV1", "Valor 1 inválido");
			temErro = true;
		}
		
		try {
			fval2 = Float.parseFloat(val2);
		} catch (NumberFormatException | NullPointerException erro ) {
			req.setAttribute("erroV2", "Valor 2 inválido");
			temErro = true;
		}
		
		if (!temErro) {
			
			float resultado = 0;
			boolean divisaoPorZero = false;
			
			switch (oper) {
			case "+": resultado = fval1 + fval2; break;
			case "-": resultado = fval1 - fval2; break;
			case "*": resultado = fval1 * fval2; break;
			case "/": 
				if( fval1 == 0 || fval2 == 0 ) {
					req.setAttribute("resultado", "Divisão por Zero");
					divisaoPorZero = true;
				}
				else {
					resultado = fval1 / fval2;
				}
				break;
			}
			if(!divisaoPorZero) {
				String expressao = String.format("%f %s %f = %f", fval1, oper, fval2, resultado);
				req.setAttribute("resultado", expressao);
			}
		}
		
		req.getRequestDispatcher("ava2_jsp_app/Calculadora.jsp").forward(req, resp);
		
	}
}
