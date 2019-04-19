package by.matrosov.springlogger.tasks;

import by.matrosov.springlogger.service.MyCustomException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ExceptionTask {

    @Scheduled(fixedRate = 5000)
    public void reportException() {
        try {
            throw new MyCustomException();
        }catch (MyCustomException e){
            log.error("Error every 5 sec");
        }
    }
}
