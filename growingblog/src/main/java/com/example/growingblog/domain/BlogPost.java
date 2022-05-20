package com.example.growingblog.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Date dateCreated;

}
