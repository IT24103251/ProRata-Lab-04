/* IT24103251 - Lab 4 Question 2
   Calculate final mark of a module using exam marks and lab marks */

import java.util.Scanner;

public class IT24103251Lab4Q2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double examMarks, labMarks, examPercentage, labPercentage, finalMark;

        // input and validate exam marks
        System.out.print("Enter exam marks (out of 100) : ");
        examMarks = input.nextDouble();

        if (examMarks < 0 || examMarks > 100)
        {
            System.out.println("Invalid marks! Marks should be between 0 and 100");
        }
        else
        {
            // input and validate lab marks
            System.out.print("Enter lab submission marks (out of 100) : ");
            labMarks = input.nextDouble();

            if (labMarks < 0 || labMarks > 100)
            {
                System.out.println("Invalid marks! Marks should be between 0 and 100");
            }
            else
            {
                // input percentages
                System.out.print("Enter percentage taken from exam mark : ");
                examPercentage = input.nextDouble();

                System.out.print("Enter percentage taken from lab submission mark : ");
                labPercentage = input.nextDouble();

                // validate percentages
                if (examPercentage + labPercentage != 100)
                {
                    System.out.println("Invalid! Percentages must add up to 100");
                }
                else
                {
                    // calculate final mark
                    finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);

                    System.out.println("Final mark of the module : " + finalMark);
                }
            }
        }
    }
}