package io.spring.application.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.joda.time.DateTime;

import java.util.List;

public class ArticleData {
    private String id;
    private String slug;
    private String title;
    private String description;
    private String body;
    private boolean favorited;
    private int favoritesCount;
    private DateTime createdAt;
    private DateTime updatedAt;
    private List<String> tagList;
    @JsonProperty("author")
    private ProfileData profileData;



     public ArticleData() {

     }

     
    public ArticleData(String id, String slug, String title, String description, String body, boolean favorited,
            int favoritesCount, DateTime createdAt, DateTime updatedAt, List<String> tagList,

            ProfileData profileData) {

        this.id = id;
        this.slug = slug;
        this.title = title;
        this.description = description;
        this.body = body;
        this.favorited = favorited;
        this.favoritesCount = favoritesCount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.tagList = tagList;

        this.profileData = profileData;
    }

    public String getBody() {
        return body;
    }

    public DateTime getCreatedAt() {
        return createdAt;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public String getSlug() {
        return slug;
    }

    public String getTitle() {
        return title;
    }

    public DateTime getUpdatedAt() {
        return updatedAt;
    }

    public int getFavoritesCount() {
        return favoritesCount;
    }

    public ProfileData getProfileData() {
        return profileData;
    }

    public List<String> getTagList() {
        return tagList;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFavoritesCount(int favoritesCount) {
        this.favoritesCount = favoritesCount;
    }

    public void setProfileData(ProfileData profileData) {
        this.profileData = profileData;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }

    public void setUpdatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

}
