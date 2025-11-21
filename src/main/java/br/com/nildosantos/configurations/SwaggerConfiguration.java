package br.com.nildosantos.configurations;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI cotiOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API de Usuários - COTI Informática")
                        .description("Documentação da API de Usuários desenvolvida pela COTI Informática com Spring Boot.")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("COTI Informática")
                                .url("https://www.cotiinformatica.com.br")
                                .email("contato@cotiinformatica.com.br"))
                        .license(new License()
                                .name("Licença MIT")
                                .url("https://opensource.org/licenses/MIT")));

    }
}