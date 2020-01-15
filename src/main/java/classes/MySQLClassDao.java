package classes;

import java.sql.*;

import com.mysql.cj.jdbc.Driver;

import java.util.ArrayList;
import java.util.List;

public class MySQLClassDao implements ClassDate{
    private static Connection connection;

    public MySQLClassDao() throws SQLException {
        try {
            Config config = new Config();
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(config.getUrl(), config.getUsername(), config.getPassword());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }


@Override
    public List<ClassDates> all() {
        List<ClassDates> output = new ArrayList<>();
        String query = "SELECT * FROM class_dates";
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                output.add(new ClassDates(
                        rs.getLong("id"),
                        rs.getString("type"),
                        rs.getString("date"),
                        rs.getInt("seats_booked")
                    )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return output;
    }
    public ResultSet findClassDatesById(long id) throws SQLException {
        String findQuery = "SELECT * FROM class_dates WHERE id = '" + id + "';";
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(findQuery);
        return rs;
    }
    @Override
    public Long insert(ClassDates classd) throws SQLException {
        String insertQuery = "INSERT INTO class_dates(type, date, seats_booked) VALUES ('" +  classd.getType() + "','" + classd.getDate() + "','" + classd.getSeats() + "')";
    Statement stmt = connection.createStatement();
    stmt.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
    ResultSet rs = stmt.getGeneratedKeys();
    if (rs.next()) {
        System.out.println("Inserted a new reconrd! New id: " + rs.getLong(1));
    }
    return rs.getLong(1);
    }

    // main for testing purposes
    public static void main(String[] args) throws SQLException {
        ClassDate classDao = new MySQLClassDao();
        ClassDates classDat = new ClassDates(
                "the third",
                "2020-11-1",
                1203
        );
        classDao.insert(classDat);
        List<ClassDates> classd = classDao.all();
        for(ClassDates clas : classd) {
            System.out.println(clas);
        }

    }
}
