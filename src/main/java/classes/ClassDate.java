package classes;

import java.sql.SQLException;
import java.util.List;

public interface ClassDate {
    List<ClassDates> all();
    Long insert(ClassDates classd) throws SQLException;

}
