package in.sp.resources;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SpringConfig {

    @Bean
    public Address createAddrObj(){
        Address addr = new Address();

        addr.setHouseno(10);
        addr.setCity("Dhaka");
        addr.setPincode(2934);

        return addr;
    }

    @Bean
    public Subjects createSubjObj(){
        Subjects subj = new Subjects();

        List<String> subject_list = new ArrayList<String>();
        subject_list.add("Java");
        subject_list.add("DS");
        subject_list.add("Algorithm");

        subj.setSubjects(subject_list);

        return subj;
    }

    @Bean
    public Student createStdObj(){
        Student std = new Student();

        std.setName("Anik");
        std.setRollno(4922);
//        std.setAddress(createAddrObj());         //Manual DI
//        std.setSubjects(createSubjObj());          //Manual DI

        return std;
    }
}
