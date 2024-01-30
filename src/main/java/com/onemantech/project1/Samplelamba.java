package com.onemantech.project1;

import groovy.util.MapEntry;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Samplelamba {
  public static void main(String[] args) {

//Find the non-occurances of a char in string
    String s1 = "vijayaragavendran";

   Map<String,Long> m1=Arrays.stream(s1.split(""))
            .collect(Collectors.groupingBy(a->a,Collectors.counting()));
             System.out.println("no of occurances of a char in string"+m1);
  //Find the duplicate element/Repetitive char in the string

  List<String> m2=  Arrays.stream(s1.split(""))
          .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
          .entrySet()
          .stream().filter(X->X.getValue()>1)
          .map(Map.Entry::getKey)
          .collect(Collectors.toList());

          System.out.println("duplicate/Repetitive char in the string"+m2);
   // non-repetative char/unique elements in string
    List<String> m3=  Arrays.stream(s1.split(""))
            .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
            .entrySet()
            .stream().filter(X->X.getValue()==1)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
    System.out.println("non-repetative char/unique elements in string"+m3);

    // Find the first non repeative element in string
    List<String> m4=  Arrays.stream(s1.split(""))
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                    .entrySet().stream().filter(X->X.getValue()==1).findFirst()
                    .map(Map.Entry::getKey).stream().collect(Collectors.toList());
    System.out.println("Find the first non repeative element in string"+m4);

    // Secong highest number
     int[] a1={9,9,8,7,6,5,7,4,1,12,34,56,78,98};
    Integer l1= Arrays.stream(a1).boxed().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
    System.out.println("Secong highest number"+l1);

      // Longest string in the given array
     String[]s2= {"vijay","Ragavendran","Ajay"};
       String s3 =  Arrays.stream(s2).reduce((x1,x2)->x1.length()>x2.length()?x1:x2).get();
      System.out.println("find " +
              "the long string in ann array " + ""+s3);

      //find the number starts with 1 in the array

      int[] a2={19,119,1118,7,6,5,7,4,1,12,134,56,178,98};

     List<String> s4=Arrays.stream(a2).boxed().map(X->X+"")
              .filter(X->X.startsWith("1")).collect(Collectors.toList());
      System.out.println("Find the number starts with 1"+s4);

     // add delimiters for array

     List<String> s6=Arrays.asList("1","2","3","4","5");
         String s9= String.join("-", s6);
      System.out.println("add delimiters for array "+s9);

      //Skip ,limit

      IntStream.rangeClosed(1,10).skip(1).limit(8).forEach(System.out::println);














  }
}
