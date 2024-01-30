package com.onemantech.dao;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Macys {

  String Name;
  int id;
  List<String> location;
  int Age;
  int Salary;
}
