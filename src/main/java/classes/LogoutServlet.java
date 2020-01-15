package classes;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/logout")
public class LogoutServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException { if (request.getSession().getAttribute("isLoggedIn") == "true") {
            request.getSession().removeAttribute("isLoggedIn");
            response.sendRedirect("/admin");
        } else {
        response.sendRedirect("/admin");
    }
    }
}
