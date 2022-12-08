package it.cefi.servlet;


import java.io.IOException;

import it.cefi.models.Isogramma;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Prova")
public class IsogrammaServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
		Isogramma isogramma = new Isogramma(request.getParameter("frase"));
		boolean risultato = isogramma.verifica();
		
		if(risultato == true) {
			request.setAttribute("risposta", "La frase inserita è un isogramma");
			requestDispatcher.forward(request, response);
		}else {			
			request.setAttribute("risposta", "La frase inserita non è un isogramma");
			requestDispatcher.forward(request, response);
		}
			
	}
	

}
