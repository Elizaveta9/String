package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        lastSimbol(str);
    }

    static void lastSimbol(String str) {
        System.out.println(str.charAt(str.length() - 1));
    }
}

