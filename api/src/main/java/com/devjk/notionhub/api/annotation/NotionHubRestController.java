package com.devjk.notionhub.api.annotation;

import org.springframework.web.bind.annotation.RestController;
import java.lang.annotation.*;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@RestController
public @interface NotionHubRestController {
}