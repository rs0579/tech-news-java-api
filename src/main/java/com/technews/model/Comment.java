package com.technews.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "comments")
public class Comment implements Serializable {
//The keyword implements is similar in Typescript because you IMPLEMENT an interface but EXTEND a parent class.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String commentText;
    private Integer userId;
    private Integer postId;

    public Comment(){

    }

    public Comment(Integer id, String commentText, Integer userId, Integer postId) {
        this.id = id;
        this.commentText = commentText;
        this.userId = userId;
        this.postId = postId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(id, comment.id) && Objects.equals(commentText, comment.commentText) && Objects.equals(userId, comment.userId) && Objects.equals(postId, comment.postId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, commentText, userId, postId);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", commentText='" + commentText + '\'' +
                ", userId=" + userId +
                ", postId=" + postId +
                '}';
    }
}
