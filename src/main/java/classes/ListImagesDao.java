package classes;

import java.util.ArrayList;
import java.util.List;

public class ListImagesDao implements Images {
    private List<Image> Images;

    public List<Image> all() {
        if (Images == null) {
            Images = generateImages();
        }
        return Images;
    }

    private List<Image> generateImages() {
        List<Image> Images = new ArrayList<>();
        Images.add(new Image(
                "/img/brown-and-black-wooden-wind-mill-1036148.jpg",
                "country life",
                "picutre of the country"
        ));
        return Images;
    }
}
