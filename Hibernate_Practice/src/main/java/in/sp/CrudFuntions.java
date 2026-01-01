package in.sp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CrudFuntions {
    private final static SessionFactory factory;

    static {
        Configuration config = new Configuration();
        config.addAnnotatedClass(in.sp.Employee.class).configure();

        factory = config.buildSessionFactory();
    }

    public void insert(Employee emp) {
        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(emp);
        transaction.commit();

        session.close();
        factory.close();
    }
    public void update(Employee emp){
        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();
        session.merge(emp);
        transaction.commit();

        session.close();
    }
    public void delete(int id){
        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();
        Employee emp = session.getReference(Employee.class, id);
        session.remove(emp);
        transaction.commit();

        session.close();
    }
    public void display(int id){
        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();
        Employee emp = session.find(Employee.class, id);
        System.out.println("Name: "+emp.getName() +'\n'+ "Salary: "+emp.getSalary());
        transaction.commit();

        session.close();
    }
}
