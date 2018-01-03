package at.twinformatics.examples.testserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@SpringBootApplication
@Configuration
@EnableWebFlux
public class Main {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public RouterFunction<ServerResponse> helloWorldRouterFunction() {

        return RouterFunctions.route(RequestPredicates.path("/"),
                serverRequest ->
                        ServerResponse.ok().body(Mono.just("Hello World!"), String.class));
    }
}
