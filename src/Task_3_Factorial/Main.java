package Task_3_Factorial;

import java.math.BigInteger;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // variable initialization
        int number = 100;   //factorial of which number will be calculated
        BigInteger factorial = BigInteger.ONE;  //the variable in which the factorial will be written
        int sumFactorialDigits = 0;  //sum of factorial digits
        List<String> numbers;   //an array to write each digit from the factorial

        //cycle for finding factorial
        for(long i = 1; i <= number; ++i)
        {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
//        System.out.printf("Factorial of %d = %d", number, factorial);

        numbers = List.of(String.valueOf(factorial).split("")); //split a number into an array of digits

        //convert the string to a number and sum all the digits of the factorial
        for (String s : numbers) {
            sumFactorialDigits += Integer.parseInt(s);
        }
        System.out.println(sumFactorialDigits); //print the sum of the factorial digits
    }
}
