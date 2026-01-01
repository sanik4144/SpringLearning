package in.sp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Alien alien1 = new Alien();
        alien1.setId(104);
        alien1.setName("Riad");
        alien1.setTech("Flutter");

        Configuration config = new Configuration();
        config.addAnnotatedClass(in.sp.Alien.class).configure();

        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();

        /* ----------Inserting Data-------------*/
        Transaction transaction = session.beginTransaction();
        session.persist(alien1);
        transaction.commit();

        /* -----------Displaying Data-----------*/
//        Alien a1 = session.find(Alien.class, 102);
//        System.out.println(a1.getName() +'\n'+ a1.getTech());

        /*------------Updating Data--------------*/
//        Transaction transaction = session.beginTransaction();
//        session.merge(alien1);                 //Update if ID is there else create and insert new data
//        transaction.commit();

        /*------------Deleting Data--------------*/
//        Transaction transaction = session.beginTransaction();
//        /*Alien delAlien = session.find(Alien.class, 101);*/
//        Alien delAlien = session.getReference(Alien.class,102); //We use getReference because this is not running the sql query to select the rows from table.
//        session.remove(delAlien);
//        transaction.commit();

        session.close();
        factory.close();
    }
}