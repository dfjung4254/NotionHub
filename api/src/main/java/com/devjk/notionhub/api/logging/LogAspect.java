package com.devjk.notionhub.api.logging;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LogAspect {

  private final Logger logger = LoggerFactory.getLogger(LogAspect.class);

  @Around("execution(* com.devjk.notionhub.api.controller.*.*(..))")
  public Object logRequest(ProceedingJoinPoint joinPoint) throws Throwable {

    String method = joinPoint.getSignature().toShortString();

    logger.info(method + " is Starting");
    logger.info(Arrays.toString(joinPoint.getArgs()));

    Object obj = joinPoint.proceed();

    logger.info(method + " is finished");

    return obj;
  }


}
