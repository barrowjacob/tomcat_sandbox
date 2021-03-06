package classes;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/admin")
public class adminServlet extends HttpServlet {


    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("isLoggedIn") == "true") {
            response.sendRedirect("/classes");
        } else {
            request.getRequestDispatcher("/WEB-INF/admin.jsp").forward(request,response);
        }
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        session.setAttribute("username",username);
        if (username.equalsIgnoreCase("admin") && password.equals("password")){
            session.setAttribute("isLoggedIn","true");
            response.sendRedirect("/classes");
        } else {
            request.getRequestDispatcher("/WEB-INF/adminLoginError.jsp").forward(request,response);
        }
        }
    }

