package com.example.growingblog.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private Date dateCreated;

    public static class Builder{

        private Long id;
        private String content;
        private Date dateCreated;

        public Builder(String content){
            this.content = content;
        }

        public Builder setId(Long id){
            this.id = id;
            return this;
        }

        public Builder setDateCreated(Date dateCreated){

            this.dateCreated = dateCreated;
            return this;
        }

        public BlogPost build(){

            BlogPost blogPost = new BlogPost();
            blogPost.id = id;
            blogPost.content = content;
            blogPost.dateCreated = dateCreated;

            return blogPost;
        }


    }

    @Override
    public String toString() {
        return "BlogPost{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", dateCreated=" + dateCreated +
                '}';
    }

}
