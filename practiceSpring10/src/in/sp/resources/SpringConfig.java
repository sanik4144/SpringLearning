package in.sp.resources;

import in.sp.beans.Dateofbirth;
import in.sp.beans.Employee;
import in.sp.beans.Expertise;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SpringConfig {
    @Bean
    public Dateofbirth createDobObj(){
        Dateofbirth dob = new Dateofbirth();

        dob.setDay(21);
        dob.setMonth("December");
        dob.setYear(2001);

        return dob;
    }

    @Bean
    public Expertise createExpObj(){
        Expertise exp = new Expertise();

        List<String> exp_list = new ArrayList<String>();
        exp_list.add("FronEnd");
        exp_list.add("BackEnd");
        exp_list.add("DataBase");
        exp.setExpertise(exp_list);

        return exp;
    }

    @Bean
    public Employee createEmpObj(){
        Employee emp = new Employee();
        emp.setEmpId(111);
        emp.setName("Anik");

        return emp;
    }
}
