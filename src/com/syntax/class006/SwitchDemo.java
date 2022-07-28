package com.syntax.class006;

public class SwitchDemo {

    public static void main(String[] args) {


        char choice = 'M';

        //Variable and matching cases MUST BE of same type


        String meaning;

        switch (choice) {
            case 'Y':
                meaning = "Yes";
                break;
            case 'M':
                meaning = "Maybe";
                break;
            case 'N':
                meaning = "No";
                break;
            default:
                meaning = "Unknown";
                break;
        }

        System.out.println(meaning);
    }

}
