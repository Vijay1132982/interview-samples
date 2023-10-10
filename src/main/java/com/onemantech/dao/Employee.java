package com.onemantech.dao;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

  String Name;
  int id;
  String location;
  int Age;
}
