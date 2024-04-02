package l3.miage.shopcook.user;

public class UserDTO {

    private String username;

    public UserDTO(String username) {
        this.username = username;

    }

    public UserDTO() {
        this.username = "";

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
