package com.uniyaz.dao;

import com.uniyaz.domain.Actor;
import org.junit.Test;

import java.util.List;

public class ActorDaoTest {

    @Test
    public void listAllActors(){
        ActorDao actorDao = new ActorDao();
        List<Actor> actorList = actorDao.findAll();
        for (Actor actor : actorList) {
            System.out.println(actor);
        }

    }

}
