package com.example.mini_blog.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
public class CommentDto {
  private String author;
  private LocalDateTime postTime;
  private String blogComments;
  private BlogDto blog;
}
