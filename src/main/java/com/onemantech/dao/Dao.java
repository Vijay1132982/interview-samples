package com.onemantech.dao;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dao implements Comparable<Dao>{

    String name;
    int age;




    @Override
    public int compareTo(Dao other) {
        return Integer.compare(this.age, other.age);
    }

}
