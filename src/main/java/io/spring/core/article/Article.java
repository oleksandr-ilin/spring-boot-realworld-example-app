package io.spring.core.article;

import org.joda.time.DateTime;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;


public class Article {
    private String userId;
    private String id;
    private String slug;
    private String title;
    private String description;
    private String body;
    private List<Tag> tags;
    private DateTime createdAt;
    private DateTime updatedAt;

    public Article() {

    }

    public Article(String title, String description, String body, String[] tagList, String userId) {
        this(title, description, body, tagList, userId, new DateTime());
    }

    public Article(String title, String description, String body, String[] tagList, String userId, DateTime createdAt) {
        this.id = UUID.randomUUID().toString();
        this.slug = toSlug(title);
        this.title = title;
        this.description = description;
        this.body = body;
        this.tags = Arrays.stream(tagList).collect(toSet()).stream().map(Tag::new).collect(toList());
        this.userId = userId;
        this.createdAt = createdAt;
        this.updatedAt = createdAt;
    }

    public void update(String title, String description, String body) {
        if (!"".equals(title)) {
            this.title = title;
            this.slug = toSlug(title);
        }
        if (!"".equals(description)) {
            this.description = description;
        }
        if (!"".equals(body)) {
            this.body = body;
        }
        this.updatedAt = new DateTime();
    }

    private String toSlug(String title) {
        return title.toLowerCase().replaceAll("[\\&|[\\uFE30-\\uFFA0]|\\’|\\”|\\s\\?\\,\\.]+", "-");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Article) {
            return this.id.equals(((Article) obj).id);
        }
        return super.equals(obj);
    }


    @Override
    public int hashCode() {
        return this.id.hashCode();
    }

    public String getBody() {
        return body;
    }


    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public DateTime getCreatedAt() {
        return createdAt;
    }

    public String getId() {
        return id;
    }

    public String getSlug() {
        return slug;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public DateTime getUpdatedAt() {
        return updatedAt;
    }

    public String getUserId() {
        return userId;
    }
}
