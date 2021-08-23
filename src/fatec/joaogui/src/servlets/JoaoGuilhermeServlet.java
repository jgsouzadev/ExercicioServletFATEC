package fatec.joaogui.src.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JoaoGuilhermeServlet
 */
@WebServlet("/joao-servlet.html")
public class JoaoGuilhermeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public JoaoGuilhermeServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>JoaoGuilhermeServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<div'>");
            out.println("<h2>Nome: João Guilherme de Souza</h2>");
            out.println("<h2>RA: 1290482013051</h2>");
            out.println("<h2><a href=\"https://github.com/jgsouzadev\" >Acessar meu github</a></h2>");
            out.println("</br>");
            out.println("</br>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
	}
}
