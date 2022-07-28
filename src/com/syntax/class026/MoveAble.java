package com.syntax.class026;

public interface MoveAble {
     void move(); // we don't need keywords abstract or public


}
class Car implements MoveAble{ // we get an error until we override the method or declare the class abstract


    @Override // optional annotation
    public void move() {
        System.out.println("A car can move");
    }
    public void park(){
        System.out.println("You can park me");
    }
}
class Person implements MoveAble{

    @Override
    public void move() {
        System.out.println("Humans can also move");
    }
}
class Test{
    public static void main(String[] args) {
        MoveAble moveAble=new Car(); // widening
        moveAble.move();
    //    ((Car)(moveAble)).park(); // narrowing, converting moveable into car object
        Car car=(Car) moveAble;
        ((Car) moveAble).park();
    }

}