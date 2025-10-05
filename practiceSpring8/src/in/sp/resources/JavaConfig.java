package in.sp.resources;

import in.sp.beans.Dateofbirth;
import in.sp.beans.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public Dateofbirth dobId(){
        Dateofbirth dob = new Dateofbirth(21, "December", 2001);

        return dob;
    }

    @Bean
    public Employee empId(){
        Employee emp = new Employee(101, "Anik", dobId());

        return emp;
    }
}
