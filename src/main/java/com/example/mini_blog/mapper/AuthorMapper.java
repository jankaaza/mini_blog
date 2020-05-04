package com.example.mini_blog.mapper;

import com.example.mini_blog.dto.AuthorDto;
import com.example.mini_blog.entity.Author;

public interface AuthorMapper {

    AuthorDto toAuthorDto(Author author);
}
