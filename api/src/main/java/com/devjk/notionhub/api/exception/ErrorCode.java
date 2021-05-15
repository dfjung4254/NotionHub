package com.devjk.notionhub.api.exception;

/**
 * Back-end API 서버에서 에러 유형과 코드를 채번하여 관리.
 */
public enum ErrorCode {

  UNKNOWN_ERROR(500, "C001", "Unknown Error occured");

  private final int status;
  private final String code;
  private final String message;

  ErrorCode(int status, String code, String message) {
    this.status = status;
    this.code = code;
    this.message = message;
  }

  public int getStatus() {
    return this.status;
  }

  public String getCode() {
    return this.code;
  }

  public String getMessage() {
    return this.message;
  }

}
