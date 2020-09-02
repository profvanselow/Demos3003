package io.github.profvanselow;

class Unary {

  public static void unaryDemo() {
    int i = 4;
    System.out.println("i = " + i);
    //int j = i++;
    //i = i++;
    //System.out.println("j = " + j);
    i = ++i;
    System.out.println("i = " + i);
  }
}