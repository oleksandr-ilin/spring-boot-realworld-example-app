package io.spring.core.article;


import java.util.UUID;


public class Tag {
    private String id;
    private String name;

    public Tag(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public Tag() {

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Tag) {
            return this.name.equals(((Tag) obj).name);
        }
        return super.equals(obj);
    }

}
