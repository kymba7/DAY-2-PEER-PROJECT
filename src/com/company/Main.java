package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String correctPassword = "donuts";

        System.out.println("Welcome,Please enter your password");
        Scanner moomin = new Scanner(System.in);
        String inputfromuser = moomin.nextLine();
        System.out.println("here is your password " + inputfromuser);
        if (correctPassword.equals (inputfromuser)){
            System.out.println("Welcome");

        }



    }
}
