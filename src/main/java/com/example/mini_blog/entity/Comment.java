package com.example.mini_blog.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name="comments")
public class Comment extends BaseEntity {

   @Column(name="author")
    public String author;

    @Column(name="post_time")
    public LocalDateTime postTime;

    @Column(name="blog_comments")
    public String blogComments;

    @ManyToOne
    @JoinColumn(name = "blog_id")
    public Blog blog;

}
