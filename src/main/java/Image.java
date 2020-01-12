public class Image {

    private String url;
    private String title;
    private String description;

    public Image(String url, String title, String description) {
        this.url = url;
        this.title = title;
        this.description = description;
    }

    public String getUrl() {
        return this.url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


}
