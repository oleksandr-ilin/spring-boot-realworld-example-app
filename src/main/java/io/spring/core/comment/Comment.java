package io.spring.core.comment;

import org.joda.time.DateTime;

import java.util.UUID;

public class Comment {
    private String id;
    private String body;
    private String userId;
    private String articleId;
    private DateTime createdAt;

    public Comment() {

    }

    public Comment(String body, String userId, String articleId) {
        this.id = UUID.randomUUID().toString();
        this.body = body;
        this.userId = userId;
        this.articleId = articleId;
        this.createdAt = new DateTime();
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

    public String getUserId() {
        return userId;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Comment) {
            return this.id.equals(((Comment) obj).id);
        }
        return super.equals(obj);
    }
}
