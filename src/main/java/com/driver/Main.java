package com.driver;

public class Main {

    public static class A {


        public String meth(){

            return "Invoking method from class a";
        }
    }

    public static class B extends A{



    }



    public static void main(String[] args) {

          B b = new B();
          System.out.println(b.meth());




    }
  
}