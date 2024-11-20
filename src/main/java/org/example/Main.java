package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        Configuration config = new Configuration() ;
        config.configure("config.xml") ;
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session= sessionFactory.openSession();
      // Book b1 = new Book(10,"Java");
       Instructor instructor = new Instructor (1,"Manisha", "1203456788") ;
       Course course = new Course(1,"Java",8,instructor) ;
        Transaction t=session.beginTransaction();
        session.save(course) ;
        t.commit();
    }
}