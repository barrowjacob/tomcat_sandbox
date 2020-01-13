package classes;

public class DaoFactory {
        private static Images imagesDao;

        public static Images getImagesDao() {
            if (imagesDao == null) {
                imagesDao = new ListImagesDao();
            }
            return imagesDao;
        }
    }

