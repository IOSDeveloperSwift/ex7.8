package com.Doloscan;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Point point = new Point();

        Scanner scr = new Scanner(System.in);
        System.out.print("Enter x: ");
        point.x = scr.nextInt();
        System.out.print("Enter y: ");
        point.y = scr.nextInt();

        point.method();


    }
}
