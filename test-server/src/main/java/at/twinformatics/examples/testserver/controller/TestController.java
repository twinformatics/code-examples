package at.twinformatics.examples.testserver.controller;

import at.twinformatics.examples.testserver.dtos.NumberPair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;


@RestController
@RequestMapping("test")
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/testData")
    public Flux<Integer> getTestData() {
        return Flux.fromStream(IntStream.range(0, 5).boxed());
    }

    @GetMapping("/testDataWithoutFlux")
    public List<Integer> getTestDataWithoutFlux() {
        return Arrays.asList(IntStream.range(0, 5).boxed().toArray(Integer[]::new));
    }

    @GetMapping("/testAddNumbers")
    public Integer addNumbers(@RequestBody NumberPair numberPair) {
        LOGGER.info(numberPair.toString());
        return numberPair.getA() + numberPair.getB();
    }
}
