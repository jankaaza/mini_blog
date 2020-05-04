package com.example.mini_blog.entity;

import lombok.Getter;
import lombok.Setter;
import org.w3c.dom.Text;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="authors")
public class Author extends BaseEntity{

    @Column(name="name")
    public String name;

    @Column(name="bio")
    public String bio;

    @OneToOne
    @JoinColumn(name="blog_id")
    public Blog blog;

}
