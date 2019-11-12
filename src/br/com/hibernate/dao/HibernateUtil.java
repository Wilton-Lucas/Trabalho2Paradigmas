package br.com.hibernate.dao;

import org.hibernate.HibernateException;   
import org.hibernate.Session;   
import org.hibernate.SessionFactory;   
import org.hibernate.cfg.AnnotationConfiguration;   
import org.hibernate.cfg.Configuration;
  
public class HibernateUtil {   
       
    private static final SessionFactory sessionFactory;   
       
    static {   
        try {   
            sessionFactory = new Configuration()   
                .configure()   
                .buildSessionFactory();   
               
        } catch (Throwable ex) {   
            // Log exception!   
            throw new ExceptionInInitializerError(ex);   
        }   
    }   
       
    public static Session getSession() throws HibernateException {   
        return sessionFactory.openSession();   
    }   
}  
