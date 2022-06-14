package com.example.growingblog.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Date dateCreated;

    @Override
    public String toString() {
        return "BlogPost{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", dateCreated=" + dateCreated +
                '}';
    }

}
