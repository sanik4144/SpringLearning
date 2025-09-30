import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class springConfig {

    @Bean("empObj1")
    public Employee emp(){
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setName("Anik");
        emp.setSalary(10000);

        return emp;
    }

    @Bean("empObj2")
    public Employee emp2(){
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setName("Sayem");
        emp.setSalary(10000);

        return emp;
    }
}
