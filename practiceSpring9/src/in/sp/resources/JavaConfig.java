package in.sp.resources;

import in.sp.beans.Dateofbirth;
import in.sp.beans.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public Dateofbirth dobId(){
        Dateofbirth dob = new Dateofbirth();
        dob.setDay(21);
        dob.setMonth("December");
        dob.setYear(2002);

        return dob;
    }

    @Bean
    public Employee empId(){
        Employee emp = new Employee();
        emp.setEmpId(1001);
        emp.setName("Anik");

        return emp;
    }
}
