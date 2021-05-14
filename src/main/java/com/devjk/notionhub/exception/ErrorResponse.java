package com.devjk.notionhub.exception;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ErrorResponse {

  private String message;
  private int status;
  private List<FieldError> errors;
  private String code;

  private ErrorResponse(int status, String code, String message) {
    this.status = status;
    this.code = code;
    this.message = message;
  }

  public static ErrorResponse of(ErrorCode errorCode) {
    return new ErrorResponse(
            errorCode.getStatus(),
            errorCode.getCode(),
            errorCode.getMessage()
    );
  }

  @Getter
  @NoArgsConstructor
  public static class FieldError {
    private String field;
    private String value;
    private String reason;
  }

}
