package servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import users.AuthentificateurLocal;

/**
* Servlet implementation class Login
*/
@WebServlet("/Login")
public class Login extends HttpServlet {
private static final long serialVersionUID = 1L;

@EJB
private AuthentificateurLocal a;
       
    /**
* @see HttpServlet#HttpServlet()
*/
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String login = request.getParameter("login");
String pwd = request.getParameter("pwd");

if(login!=null && pwd!=null)
{
try {
boolean admin = a.connexion(login, pwd);
HttpSession session = request.getSession(true);
session.setAttribute("login", login);
session.setAttribute("pwd", pwd);
session.setAttribute("admin", admin);
RequestDispatcher dispatcher = request.getRequestDispatcher("/Web/main.jsp");
dispatcher.forward(request, response);

} catch (Exception e) {
RequestDispatcher dispatcher = request.getRequestDispatcher("/Web/index.jsp");
dispatcher.forward(request, response);
}
}
else
{
RequestDispatcher dispatcher = request.getRequestDispatcher("/Web/index.jsp");
dispatcher.forward(request, response);
}
}

}