package com.ly.immortalblog.controller.advice

import com.ly.immortalblog.domain.ImmortalException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import java.lang.Exception

@ControllerAdvice
class ApplicationExceptionHandler{
    @ExceptionHandler(Exception::class)
    fun exceptionHandler() {
        println("handle success")
    }

    @ExceptionHandler(ImmortalException::class)
    fun immortalExceptionHandler() {
        println("handle success")
    }
}
