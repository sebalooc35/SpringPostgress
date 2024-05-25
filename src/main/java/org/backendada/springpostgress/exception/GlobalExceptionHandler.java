package org.backendada.springpostgress.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.backendada.springpostgress.user.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorResponse> handleRuntimeException(RuntimeException ex, HttpServletRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(
                "Not Found", ex.getMessage(), HttpStatus.NOT_FOUND.value(), request.getRequestURI(), new Date().toString());

        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
