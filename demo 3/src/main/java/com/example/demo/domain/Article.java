package com.example.demo.domain;

import jakarta.persistence.Entity;

import java.time.LocalDateTime;

@Entity
public class Article {
    private Long id;
    private String title;
    private String hashtag;

    //metadata
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifyAt;
    private String modifiedBy;
}
