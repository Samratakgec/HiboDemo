package org.example;

import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.beans.BeanProperty;
import java.beans.JavaBean;

@Embeddable
public class Instructor {

    private int id ;
    private String name ;
    private String contact ;
    Instructor(){}
    Instructor(int id, String name, String contact)
    {
        this.id = id ;
        this.name = name ;
        this.contact = contact ;
    }
}
