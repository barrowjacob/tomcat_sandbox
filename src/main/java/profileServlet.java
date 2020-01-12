import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/profile")
public class profileServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/profile.jsp").forward(request,response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Image image = new Image("webapp/WEB-INF/img/brown-and-black-wooden-wind-mill-1036148.jpg","Country Life","A collection of short stories regarding life in the country.");
        request.setAttribute("image",image);
        String username = request.getAttribute("username").toString();
        request.setAttribute("username",username);
        request.setAttribute("image",image);
        String url = image.getUrl();
        String description = image.getDescription();
        String title = image.getTitle();
        request.getRequestDispatcher("/profile.jsp").forward(request,response);
    }
}
