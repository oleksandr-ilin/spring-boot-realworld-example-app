package io.spring.application.data;



public class ArticleFavoriteCount {
    private String id;

    private Integer count;


    public String getId() {
        return id;
    }

    public Integer getCount() {
        return count;
    }


    public void setId(String id) {
        this.id = id;
    }


    public void setCount(Integer count) {
        this.count = count;
    }
}
