package com.innercircle.hhpluspushservice.interfaces.common.exception;

import com.innercircle.hhpluspushservice.domain.common.exception.CustomException;
import com.innercircle.hhpluspushservice.interfaces.common.dto.ApiResultResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j(topic = "ExceptionLogger")
public class ApiControllerAdvice {

    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(CustomException.class)
    public ApiResultResponse<Object> handlerCustomException(CustomException e) {
        log.info("CustomException is occurred! {}", e.getMessage());
        return ApiResultResponse.of(HttpStatus.OK, false, e.getMessage(), null);
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ApiResultResponse<Object> handlerException(Exception e) {
        log.error("Exception is occurred! {}", e.getMessage());
        return ApiResultResponse.of(HttpStatus.INTERNAL_SERVER_ERROR, false, null);
    }
}