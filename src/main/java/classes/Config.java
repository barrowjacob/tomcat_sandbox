package classes;

public class Config {

    private String username = "root";
    private String password = "codeup";
    private String url = "jdbc:mysql://localhost/chl?serverTimezone=UTC&useSSL=false";

    public String getUrl() {
        return this.url;
    }
    public String getUsername() {
        return this.username;
    }
    public String getPassword() {
        return this.password;
    }
}


