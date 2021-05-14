package com.devjk.notionhub.api.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Exception Handler
 * 다양한 예외 발생 시 아래에서 ResponseEntity를 정의한다.
 * 즉, 비즈니스 레벨에서 예외 상황 시 직접 오류 객체를 보내는 것은 지양하고
 * Exception을 발생시켜 아래에서 핸들링 할 것.
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

  /**
   * 정의되지 않은 Exception 예외 발생시 internal server error 반환
   * @param e
   * @return responseEntity
   */
  @ExceptionHandler(Exception.class)
  private ResponseEntity<ErrorResponse> handleException(Exception e) {
    if(log.isErrorEnabled()) {
      log.error("Exception", e);
    }
    final ErrorResponse errorResponse = ErrorResponse.of(ErrorCode.UNKNOWN_ERROR);
    return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
  }


}
