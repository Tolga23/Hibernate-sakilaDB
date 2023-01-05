package com.uniyaz.dao;

import com.uniyaz.HibernateUtil;
import com.uniyaz.domain.Actor;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.omg.PortableInterceptor.ACTIVE;

import java.util.List;

public class ActorDao {

    public List<Actor> findAll(){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session currentSession = sessionFactory.openSession();
        Query query = currentSession.createQuery("select actor from Actor actor");
        List<Actor> actorList = query.list();
        return actorList;
    }

    public Actor save(Actor actor){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session currentSession = sessionFactory.openSession();
        Transaction transaction = currentSession.beginTransaction();
        actor = (Actor) currentSession.merge(actor);
        transaction.commit();
        return actor;
    }

    public void delete(Actor actor){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session currentSession = sessionFactory.openSession();
        Transaction transaction = currentSession.beginTransaction();
        currentSession.delete(actor);
        transaction.commit();
    }

    public List<Actor> findActorById(Long id){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session currentSession = sessionFactory.openSession();
        Query query = currentSession.createQuery("Select actor from Actor actor where actor.Id = :id ");
        query.setParameter("id",id);
        List<Actor> actorList = query.list();
        return actorList;
    }




}
