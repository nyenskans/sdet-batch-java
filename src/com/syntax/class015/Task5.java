package com.syntax.class015;

public class Task5 {
    public static void main(String[] args) {

        Task5 createEmail = new Task5();
        System.out.println(createEmail.completeEmail("katarina", "susic", "yahoo"));
        //arguments
    }
    //Create a method createEmail(). Based on values of users name, lastName and email type,
    // your method should return complete email Address. Example:  createEmail(John, Snow, gmail)


    String completeEmail(String firstName, String lastName, String emailType) {
        //parameters
        return firstName + lastName + "@" + emailType + ".com";

    }


}
