package com.onemantech.controller;

import com.onemantech.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class springController {
    @Autowired
    Employee employee;
}
