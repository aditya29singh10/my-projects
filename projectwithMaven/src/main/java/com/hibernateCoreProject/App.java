package com.hibernateCoreProject;

import java.util.Date;

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
        System.out.println( "Proje ct started" );
        
        Configuration cfg = new  Configuration();
        cfg.configure("NewHiberCfg.xml");
        
        System.out.println( "Proje ct started cheack it " );
        
        SessionFactory factory = cfg.buildSessionFactory();
        
        System.out.println( "Proje ct started cheack it 2 " );
        
        System.out.println(factory);
        Student st = new Student();
        st.setId(102);
        st.setName("sarita");
        st.setCity("Allaha bad ");
       // System.out.println(factory.isClosed());
        System.out.println(st);
        
        /*
         * 
         * Address class code;
         * 
         * 
         * 
         */
        Address ad = new Address();
        ad.setStreet("street");
        ad.setCity("Delhi");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(1234.1235);
        
        
        
        
        
        
        
        
        
        Session session = factory.openSession();
       Transaction tt= session.beginTransaction();
        session.save(st);
        session.save(ad);
       // session.getTransaction()
        tt.commit();
        session.clear();
        System.out.println("done");
        System.out.println("end");
    }
}
