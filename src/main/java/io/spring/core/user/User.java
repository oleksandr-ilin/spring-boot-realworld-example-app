package io.spring.core.user;


import java.util.UUID;

public class User {
    private String id;
    private String email;
    private String username;
    private String password;
    private String bio;
    private String image;


    public User(){

    
    }


    public User(String email, String username, String password, String bio, String image) {
        this.id = UUID.randomUUID().toString();
        this.email = email;
        this.username = username;
        this.password = password;
        this.bio = bio;
        this.image = image;
    }

    public void update(String email, String username, String password, String bio, String image) {
        if (!"".equals(email)) {
            this.email = email;
        }

        if (!"".equals(username)) {
            this.username = username;
        }

        if (!"".equals(password)) {
            this.password = password;
        }

        if (!"".equals(bio)) {
            this.bio = bio;
        }

        if (!"".equals(image)) {
            this.image = image;
        }
    }


    public String getId() {
        return id;
    }

    public String getBio() {
        return bio;
    }

    public String getEmail() {
        return email;
    }

    public String getImage() {
        return image;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            return this.id.equals(((User) obj).id);
        }
        return super.equals(obj);
    }


    @Override
    public int hashCode() {
        return this.id.hashCode();
    }

}
