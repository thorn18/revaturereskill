package src.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletDemo_01", urlPatterns = "/sd1")
public class ServletDemo_01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("    <title>servlethome</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Welcome to Servlet World!!!</h2>");
        out.println("<h3>Learning Servlet is fun</h3>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
