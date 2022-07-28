package com.syntax.class024;

public class DatabaseTester {

    public static void main(String[] args) {
        // we are able to use Polymorphism with abstraction also:
        // As in previous classes we are creating an array of Objects and using for loop to execute all the methods

        Database[] databases ={new Informix(), new MySQLServer()};
        for(Database database:databases){
            database.open();
            database.readData();
            database.writeData();
            database.closeTheDatabase();
        }
     }



}
