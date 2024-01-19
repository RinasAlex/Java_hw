package org.example._2024_01_17;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int V = (int) Math.pow(a,3);
        System.out.println( new String("Volume = ") + V);
    }
}
