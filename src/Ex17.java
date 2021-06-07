/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sriharsha Aitharaju
 */
import java.util.*;

public class Ex17
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int gender, oz, weight, hrs;
        double BAC;
        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        gender = kb.nextInt();
        System.out.print("How many ounces of alcohol did you have?");
        oz = kb.nextInt();
        System.out.print("What is your weight, in pounds?");
        weight = kb.nextInt();
        System.out.print("How many hours has it been since your last drink?");
        hrs = kb.nextInt();
        if(gender == 1)
            BAC = (oz * 5.14 / weight * 0.73) - .015 * hrs;
        else{
            BAC = (oz * 5.14 / weight * 0.66) - .015 * hrs;
        }
        System.out.println("Your BAC is " + BAC);
        if(BAC < 0.08)
        {
            System.out.print("It is legal for you to drive.");
        }
        else{
            System.out.print("It is not legal for you to drive.");
        }
    }
}
