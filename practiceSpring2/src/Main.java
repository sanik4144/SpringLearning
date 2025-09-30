import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(springConfig.class);

        Employee emp1 = (Employee) context.getBean("empObj1");
        emp1.display();
    }
}