import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {

    @Bean("stdObj1")
    public Student stdId1(){
        Student std = new Student();
        std.setName("Anik");
        std.setRollno(101);
        std.setEmail("anik@gmail.com");

        return std;
    }

    @Bean("stdObj2")
    public Student stdId2(){
        Student std = new Student();
        std.setName("Rumel");
        std.setRollno(102);
        std.setEmail("rumel@gmail.com");

        return std;
    }
}
