package com.telusko.DemoHib;



import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
		/*//Embedded 
		 * AlienName an = new AlienName(); 
		 * an.setFname("FirstName");
		 * an.setLname("LastName"); 
		 * an.setMname("MiddleName");
		 */
    	// ALT - SHIFT - R : 2 times ,we can all change reference variable at a Time
    	
    	Alien telusko = new Alien();
    	
		/*
		 * telsuko.setAid(103); 
		 * telsuko.setAname("navdeep"); 
		 * telsuko.setColour("black");
		 */
    	telusko.setAid(105);
    	telusko.setColour("Blue");
    	telusko.setName("Tony");
    	
    	//Configuration
    	Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
    	
    	SessionFactory sf = con.buildSessionFactory();
    	
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	//session.save(telsuko);  //Save Data In DB
    	
    	telusko = (Alien)session.get(Alien.class,101); //Fetch Data In DB
    	System.out.println(telusko);
    	
    	telusko = (Alien)session.get(Alien.class,101);
    	System.out.println(telusko);
    	tx.commit();
    	//System.out.println(telsuko);
    }
}
