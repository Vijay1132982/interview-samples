package com.onemantech.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
public class Employee {

    String Name;
    int id;
    String location;
    int Age;


}
