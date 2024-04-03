package org.ddd.dddtest;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    @ManyToOne(fetch = FetchType.LAZY)
    private Person person;

    public Post(String title) {
        this.title = title;
    }
}
