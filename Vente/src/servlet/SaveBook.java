package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import livres.Bibliothecaire;
import livres.BibliothecaireLocal;

/**
* Servlet implementation class SaveBook
*/
@WebServlet("/SaveBook")
public class SaveBook extends HttpServlet {

    @EJB
    private BibliothecaireLocal bibliothecaire;
    private static final long serialVersionUID = 1L;

    /**
* @see HttpServlet#HttpServlet()
*/
    public SaveBook() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
* response)
*/
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.write("Debut travail");
        bibliothecaire.ajouterLivres();
       /* ArrayList<String> auteurs = (ArrayList<String>) bibliothecaire.getAuteur();

        for (String auteur : auteurs) {
            out.println(auteur);
        }*/
    }

    /**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
* response)
*/
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    }

}