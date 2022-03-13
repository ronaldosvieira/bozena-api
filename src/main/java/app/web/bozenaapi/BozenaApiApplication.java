package app.web.bozenaapi;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BozenaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BozenaApiApplication.class, args);
    }

    @Bean
    public OpenAPI bozenaOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Bozena API")
                        .description("Bozena is an open-source tournament manager API built for Taça Bozena.")
                        .version("0.0.1-SNAPSHOT")
                        .license(new License().name("MIT"))
                );
    }

}
