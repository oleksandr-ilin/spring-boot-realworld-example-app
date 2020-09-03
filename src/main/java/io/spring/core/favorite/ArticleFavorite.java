package io.spring.core.favorite;

public class ArticleFavorite {
    private String articleId;
    private String userId;

    public ArticleFavorite() {

    }

    public ArticleFavorite(String articleId, String userId) {
        this.articleId = articleId;
        this.userId = userId;
    }

    public String getArticleId() {
        return articleId;
    }

    public String getUserId() {
        return userId;
    }
}
