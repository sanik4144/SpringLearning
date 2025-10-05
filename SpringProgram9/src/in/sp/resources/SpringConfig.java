package in.sp.resources;

import in.sp.beans.Address;
import in.sp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
    public Student createStdObj(){
        Student std = new Student();

        std.setName("Anik");
        std.setRollno(4922);
//        std.setAddress(createAddrObj());         //Manual DI

        return std;
    }
}
