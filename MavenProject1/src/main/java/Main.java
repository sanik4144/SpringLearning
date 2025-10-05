import in.sp.beans.Students;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String config_path = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_path);
        Students std = (Students) context.getBean("stdId");

        std.display();
    }
}