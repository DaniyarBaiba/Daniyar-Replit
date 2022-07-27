package com.company;


import java.util.Scanner;

public class Repl223 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.println(j + "");
            }
            System.out.println();
        }
    }
}
    
