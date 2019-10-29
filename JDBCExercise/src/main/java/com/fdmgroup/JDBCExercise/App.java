package com.fdmgroup.JDBCExercise;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        User u = new User();
        u.setEmail("aaa");
        u.setFirstName("bbb");
        u.setLastName("sdsad");
        u.setPassword("dfs");
        u.setRole("asda");
        u.setStatus("sdad");
        u.setUsername("asda");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Users");
        UserJPAImpl userJPA = new UserJPAImpl(emf);
        userJPA.addItem(u);
    }
}
