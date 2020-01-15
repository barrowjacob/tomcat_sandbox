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


@WebServlet (name="edit", urlPatterns="/classes/edit")
public class edit extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/edit.jsp").forward(request,response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ResultSet id = null;
        int type = 0;
        try {
            id = new MySQLClassDao().findClassDatesById(Long.parseLong(request.getParameter("id")));
            type =id.getType();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        HttpSession session = request.getSession();
            session.setAttribute("id",id);
            session.setAttribute("type",type);
            request.getRequestDispatcher("/WEB-INF/edit.jsp").forward(request,response);
        }
    }

