package com.example.InhautBackendFinal.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Permite CORS en todas las rutas
                .allowedOrigins("http://127.0.0.1:5501/","https://www.grupoinhaut.com/") // Origen permitido
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos permitidos
                .allowedHeaders("*") // Encabezados permitidos
                .allowCredentials(true); // Permite el uso de credenciales (cookies, headers de autenticación)
    }
}