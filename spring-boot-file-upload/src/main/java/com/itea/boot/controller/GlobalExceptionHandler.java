package com.itea.boot.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @ClassName GlobalExceptionHandler
 * @Describe
 * @create 2019-03-12 13:28
 * @Version 1.0
 **/
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MultipartException.class)
    public String handleErrorl(MultipartException e, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("message", e.getCause().getMessage());
        return "redirect:/uploadStatus";
    }
}
