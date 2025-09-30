import in.sp.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String config_path = "/in/sp/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_path);

        Employee emp = (Employee) context.getBean("empId");
        emp.display();
    }
}