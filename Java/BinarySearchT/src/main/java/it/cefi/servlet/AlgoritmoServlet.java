package it.cefi.servlet;


import java.io.IOException;

import it.cefi.models.Algoritmo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Prova")
public class AlgoritmoServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
		
		Algoritmo algoritmo = new Algoritmo(Integer.parseInt(request.getParameter("numeri")));
		
		int posizione = algoritmo.ricercaBinaria(0, algoritmo.getNumeriCasuali().size());
		
		
		if(posizione == -1) {
			request.setAttribute("risposta", "valore non trovato");
			
		}else {			
			request.setAttribute("risposta",posizione );
			
		}
		requestDispatcher.forward(request, response);
			
	}
	

}
