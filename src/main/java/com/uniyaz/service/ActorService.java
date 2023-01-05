package com.uniyaz.service;

import com.uniyaz.dao.ActorDao;
import com.uniyaz.domain.Actor;

import java.util.List;

public class ActorService {
    public List<Actor> findAll(){
        ActorDao actorDao = new ActorDao();
        return actorDao.findAll();
    }

    public Actor save(Actor actor){
        ActorDao actorDao = new ActorDao();
        return actorDao.save(actor);
    }

    public void delete(Actor actor){
        ActorDao actorDao = new ActorDao();
        actorDao.delete(actor);
    }

    public List<Actor> findActorById(Long id) {
        ActorDao actorDao = new ActorDao();
        return actorDao.findActorById(id);
    }


}
