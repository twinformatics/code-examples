package at.twinformatics.examples.testserver.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ServiceTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void helloWorldTest() {
        String body = this.restTemplate.getForObject("/", String.class);
        assertThat(body).isEqualTo("Hello World!");
    }

    @Test
    public void testDataTest() {
        String body = this.restTemplate.getForObject("/test/testData", String.class);
        assertThat(body).isEqualTo("[0,1,2,3,4]");
    }

    @Test
    public void testDataTestWithoutFlux() {
        String body = this.restTemplate.getForObject("/test/testDataWithoutFlux", String.class);
        assertThat(body).isEqualTo("[0,1,2,3,4]");
    }
}