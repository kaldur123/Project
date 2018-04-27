package logos;

import logos.logos.shop.Director;
import logos.logos.shop.Zoo;

import javax.persistence.EntityManager;
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
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("mysql");
        EntityManager em = managerFactory.createEntityManager();

        em.getTransaction().begin();
//        Director director = new Director();
//        director.setFullName("Bill Hill");
//        director.setAge(34);
//        director.setEmail("qwer@gmail.com");
//        director.setHobby("reading");
//        em.persist(director);
//
//        Zoo zoo = new Zoo();
//        zoo.setName("Animal Planet");
//        zoo.setAddress("Green St. 20");
//        zoo.setDescription("Welcome");
//        zoo.setSquare(50);
//        zoo.setDirector(director);
//
//        em.persist(zoo);

        Director director = em.find(Director.class, 1);

        System.out.println(director.getFullName() + " " + director.getId());


        em.getTransaction().commit();
        em.close();
        managerFactory.close();
    }
}
