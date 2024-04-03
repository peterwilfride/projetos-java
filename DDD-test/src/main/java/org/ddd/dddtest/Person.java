package org.ddd.dddtest;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
//    @JoinColumn(name = "person_id")
    private List<Post> posts = new ArrayList<>();

    public void add_post(Post post) {
        this.posts.add(post);
        post.setPerson(this);
    }

    public void remove_post(Post post) {
        this.posts.remove(post);
        post.setPerson(this);
    }

    public Person(String name) {
        this.name = name;
    }
}
