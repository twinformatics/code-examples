package at.twinformatics.devjf.camunda.delegate;

import at.twinformatics.devjf.camunda.service.UsefulService;
import lombok.RequiredArgsConstructor;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DoSomethingUsefulDelegate implements JavaDelegate {
    private final UsefulService usefulService;

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        usefulService.executeUsefulCalculations(execution);
    }
}
