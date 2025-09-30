package in.sp.resources;

import in.sp.beans.Address;
import in.sp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public Address addrId(){
        Address addr = new Address();

        addr.setHouseno(34);
        addr.setCity("Gazipur");
        addr.setPincode(3423);

        return addr;
    }

    @Bean
    public Student stdId(){
        Student std = new Student();

        std.setName("Anik");
        std.setRollno(122);
        std.setAddress(addrId());

        return std;
    }
}
