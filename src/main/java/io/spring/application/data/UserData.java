package io.spring.application.data;


public class UserData {
    private String id;
    private String email;
    private String username;
    private String bio;
    private String image;

    public UserData() {

    }

    public UserData(String id, String email, String username, String bio, String image) {

        this.id = id;
        this.email = email;
        this.username = username;
        this.bio = bio;
        this.image = image;
    }


    public String getBio() {
        return bio;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public String getUsername() {
        return username;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
