package com.uniyaz;

import com.uniyaz.dao.ActorDao;
import com.uniyaz.domain.Actor;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        ActorDao actorDao = new ActorDao();
        List<Actor> actorList = actorDao.findAll();
        for (Actor actor : actorList) {
            System.out.println(actor);
        }
    }
}
