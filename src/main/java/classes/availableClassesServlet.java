package classes;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;


@WebServlet("/classes")
public class availableClassesServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("isLoggedIn") == "true") {
            try {
                session.setAttribute("images", DaoFactory.getClassDao().all());
            } catch (SQLException e) {
                e.printStackTrace();
            }
            request.getRequestDispatcher("/WEB-INF/availableClasses.jsp").forward(request, response);
        } else {
            response.sendRedirect("/home");
        }
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/availableClasses.jsp").forward(request,response);
    }
}
