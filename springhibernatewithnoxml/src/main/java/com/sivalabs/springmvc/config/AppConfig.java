package com.sivalabs.springmvc.config;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

/**
 * @author SivaLabs
 *
 */
@Import({RepositoryConfig.class})
@Configuration
public class AppConfig
{
    //<context:property-placeholder location="classpath:application.properties"></context:property-placeholder>
    @Bean
    public PropertySourcesPlaceholderConfigurer getPropertyPlaceholderConfigurer()
    {
    	//final var configurer = new PropertySourcesPlaceholderConfigurer();
    	//configurer.setProperties(properties);
    	
    	PropertySourcesPlaceholderConfigurer ppc = new PropertySourcesPlaceholderConfigurer();
        ppc.setLocation(new ClassPathResource("com/sivalabs/springmvc/config/application.properties"));
        ppc.setIgnoreUnresolvablePlaceholders(true);
        return ppc;
    }
}