package com.onemantech.project1;

import com.onemantech.dao.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class ComparatorEx {

    public static void main (String[] args)
    {

        List<Employee> employeeList = Arrays.asList(
                new  Employee("Vijay",1260004, "Banglore",29),
                new  Employee("Revathi",1260009, "Chennai",29),
                new  Employee("Ajay",1260001, "Banglore",21),
                new  Employee("Vijay",1260010, "Chennai",48),
                new  Employee("Revathi",1260089, "Delhi",49)
        );

        Collections.sort(employeeList,(a,b)->{
            int compareAge = Integer.compare(a.getAge(),b.getAge());
            if (compareAge!=0)
            {
                return compareAge;
            }
            else {
                return a.getName().compareTo(b.getName());
            }
        } );

         System.out.println(employeeList);
    }

}
