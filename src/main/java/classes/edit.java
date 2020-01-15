package classes;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@WebServlet (name="edit", urlPatterns="/classes/edit")
public class edit extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/edit.jsp").forward(request,response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            List<ClassDates> classes = new MySQLClassDao().all();
            ClassDates selectedClass = classes.get(Integer.parseInt(request.getParameter("id"))-1);
            request.setAttribute("selectedClass",selectedClass);
  } catch (SQLException e) {
            e.printStackTrace();
        }


        HttpSession session = request.getSession();
            request.getRequestDispatcher("/WEB-INF/edit.jsp").forward(request,response);
        }
    }

