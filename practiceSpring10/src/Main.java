import in.sp.beans.Employee;
import in.sp.resources.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Employee emp = (Employee) context.getBean(Employee.class);

        emp.display();
    }
}