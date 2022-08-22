package JavaBasedConfig;

import JavaBasedConfig.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.naming.Name;

@Configuration
public class ApplicationConfig {

    @Bean(name = "student")
    public Student getStudent() {
        return new Student(501169, "Hassan");
    }



}
