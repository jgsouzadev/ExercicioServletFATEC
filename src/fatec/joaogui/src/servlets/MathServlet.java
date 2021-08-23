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
@WebServlet("/math.html")
public class MathServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public MathServlet() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IllegalArgumentException {
		response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        	   out.println("<!DOCTYPE html>");
               out.println("<html>");
               out.println("<head>");
               out.println("<title>MathServlet</title>");            
               out.println("</head>");
               out.println("<body>");
               out.println("<h1>Resultado</h1>: ");

               float n1 = Float.parseFloat(request.getParameter("n1"));
               float n2 = Float.parseFloat(request.getParameter("n2"));
               int option = Integer.parseInt(request.getParameter("operacao"));
               float resultado = 0;
               
               switch(option) {
               case 1:
               	resultado = n1 + n2; break;
               case 2:
              	resultado = n1 - n2; break;
               case 3:
              	resultado = n1 * n2; break;
               case 4:
              	resultado = n1 / n2; break;
               default:
            	throw new IllegalArgumentException("Opção invalida");
               }
               
               out.println("<h2> "+ resultado +"</h2>");
               out.println("<br> <button onclick=\"location.href='index.html'\">Voltar</button>");
               out.println("</body>");
               out.println("</html>");
               

               
        }
	}
}
