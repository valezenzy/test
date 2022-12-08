package it.cefi.controllers;

import java.io.IOException;

import it.cefi.models.Isogramma;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/prova")

public class IsogrammaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private Isogramma isogramma = new Isogramma();

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");

		String parola = new String();
		parola = request.getParameter("frase");

		if (isogramma.controlloIsogramma(parola)) {
			request.setAttribute("risposta", parola + " è un isogramma");
		} else {
			request.setAttribute("risposta", parola + " non è un isogramma");
		}


		requestDispatcher.forward(request, response);
	}

}