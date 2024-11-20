package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    private int b_id ;
    private String b_name ;
    public Book(int b_id,String b_name)
    {
        this.b_id = b_id ;
        this.b_name = b_name ;
    }
}
