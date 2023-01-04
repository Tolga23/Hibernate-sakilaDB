package com.uniyaz.dao;

import com.uniyaz.HibernateUtil;
import com.uniyaz.domain.Actor;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class ActorDao {

    public List<Actor> findAll(){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session currentSession = sessionFactory.openSession();
        Query query = currentSession.createQuery("select actor from Actor actor");
        List<Actor> actorList = query.list();
        return actorList;
    }


}
