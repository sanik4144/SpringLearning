import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sp.beans.Student;
import sp.resources.SpringConfig;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student std = (Student) context.getBean("stdId");

        std.display();
    }
}