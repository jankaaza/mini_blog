package com.example.mini_blog.controller;

import com.example.mini_blog.dto.AuthorDto;
import com.example.mini_blog.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
@RequiredArgsConstructor
public class AuthorController {
   private final AuthorService authorService;
    @GetMapping
    private List<AuthorDto> findAll() {
        return authorService.findAll();
    }
}
