package com.akshay.allprograms.tables;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which Number of Tables ? :");
        int number = scanner.nextInt();
        int result = 0;

        for (int i = 1; i <= 10; i++){
            result = number * i;
            System.out.println(number + " * " + i + "= " + result );
        }
    }
}
