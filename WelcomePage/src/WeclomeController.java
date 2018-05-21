
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WeclomeController
 */
@WebServlet("/WeclomeController")
public class WeclomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public WeclomeController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pr=response.getWriter();
		response.setContentType("text/html");
		try
		{
		int x=Integer.parseInt(req.getParameter("t1"));
		int y=Integer.parseInt(req.getParameter("t2"));
		pr.println("The addition of numbers is "+ (x+y));
		}
		catch(Exception e)
		{ 
		 
		pr.println("Invalid Input");
		}
	

}
}
