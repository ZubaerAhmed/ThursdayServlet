package Thursday;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/studentServlet")
public class studentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public studentServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("Student confirmed.<br>");
		out.println(request.getParameter("userName")+("<br>"));
		out.println(request.getParameter("password")+("<br>"));
		out.println(request.getParameter("country"));
	    out.println("</body></html>");	
	}
//---------------------------------------------------------------------------------
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
