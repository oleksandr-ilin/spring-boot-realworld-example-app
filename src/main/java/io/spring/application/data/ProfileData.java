package io.spring.application.data;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ProfileData {
    @JsonIgnore
    private String id;
    private String username;
    private String bio;
    private String image;
    private boolean following;

    public ProfileData() {

    }

    public ProfileData(String id, String username, String bio, String image, boolean following) {
        this.id = id;
        this.username = username;
        this.bio = bio;
        this.image = image;
        this.following = following;
    }

    public String getBio() {
        return bio;
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

    public boolean isFollowing() {
        return following;
    }

    public void setBio(String bio) {
        this.bio = bio;
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

    public void setFollowing(boolean following) {
        this.following = following;
    }
}
