package com.example.mini_blog.service;

import com.example.mini_blog.dto.AuthorDto;
import com.example.mini_blog.mapper.AuthorMapper;
import com.example.mini_blog.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AuthorService {
    private final AuthorMapper authorMapper;
    private final AuthorRepository authorRepository;
    public List<AuthorDto> findAll() {

        return authorRepository.findAll()
                .stream()
                .map(authorMapper::toAuthorDto)
                .collect(Collectors.toList());
    }

}
