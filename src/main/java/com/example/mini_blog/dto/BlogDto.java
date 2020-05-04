package com.example.mini_blog.dto;

import com.example.mini_blog.entity.Author;
import com.example.mini_blog.entity.Comment;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class BlogDto {
   private String title;
   private LocalDate postDate;
   private Author author;
   private String description;
   private List<CommentDto> comments;

}
