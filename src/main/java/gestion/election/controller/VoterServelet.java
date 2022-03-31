package gestion.election.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import gestion.election.dao.VoterDao;
import gestion.election.model.VoterBean;

/**
 * Servlet implementation class UserServelet
 */
@WebServlet("/VoterServelet")
public class VoterServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	private VoterDao voterdoa=new VoterDao();
    public VoterServelet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		RequestDispatcher dispatcher = request.getRequestDispatcher("/voter.jsp");
		dispatcher.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String numero =request.getParameter("numero");
		String liste =request.getParameter("liste");
		VoterBean voterbean = new VoterBean();
		voterbean.setNumero(numero);
		voterbean.setListe(liste);
		try {
			voterdoa.RegisterVoter(voterbean);
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("/affiche.jsp");
		dispatcher.forward(request, response);
		
	}

}
