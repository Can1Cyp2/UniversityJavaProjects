package lab2;

/**
 * A random assortment of methods reviewing topics that should improve your
 * programming skills in using Java Control Structures (selection structures,
 * repetition structures, and nested Loops)
 * <p>
 * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
 * strictly forbidden. Violation of this will result in a 70% penalty on your
 * marks. Try to solve this problem using Java Control Structures (selection
 * structures, repetition structures, and nested Loops) only </strong>
 * </p>
 */

public class Utilities {


    private Utilities() {
        // ALREADY IMPLEMENTED; DO NOT MODIFY
    }

    /**
     *
     *   a static method that counts the number of integers between a
     * lower-limit integer and an upper-limit integer. Also, the method computes the
     * sum of all even and odd integers between the lower-limit and upper-limit
     * input values.
     *
     * <p>
     * <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
     * strictly forbidden. Violation of this will result in a 70% penalty on your
     * marks. Try to solve this problem using Java Control Structures (selection
     * structures, repetition structures, and nested Loops) only </strong>
     * </p>
     * <p>Make sure the method compiles without errors and returns the correct result
     *  when invoked.
     * </p>
     * <p>
     * Examples:
     * </p>
     *
     * <pre>
     * if lowerLimit=0 and  upperLimit= 5 then return "6 numbers between 0 and 5: sum of odds (9) and sum of evens (6)"
     * if lowerLimit=10 and  upperLimit= 10 then return "1 number between 10 and 10: sum of odds (0) and sum of evens (10)"
     * if lowerLimit=0 and  upperLimit= 6 then return "7 numbers between 0 and 6: sum of odds (9) and sum of evens (12)"
     * if lowerLimit=7 and  upperLimit= 10 then return "4 numbers between 7 and 10: sum of odds (16) and sum of evens (18)"
     * </pre>
     *<p>
     * Remember that double quotations are shown above to indicate the beginning and
     * end of the string value, and these double quotations are not part of the
     * return value.
     * </p>
     * @param lowerLimit lower limit integer value
     * @param upperLimit upper limit integer value
     * @return String value as shown in the examples above
     *
     * <p>
     *     <strong> Precondition: </strong> lowerLimit and upperLimit are non-negative values
     * </p>
     *
     *
     */

    public static String sumofEvensandOdds(int lowerLimit, int upperLimit) {

        /* Your implementation of this method starts here.
         * Recall that :
         * 1. No System.out.println statements should appear here.
         * 	  Instead, you need to return the result.
         * 2. No Scanner operations should appear here (e.g., input.nextInt()).
         *    Instead, refer to the input parameters of this method.
         */

        int count = 0, evenSum = 0, oddSum = 0; // Counter of numbers between min and max, the sum of even and odd numbers

        // Adds even and odd numbers, and counts up 1 per loop
        for (int x = lowerLimit; x < upperLimit, x++){
            if (x % 2 == 0) {
                evenSum += x;
            }
            else {
                oddSum += x
            }
            count++;
        }

        // make string:
        String result = count + " numbers between " + lowerLimit " and " upperLimit + ": sum of odds (" + oddSum +
            ") and sum of evens (" + evenSum + ")";

        return result;

        /* Your implementation here.    ???^   */
    }


    /**
     * a static method  receives a certain amount of time in seconds and then
     * return a string indicated how many minutes and remaining seconds in the given
     * input
     * <p>
     * Examples:
     * </p>
     *
     * <pre>
     * if seconds=500 then return "500 seconds is (8) minutes and (20) seconds"
     * if seconds=150 then return "150 seconds is (2) minutes and (30) seconds"
     * if seconds=50 then return "50 seconds is (0) minutes and (50) seconds"
     * </pre>
     *
     * <p>
     *  <strong> Use of arrays or any Java library class (e.g., array, ArrayList ) is
     *  strictly forbidden. Violation of this will result in a 70% penalty on your
     *  marks. Try to solve this problem using Java Control Structures (selection
     *  structures, repetition structures, and nested Loops) only </strong>
     * </p>
     *
     * Make sure the method compiles without errors and returns the correct result
     * when invoked.
     *
     *
     *
     * <p>
     * Remember that double quotations are shown above to indicate the beginning and
     * end of the string value, and these double quotations are not part of the
     * return value.
     * </p>
     *
     *
     * @param seconds : int input value
     * @return return the String value as shown in the examples above
     *<p> <strong> Precondition: </strong>  seconds input value is greater than or equals to zero  </p>
     */

