package at.twinformatics.devjf.camunda.controller;

import lombok.RequiredArgsConstructor;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Executor;

@RestController
@RequiredArgsConstructor
public class StartMyProcessController {
    private static final String PROCESS_KEY = "myProcessKey";

    private final RuntimeService runtimeService;
    private final Executor executor;

    @PostMapping("/api/startMyProcess/{businessKey}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void startMyProcess(
            @PathVariable("businessKey") String businessKey,
            @RequestParam(name = "useShortWay", defaultValue = "false") boolean useShortWay) {
        VariableMap variables =
                Variables.createVariables()
                         .putValueTyped("useShortWay", Variables.booleanValue(useShortWay));
        executor.execute(() -> runtimeService.startProcessInstanceByKey(PROCESS_KEY, businessKey, variables));
    }
}
