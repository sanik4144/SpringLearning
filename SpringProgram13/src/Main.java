import in.sp.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String config_path = "/in/sp/resources/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_path);

        Student std = (Student) context.getBean(Student.class);
        std.display();
    }
}