/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.openwebinars.taller.app.doc;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author adelm
 */
@Configuration
public class OpenApiDoc {
    @Bean
    public OpenAPI getOpenApi(){
        return new OpenAPI()
                .components(new Components())
                .info(
                        new Info()
                                .title("Taller Open API v3")
                                .description("Como implementar en Springboot")                                
                );
    }
}
