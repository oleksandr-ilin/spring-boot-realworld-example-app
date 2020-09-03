package io.spring.application.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.joda.time.DateTime;

public class CommentData {
    private String id;
    private String body;
    @JsonIgnore
    private String articleId;
    private DateTime createdAt;
    private DateTime updatedAt;
    @JsonProperty("author")
    private ProfileData profileData;

    public CommentData() {

    }

    public CommentData(String id, String body, String articleId, DateTime createdAt, DateTime updatedAt,

            ProfileData profileData) {

        this.id = id;
        this.body = body;
        this.articleId = articleId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;

        this.profileData = profileData;
    }

    public String getBody() {
        return body;
    }

    public DateTime getCreatedAt() {
        return createdAt;
    }

    public String getId() {
        return id;
    }

    public ProfileData getProfileData() {
        return profileData;
    }

    public DateTime getUpdatedAt() {
        return updatedAt;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProfileData(ProfileData profileData) {
        this.profileData = profileData;
    }

    public void setUpdatedAt(DateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
