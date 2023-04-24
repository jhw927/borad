package com.example.demo.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private Article article;
    private String content;
    private String hashtag;

    //metadata
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifyAt;
    private String modifiedBy;
}
