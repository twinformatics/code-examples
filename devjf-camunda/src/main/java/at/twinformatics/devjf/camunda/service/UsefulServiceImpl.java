package at.twinformatics.devjf.camunda.service;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UsefulServiceImpl implements UsefulService {
    @Value("${secondsToWait:10}")
    private int secondsToWait;

    @Override
    public void executeUsefulCalculations(DelegateExecution delegateExecution) throws InterruptedException {
        log.info("Something useful will be done here. I.e. call a REST-Service, Web-Service, calculations, ...");
        log.info("Let's simulate. Got to sleep for about {} second(s)", secondsToWait);
        Thread.sleep(secondsToWait * 1_000);

        log.info("Now add a Process Variable acmeVariable with acmeContent");
        delegateExecution.setVariableLocal("acmeVariable", "acmeContent");

        log.info("And exit the useful Calculations Method");
    }
}
