import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Employee.class);
        Employee emp1 = (Employee) context.getBean("employee");

        emp1.display();
    }
}