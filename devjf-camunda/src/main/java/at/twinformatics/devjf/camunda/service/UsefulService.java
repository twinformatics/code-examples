package at.twinformatics.devjf.camunda.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;

public interface UsefulService {
    void executeUsefulCalculations(DelegateExecution delegateExecution) throws InterruptedException;
}
