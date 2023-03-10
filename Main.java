package javabasics._5;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
        exercise5Bonus();
        playAroundWithModulus();
    }

    /*
            Remember the symbols you need to do maths are

            Plus = +
            Minus = -
            Multiply or times = *
            Divide = /
     */

    /**
     * 1: Create an int variable, add 1 to the value and then print it. Use the + operator
     * Then minus 1 from the same variable and print it.
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        int variable = 10;
        variable++;
        System.out.println("The value of the variable is: " + variable);
        variable--;
        System.out.println("The value of the variable is: " + variable);
    }

    /**
     * 2: Create a double variable, times by 2 and then print it.
     * <p>
     * Create another double variable, which is the previous variable divided by 2
     * and then print it
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        // Write your code here
        double multi_variable = 4.50;
        System.out.println("The initial variable is: " + multi_variable);
        multi_variable *= 2;
        System.out.println("The double of the variable is: " + multi_variable);
        double half_variable = 6.30;
        System.out.println("The initial variable is: " + half_variable);
        half_variable /= 2;
        System.out.println("The half of the variable is: " + half_variable);
    }

    /**
     * 3: We are going to convert the temperature from Celsius to Fahrenheit
     * <p>
     * Create a double variable called Celsius
     * <p>
     * Create a new variable called Fahrenheit
     * <p>
     * The variable Fahrenheit should be set as
     * Celsius times by 1.8 plus 32
     * <p>
     * Print out Celsius and Fahrenheit with 2 print statements
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // Write your code here
        double celsius = 20;
        double fahrenheit;
        fahrenheit = (celsius * 1.8) + 32;
        System.out.println("The temperature in Celsius is: " + celsius);
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age with a starting value of 10.
     * <p>
     * Only using the '++' operator increase this value to 15
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4:");
        // Write your code here
        int value = 10;
        System.out.println("The value is " + value);
        do
        {
            value++;
        }
        while(value < 15);
        System.out.println("The value is " + value);
    }

    /**
     * 5: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age set as 50
     * <p>
     * Using the -= operator change this value from 50 to 0 in one line of code,
     * <p>
     * Underneath create another int called secondAge set as 50
     * <p>
     * Change this value from 50 to 0 in 3 lines of code
     */
    private static void exercise5Bonus() {
        System.out.println("\nExercise 5:");
        // Write your code here
        int age = 50;
        int changeValue = 50;
        age -= changeValue;
        System.out.println("The age is: " + age);
        int secondAge = 50;
        secondAge = secondAge - 50;
        System.out.println("The second age is: " + secondAge);
    }

    /**
     * This is completely optional, but if you guys want to play around with
     * modulus to get a better understanding. Simply change the code below
     */
    private static void playAroundWithModulus() {
        System.out.println("\nModulus testing!:");

        int value = 22;   // <--- change this value
        int modulus = 4; // <--- and this value to see the results of modulus

        System.out.println("Modulus calculation, " + value + " % " + modulus +
                "=" + value % modulus);
    }

}
