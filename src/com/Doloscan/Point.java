package com.Doloscan;

public class Point {


    int x, y;


    void method() {
        if (x > 0 && y > 0) {
            System.out.println("First quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("Second quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("Third quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("Fourth quadrant");
        } else if (y == 0 && x > 0) {
            System.out.println("Positive x-axis");
        } else if (y == 0 && x < 0) {
            System.out.println("Negative x-axis");
        } else if (x == 0 && y > 0) {
            System.out.println("Positive y-axis");
        } else if (x == 0 && y < 0) {
            System.out.println("Negative y-axis");
        } else if (x == 0 && y == 0) {
            System.out.println("At origin");
        } else {
            System.out.println("Error");
        }
    }


}
