package com.syntax.class016;

public class GoogleEmployees {

    String name;
    // has to be instance because different objects will be holding different values
    double salary;
    static int numOfEmployees; //static because it will always be the same across all objects--> it can change,
    // that has nothing to do with static keyword
    static String companyName = "Google"; // this information will also be same for all the objects

    void displayEmployeeInfo() {
        // if the method is static
//name is instance variable so we can access it in this method
        System.out.println(name + " " + salary + " " + companyName + " " + numOfEmployees);

    }


    public static void main(String[] args) {
        GoogleEmployees emp1 = new GoogleEmployees();
        emp1.name = "Loki Pecikoza";
        emp1.salary = 190000;
        emp1.numOfEmployees = 1;
        //System.out.println(emp1.displayEmployeeInfo()); error because method is void--> can't put it in print out- they don't return anything
        //  instead we have to do it this way:
        emp1.displayEmployeeInfo();

        GoogleEmployees emp2 = new GoogleEmployees();
        emp2.name = "Risko Sibinski";
        emp2.salary = 150000;
        emp2.numOfEmployees = 2;

        System.out.println(emp1.numOfEmployees); //output is 2 even though this object's numOfEmpployees is 1 because it's static
        emp2.displayEmployeeInfo();

    }

}
