package com.tongjingcheng.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.accept.ContentNegotiationManagerFactoryBean;

@Configuration
public class AppConfig {

    @Bean
    public ContentNegotiationManagerFactoryBean negotiationManagerFactoryBean(){
        ContentNegotiationManagerFactoryBean contentNegotiationManager =  new ContentNegotiationManagerFactoryBean();
        contentNegotiationManager.setDefaultContentType(MediaType.APPLICATION_JSON);
        return contentNegotiationManager;
    }
}
