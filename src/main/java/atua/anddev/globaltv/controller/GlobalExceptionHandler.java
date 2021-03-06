package atua.anddev.globaltv.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ModelAndView anyExceptionHandler(Exception exception) {
        return new ModelAndView("404").addObject("exception", exception.toString());
    }
}
