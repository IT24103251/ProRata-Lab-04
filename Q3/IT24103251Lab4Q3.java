/* IT24103251 - Lab 4 Question 3
   Positive / Negative / Zero using ternary operator */

import java.util.Scanner;

public class IT24103251Lab4Q3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num;
        String answer;

        System.out.print("Enter a number : ");
        num = input.nextInt();

        // condition ? value if true : value if false (nested)
        answer = (num > 0) ? "Positive" : ((num < 0) ? "Negative" : "Zero");

        System.out.println("Number is " + answer);
    }
}