import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FirstServlet", value = "/FirstServlet")
public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        Integer count = (Integer) session.getAttribute("count");

        if (count == null) {
            session.setAttribute("count", 1);
            count = 1;
        } else {
            session.setAttribute("count", count + 1);
        }

//        String name = request.getParameter("name");
//        String surname = request.getParameter("surname");

        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<h1>You count is: " + count + " hi </h1>");

        //pw.println("<h1>Hello-world " + name + " " + surname + " hy </h1>");
        pw.println("</html>");

//        response.sendRedirect("http://www.google.com");
//        response.sendRedirect("/firstJsp.jsp");
//
//        RequestDispatcher dispatcher = request.getRequestDispatcher("/firstJsp.jsp");
//        dispatcher.forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
