package com.syntax.class006;

public class SwitchLimitations {

    public static void main(String[] args) {


        /// Switch has data type limitations


        //Can work with byte, short, int, char, String

        //Cannot work with double, float, long, boolean



        /*
         *  double price=10;
         *  switch(price) {}
         *  error: Cannot switch on a value of type double.
         * 	Only convertible int values, strings or enum variables are permitted
         */

        /*
         * boolean hungry=true;
         * switch(hungry){}
         *
         * 	error: Cannot switch on a value of type boolean.
         * 	Only convertible int values, strings or enum variables are permitted
         */


        //	Switch has operators limitations

        char choice = 'Y';
        String meaning;
        /*
         *	switch(choice) {
         *
         *	case 'Y' || 'y':
         *	meaning="Yes";
         *	break;
         * }
         * error: The operator || is undefined for the argument type(s) char, char
         */

        int day = 5;
        switch (day) {

            /*	we cannot use operators <,> etc
             *
             *case day>5
             *
             */
            // We can use switch to check conditions based on equality-> every case is equal to a certain value


        }


    }

}
