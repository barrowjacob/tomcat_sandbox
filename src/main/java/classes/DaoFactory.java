package classes;

import java.sql.SQLException;

public class DaoFactory {
        private static ClassDate classDao;

        public static ClassDate getClassDao() throws SQLException {
            if (classDao == null) {
                classDao = new MySQLClassDao();
            }
            return classDao;
        }
    }

