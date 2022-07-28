package com.syntax.class025;

public interface DDR3 {
     void read();
     void write();

}
interface DDR4 extends DDR3{
    void speed();
}

class SamsungRam implements DDR4{


     @Override
     public void read() {
          System.out.println("Reading speed is now 3Gp/s");
     }

     @Override
     public void write() {
          System.out.println("Writing speed is now 3Gp/s");

     }

     @Override
     public void speed() {
          System.out.println("Extra speed is now 3Gp/s");

     }
}