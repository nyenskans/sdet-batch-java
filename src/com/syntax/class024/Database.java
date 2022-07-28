package com.syntax.class024;

public abstract class Database { // must add abstract keyword because of abstract methods bellow

    abstract void open(); // method to open database, no body
    abstract void readData(); // method to read data from database, no body
    abstract boolean writeData();
   public void closeTheDatabase(){
       System.out.println("Terminate the connection to close it");
   }

}
class Informix extends Database{ // Informix is database from IBM
                                // error: Class 'Informix' must either be declared abstract or implement abstract method 'open()' in 'Database
// Implement all methods: right click on error --> implement all
    @Override
    void open() {
        System.out.println("Opening the Informix database class");
    }

    @Override
    void readData() {
        System.out.println("Reading data from Informix database");
    }

    @Override
    boolean writeData() {
        System.out.println("Data written successfully");
        return true;
    }
}

// to make sure the databases are compatible with java --> ask java developers to give you an abstract class to implement in order to be compatible
// we implement the abstract methods from that abstract class --> override the methods and now we can use those databases

class MySQLServer extends Database{ // same process as with previous class Informix


// ***When we have an implemented method in parent class and we call it in child class we use keyword super to invoke it
    // In this case of abstract classes and methods we must override them to use them  in our program
    @Override
    void open() {
        System.out.println("Opening the MySQLServer database class");

    }

    @Override
    void readData() {
        System.out.println("Reading data from MySQLServer database");

    }

    @Override
    boolean writeData() {
        System.out.println("Data written successfully");
        return true;
    }
}