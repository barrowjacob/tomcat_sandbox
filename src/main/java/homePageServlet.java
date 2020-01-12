import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/home")
public class homePageServlet extends HttpServlet {


    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/homePage.jsp").forward(request,response);
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, NullPointerException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equalsIgnoreCase("admin") && password.equals("password")){
            request.setAttribute("username",username);
            request.getRequestDispatcher("/profile").forward(request,response);
        } else {
            request.getRequestDispatcher("/homePageLoginError.jsp").forward(request,response);
        }
        }
    }

