package com.example.mini_blog.mapper.impl;

import com.example.mini_blog.dto.AuthorDto;
import com.example.mini_blog.entity.Author;
import com.example.mini_blog.mapper.AuthorMapper;
import org.springframework.stereotype.Service;

@Service
public class AuthorMapperImpl implements AuthorMapper {
    @Override
    public AuthorDto toAuthorDto(Author author) {
        AuthorDto authorDto = new AuthorDto();
        authorDto.setName(author.getName());
        authorDto.setBio(author.getBio());
        return authorDto;
    }
}
