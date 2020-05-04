package com.example.mini_blog.entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name="blogs")
public class Blog extends BaseEntity {

    @Column(name="title")
    public String title;

    @Column(name="post_date")
    public LocalDate postDate;

    @ManyToOne
    @JoinColumn(name="author_id")
    public Author author;

    @Column(name="description")
    public String description;

    @ManyToOne
    @JoinColumn(name="comment_id")
    public Comment comment;

}
