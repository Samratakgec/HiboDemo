package org.example;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class Course {
    @Id
    private int cid ;
    private String cname ;
    private  int duration ;
    @Embedded
    private Instructor instructor ;
    Course(){}
    Course (int cid, String cname, int duration, Instructor instructor)
    {
        this.cid = cid ;
        this.cname = cname ;
        this.duration = duration ;
        this.instructor = instructor ;
    }
}
