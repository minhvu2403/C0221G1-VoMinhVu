package com.picture.entity;

import javax.persistence.*;
import java.util.Date;
@Entity(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String point;
    private String author;
    private String content;
    private Date createAt=new Date(System.currentTimeMillis());
    private int likes;
    public Comment() {
    }

    public Comment(int id, String point, String author, String content, Date createAt, int likes) {
        this.id = id;
        this.point = point;
        this.author = author;
        this.content = content;
        this.createAt = createAt;
        this.likes = likes;
    }

    public Comment(String point, String author, String content, Date createAt, int likes) {
        this.point = point;
        this.author = author;
        this.content = content;
        this.createAt = createAt;
        this.likes = likes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
