package com.example.mini_blog.dto;

import com.example.mini_blog.entity.Blog;
import lombok.Getter;
import lombok.Setter;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.List;

@Getter
@Setter
public class AuthorDto {
    private String name;
    private String bio;
   private List<BlogDto>blogs;

}
