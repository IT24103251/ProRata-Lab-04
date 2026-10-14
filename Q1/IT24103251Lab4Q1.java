/* IT24103251 - Lab 4 Question 1
   Program to check whether a number is Positive, Negative or Zero */

import java.util.Scanner;

public class IT24103251Lab4Q1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Enter a number : ");
        num = input.nextInt();

        if (num > 0)
        {
            System.out.println("Number is Positive");
        }
        else if (num < 0)
        {
            System.out.println("Number is Negative");
        }
        else
        {
            System.out.println("Number is Zero");
        }
    }
}