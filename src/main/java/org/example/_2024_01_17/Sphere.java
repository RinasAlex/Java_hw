package org.example._2024_01_17;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        double S = (double) (4 * Math.PI * Math.pow(r,2));
        System.out.println(new String("Square = ") + S);
    }
}
