package com.cqupt.knowtolearn.exception;

import com.cqupt.knowtolearn.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Ray
 * @date 2023/7/20 16:43
 * @description 全局异常处理
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(KnowException.class)
    @ResponseStatus(HttpStatus.OK)
    public Result captureException(KnowException e) {
        logger.error("操作异常: {}",e.getException(),e);
        return Result.fail(500,e.getException());
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Result exception(Exception e){
        logger.error("系统异常: {}",e.getMessage(),e);
        return Result.build(500,"error",e.getMessage());
    }
}
