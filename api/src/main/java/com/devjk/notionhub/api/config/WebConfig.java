package com.devjk.notionhub.api.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

@Slf4j
@Configuration
public class WebConfig implements WebMvcConfigurer {

  @Value("${cors.mapping}")
  private String corsMapping;

  @Value("${cors.allowedOrigins}")
  private String[] corsAllowedOrigins;

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping(corsMapping)
            .allowedOrigins(corsAllowedOrigins);
  }
}
