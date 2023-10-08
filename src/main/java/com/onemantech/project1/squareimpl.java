package com.onemantech.project1;

public class squareimpl {

  //    public int square(int x) {
  //        return x*x;
  //    }

  public static void main(String[] args) {
    square s = (x) -> x * x;
    int result = s.square(5);
    // squareimpl sl = new squareimpl();
    // int result = sl.square(5);
    System.out.println(result);
  }

  public int square(int i) {
    return 0;
  }
}
