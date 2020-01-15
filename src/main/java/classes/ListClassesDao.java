package classes;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ListClassesDao implements ClassDate{
    private List<ClassDates> classd;
    @Override
    public List<ClassDates> all() {
        if (classd == null) {
            classd = generateClassDates();
        }
        return classd;
    }

    @Override
    public Long insert(ClassDates newAd) throws SQLException {
        if (classd == null) {
            classd = generateClassDates();
        }
        newAd.setId((long) classd.size());
        classd.add(newAd);
        return newAd.getId();
    }

    private List<ClassDates> generateClassDates() {
        List<ClassDates> classd = new ArrayList<>();
        classd.add(new ClassDates(
                "conceal carry",
                "2020-02-01",
                12
        ));
                return classd;
    }
}
