package com.technews.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "votes")
public class Vote implements Serializable {
//The keyword implements is similar in Typescript because you IMPLEMENT an interface but EXTEND a parent class.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer userId;
    private Integer postId;

   public Vote(){

   }

    public Vote(Integer postId, Integer userId, Integer id) {
        this.postId = postId;
        this.userId = userId;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        Vote vote = (Vote) o;
        return Objects.equals(id, vote.id) && Objects.equals(userId, vote.userId) && Objects.equals(postId, vote.postId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, postId);
    }

    @Override
    public String toString() {
        return "Vote{" +
                "id=" + id +
                ", userId=" + userId +
                ", postId=" + postId +
                '}';
    }
}
