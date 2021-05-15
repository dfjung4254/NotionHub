package com.devjk.notionhub.api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {

  @Value("${cors.mapping}")
  private String corsMapping;

  @Value("${cors.allowedOrigins")
  private String corsAllowedOrigins;

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping(corsMapping)
            .allowedOrigins(corsAllowedOrigins);
  }
}
