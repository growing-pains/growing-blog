package com.example.growingblog.domain;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class BlogPostTest {

    @Test
    void BlogPost객체_빌더생성_테스트() {

        Date date = new Date();
        BlogPost blogPost = new BlogPost.Builder("내용~~").build();
        BlogPost blogPost2 = new BlogPost.Builder("내용입니당!")
                .setId(1L)
                .setDateCreated(date)
                .build();


        System.out.println(blogPost.toString());
        System.out.println(blogPost2.toString());

    }

}