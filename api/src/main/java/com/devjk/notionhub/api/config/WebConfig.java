package com.devjk.notionhub.api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

  @Value("${cors.mapping}")
  private String corsMapping;

  @Value("${cors.allowedOrigins")
  private String[] corsAllowedOrigins;

  @Override
  public void addCorsMappings(CorsRegistry registry) {

    // FIXME: 이거 application.yml 에서 불러와서 설정해주어야 함.

    registry.addMapping("/**")
            .allowedOrigins("*");
  }
}
