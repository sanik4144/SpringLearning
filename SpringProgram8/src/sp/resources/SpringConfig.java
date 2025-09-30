package sp.resources;

import sp.beans.Address;
import sp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public Address addrId(){
        Address addr = new Address(200, "Gazipur", 1232);

        return addr;
    }

    @Bean
    public Student stdId(){
        Student std = new Student(103, "Anik", addrId());

        return std;
    }
}
