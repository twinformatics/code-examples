package at.twinformatics.metricsdemo;

import at.twinformatics.metricsdemo.aop.Counted;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Counted
    public String thisShouldBeCounted(long value) {
        return "value is " + value;
    }
}
