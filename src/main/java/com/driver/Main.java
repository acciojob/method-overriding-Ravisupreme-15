package com.driver;

public class Main {

    public static class A {
        public String meth(){

            return "Invoking method from class Agg";
        }
    }
    public static class B extends A{

      public String meth(){
          return "Method is overridden in Extended class B";
      }

    }
    public static void main(String[] args) {
        // before overiden the method
         B b = new B();
          b.meth();
          // after overiden the method
          B b1 = new B();
          b1.meth();

    }
  
}