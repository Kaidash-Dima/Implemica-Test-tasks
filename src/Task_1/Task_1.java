package Task_1;

import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String arithmeticExpression = "( 128 * ( 34 + 54 ) * ( ( 4 * 5) + 7) * 56 ) + 86";
        String[] arithmeticExpressionArray = arithmeticExpression.split("");
        String inputN;
        int countRoundBrackets;

        int countLeftParenthesis = 0;
        int countRightParenthesis = 0;

        inputN = in.next();

        while (!inputN.matches("\\d+")) {
            System.out.println("You entered a negative number or not a number at all, please enter a positive number");
            inputN = in.next();
        }

        countRoundBrackets = Integer.parseInt(inputN);

        for (String s : arithmeticExpressionArray) {
            if (s.equals(")")) {
                countRightParenthesis++;
            }
            if (s.equals("(")){
                countLeftParenthesis++;
            }
        }

        if (countLeftParenthesis == countRoundBrackets && countRightParenthesis == countRoundBrackets){
            System.out.println(countRoundBrackets);
        }else if (countLeftParenthesis > countRoundBrackets && countRightParenthesis > countRoundBrackets){
            System.out.println(countRoundBrackets);
        }else if (countLeftParenthesis <= countRightParenthesis){
            System.out.println("Max value: " + countLeftParenthesis);
        }else {
            System.out.println("Max value: " + countRightParenthesis);
        }

    }
}
