package com.example.java;
import java.util.Scanner; // Always must remember to import the scanner

public class Main {

    public static void main(String[] args) {

        // Scanner for user input
        Scanner sc = new Scanner(System.in);

        // Counter variable by setting amount_right = 0
        int amount_right = 0;

        // 5 questions, so we will need 5 variables
        String ques1, ques2, ques3, ques4, ques5;

        // Printing out the first question for asking if it is a dog

        System.out.println("What has four paws and barks");

        ques1 = sc.next();  // declared our question here. declared. User input here

        //Since my attempt of having an if, else if 5 times did not work, I made a different attempt for each to have
        // there own separate if and else statement instead of adding an else if.

        if (ques1.equalsIgnoreCase("dog")) { //Here we are using an equals ignore case. If ques one is..

            System.out.println("That is correct");
            amount_right++; //note the counter variable, ++ is incrementing it. If answer wrong, no incrementing

        }  else {
            System.out.println("Sorry. That is not right");// otherwise not right.
        }

        System.out.println("What has four paws and meows");
        ques2 = sc.next();

        if  (ques2.equalsIgnoreCase("cat")) {
            System.out.println("That is correct");

            amount_right++;
        } else {
            System.out.println("Sorry, that is not right");
        }

        System.out.println("What has feathers and chirps");
        ques3 = sc.next();

        if (ques3.equalsIgnoreCase("bird")){
            System.out.println("That is correct");
            amount_right++;

        }

        else{
            System.out.println("Sorry, that is not right");
        }


        System.out.println("what animal is Simba from the lion King");
        ques4 = sc.next();

        if(ques4.equalsIgnoreCase("lion")){
            System.out.println("That is correct");
            amount_right++;

        } else {
            System.out.println("Sorry, that is not right");

        }

        System.out.println("What reptile slithers and does not have arms or legs");

        ques5 = sc.next();

        if (ques5.equalsIgnoreCase("snake")){
            System.out.println("That is correct");
            amount_right++;


        } else {
            System.out.println("Sorry. that is not right");
        }

        // Here we are putting the amount the user got right.
        System.out.println("You scored a " + amount_right + " out of 5");


    }
}