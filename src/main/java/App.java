/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 1 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */

import java.util.Scanner;

public class App {
    public static boolean validateDrivingAge(int age) {
        return age >= 16;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;

        System.out.print("What is your age? ");
        age = Integer.parseInt(in.nextLine());

        final String output = validateDrivingAge(age) ? "You are old enough to legally drive"
                                                      : "You are not old enough to legally drive";

        System.out.print(output);
    }
}
