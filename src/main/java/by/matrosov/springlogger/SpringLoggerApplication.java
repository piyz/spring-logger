package by.matrosov.springlogger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringLoggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringLoggerApplication.class, args);
    }
}
