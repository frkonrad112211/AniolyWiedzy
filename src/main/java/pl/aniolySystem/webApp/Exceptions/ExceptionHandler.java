package pl.aniolySystem.webApp.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {


    @org.springframework.web.bind.annotation.ExceptionHandler(value = {ChildNotFoundException.class})
    public ResponseEntity<Object> childNotFoundException(Exception ex) {
        ApiErrorResponse response = new ApiErrorResponse(
                HttpStatus.NOT_FOUND,
                HttpStatus.NOT_FOUND.value(),
                "Child not found");
        return new ResponseEntity<>(response, response.getStatus());
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(value = {GuardianNotFoundException.class})
    public ResponseEntity<Object> guardianNotFoundException(Exception ex) {
        ApiErrorResponse response = new ApiErrorResponse(
                HttpStatus.NOT_FOUND,
                HttpStatus.NOT_FOUND.value(),
                "Guardian not found");
        return new ResponseEntity<>(response, response.getStatus());
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(value = {VoloNotFoundException.class})
    public ResponseEntity<Object> voloNotFoundException(Exception ex) {
        ApiErrorResponse response = new ApiErrorResponse(
                HttpStatus.NOT_FOUND,
                HttpStatus.NOT_FOUND.value(),
                "Volo not found");
        return new ResponseEntity<>(response, response.getStatus());
    }
}
