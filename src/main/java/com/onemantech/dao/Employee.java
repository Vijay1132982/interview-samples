package com.onemantech.dao;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Employee {

    String Name;
    int id;
    int location;
}