    public static String minutesSeconds(int seconds) {

        /* Your implementation of this method starts here.
         * Recall that :
         * 1. No System.out.println statements should appear here.
         * 	  Instead, you need to return the result.
         * 2. No Scanner operations should appear here (e.g., input.nextInt()).
         *    Instead, refer to the input parameters of this method.
         */

        final int MIN = 60; //number of seconds in a minute

        int mins = 0, secs = 0; // The number of minutes and seconds remaining from the initial amount of seconds
        mins = seconds / MIN;   // Calculates minutes
        secs = seconds % MIN;   // Calculates remaining seconds

        // make string:
        String result = seconds + " seconds is (" + mins + ") minutes and (" + secs + ") seconds"

        return result;
        /* Your implementation here. */
    }

    /**
     * a static method to compute the exponent of a fraction number.
     * The method receives numerator, denominator and exponents
     * and then returns a double value representing the value of the given fraction raised to the given exponent.
     * The returned value should be rounded to the nearest millionth
     * <p>
     * Examples:
     * </p>
     *
     * <pre>
     * if numerator=1, denominator = 2  and  exponents= 2 then return 0.25
     * if numerator=2, denominator = 1  and  exponents= -2 then return 0.25
     * if numerator=25, denominator = 35  and  exponents= 3 then return 0.364431
     * </pre>
     *
     * Make sure the method compiles without errors and returns the correct result
     * when invoked.
     *
     * @param numerator integer value
     * @param denominator integer value
     * @param exponent integer value
     * @return a double value representing the value of the given fraction raised to the given exponent.
     *         The returned value should be rounded to the nearest millionth
     */
    public static double fractionExponents(int numerator, int denominator, int exponent ){
        /* Your implementation of this method starts here.
         * Recall that :
         * 1. No System.out.println statements should appear here.
         * 	  Instead, you need to return the result.
         * 2. No Scanner operations should appear here (e.g., input.nextInt()).
         *    Instead, refer to the input parameters of this method.
         */

        double fraction = (double) numerator / (double) denominator;    // Creates fraction from numerator and denominator
        double result = 1; // The result of the fraction to the exponent

        // Puts the fraction to the exponent
        for (int x = 0; x < exponent; x++){
            result *= fraction;
        }

        // Formats the output
        result = format("%.6f", result);

        return result;

        /* Your implementation here. */
    }



    /**
     * a static method takes in two numbers as input arguments: an account
     * balance (rounded to two decimal points) and an annual interest rate expressed
     * as a percentage. The method return double value indicated the balance after five
     * years have elapsed. The return balance after five years should be rounded to
     * two decimal points See examples below. Note that the interest from the first
     * year is added back to the bank balance, therefore, itself subject to
     * interest in the second year, and so on.
     *
     * <p>
     * Examples:
     * </p>
     *
     * <pre>
     * if balance=6000.00 and interest=4.25 then return  7388.08
     * if balance=3000.00 and interest=3.50 then return 3563.06
     * if balance=4000.00 and interest=2.25 then return 4470.71
     * </pre>
     *
     *
     * Make sure the method compiles without errors and returns the correct result
     * when invoked.
     *
     * @param balance   input balance
     * @param interest  an annual interest rate expressed as a percentage. rounded
     *                 to two decimal points
     * @return double value as shown in the examples above
     */

    public static double fiveyearbalance(double balance, double interest) {
        /* Your implementation of this method starts here.
         * Recall that :
         * 1. No System.out.println statements should appear here.
         * 	  Instead, you need to return the result.
         * 2. No Scanner operations should appear here (e.g., input.nextInt()).
         *    Instead, refer to the input parameters of this method.
         */

        final int timePeriod = 5;   // A constant of the number of years the intrest is calculated for

        double result = balance;    // The total amount of balance after interest

        // Calculates the compound interest
        for (int x = 0; x < timePeriod; x++){
            result *= ((interest / 100) + 1);
        }

        // Return result
        return result;
        /* Your implementation here. */
    }

}
