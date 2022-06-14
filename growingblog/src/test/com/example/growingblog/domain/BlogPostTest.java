package com.example.growingblog.domain;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

class BlogPostTest {

    @Test
    void BlogPost객체_빌더생성_테스트() {

        Date date = new Date();

        BlogPost blogPost = new BlogPost.BlogPostBuilder()
                .content("내용1")
                .id(1L)
                .dateCreated(date)
                .build();
        BlogPost blogPost2 = new BlogPost.BlogPostBuilder()
                .content("내용2")
                .id(2L)
                .dateCreated(date)
                .build();

        assertThat(blogPost.getContent())
                .isEqualTo("내용1");

    }

}