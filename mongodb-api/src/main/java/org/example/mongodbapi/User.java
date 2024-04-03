package org.example.mongodbapi;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Getter
@Setter
public class User {
    private String id;
    private String name;
    private Date createdAt = new Date();
}
