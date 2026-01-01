package in.sp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        //Student std = new Student(101, "Anik", 92.4f);

        Configuration config = new Configuration();
        config.addAnnotatedClass(in.sp.Student.class).configure();

        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();

//        Transaction transaction = session.beginTransaction();
//        session.persist(std);
//        transaction.commit();

//        Transaction transaction = session.beginTransaction();
//        session.merge(std);
//        transaction.commit();


        Student std = session.find(Student.class, 103);
        System.out.println(std.getName());

//        Transaction transaction = session.beginTransaction();
//        Student std = session.getReference(Student.class, 104);
//        session.remove(std);
//        transaction.commit();

        session.close();
        factory.close();
    }
}