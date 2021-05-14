package com.devjk.notionhub.exception;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * ErrorResponse 공통 객체로 API 오류 시
 * 공통된 형식의 리턴 body.
 * {
 *   message : String,
 *   status : Integer, // (Http status code)
 *   code : String,    // (API Error code)
 *   errors : [
 *     {field : String, value : String, reason : String}
 *   ]
 * }
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ErrorResponse {

  private String message;
  private int status;
  private List<FieldError> errors;
  private String code;

  private ErrorResponse(int status, String code, String message, List<FieldError> fieldErrors) {
    this.status = status;
    this.code = code;
    this.message = message;
    this.errors = fieldErrors;
  }

  /**
   * 정적 팩토리 패턴으로 가져옴.
   * 에러객체 생성은 ErrorResponse.of(ErrorCode, fieldErrors) 로 생성
   * @param errorCode
   * @param fieldErrors
   * @return
   */
  public static ErrorResponse of(ErrorCode errorCode, List<FieldError> fieldErrors) {
    return new ErrorResponse(
            errorCode.getStatus(),
            errorCode.getCode(),
            errorCode.getMessage(),
            fieldErrors
    );
  }

  public static ErrorResponse of(ErrorCode errorCode) {
    return ErrorResponse.of(errorCode, new ArrayList<>());
  }

  @Getter
  @NoArgsConstructor
  public static class FieldError {
    private String field;
    private String value;
    private String reason;
  }

}
