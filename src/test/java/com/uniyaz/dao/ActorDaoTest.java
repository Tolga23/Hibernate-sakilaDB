package com.uniyaz.dao;

import com.uniyaz.domain.Actor;
import com.uniyaz.service.ActorService;
import org.junit.Test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class ActorDaoTest {

    @Test
    public void listAllActors() {
        ActorDao actorDao = new ActorDao();
        List<Actor> actorList = actorDao.findAll();
        for (Actor actor : actorList) {
            System.out.println(actor);
        }

    }

    @Test
    public void saveActor() {
        Actor actor = new Actor();
        actor.setFirstName("Alper");
        actor.setLastName("Hardal");
        actor.setLastUpdate(new Date());

        ActorService actorService = new ActorService();
        actorService.save(actor);

        System.out.println(actor);
    }

    @Test
    public void deleteActor() {
        Actor actor = new Actor();
        actor.setId(200L);

        ActorService actorService = new ActorService();
        actorService.delete(actor);

        System.out.println("Kayıt Silindi");
    }

    @Test
    public void findActorById(){
        Long id = 201L;

        ActorService actorService = new ActorService();
        List<Actor> actorById = actorService.findActorById(id);

        for (Actor actor : actorById) {
            System.out.println(actor);
        }

    }

}
